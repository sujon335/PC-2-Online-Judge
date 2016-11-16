/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package admin;


import Client.Data;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
/**
 *
 * @author srs
 */
public class SERVER {

    private ServerSocket server;
    private Socket sock;
    AdminJFrame f;
    ArrayList<Threadhandler> T;
   

    SERVER(AdminJFrame fr) {
     f=fr;
     T = new ArrayList();
    }


    public void runserver() throws IOException
    {
        server=new ServerSocket(12345);
        while(true)
        {
            sock=server.accept();
            Threadhandler tmp = new Threadhandler(sock,f,this,T.size());
            T.add(tmp);
            tmp.start();
        }
        
    }

    synchronized void sendToAll(String msg){
        for(int i=0;i<T.size();i++){
            T.get(i).sendData(msg);
        }
    }

        synchronized void sendtimelimitToAll(int time){
        for(int i=0;i<T.size();i++){
            T.get(i).sendtimelimit(time);
        }
    }
            synchronized void sendproblemToALL(pn se){
        for(int i=0;i<T.size();i++){
            T.get(i).sendproblem(se);
        }
    }

    
    synchronized void sendToAll(String msg,int index){
        for(int i=0;i<T.size();i++){
            if(i==index) continue;
            T.get(i).sendData(msg);
        }
    }



}



class Threadhandler extends Thread{

    private ObjectOutputStream output;
    private ObjectInputStream input;
    private Socket connection;
    private String message = "";
    AdminJFrame f2;
    SERVER ser;
    int index,i=0;
    int com=0;
    Object o;
    static String tname="a";
    static int pi;
    static String tpass="b";
    static String plang="c";
    static String code="d";
   static String report="Name and password is invalid";

    Threadhandler(Socket sock,AdminJFrame a,SERVER s, int in) {
        f2=a;
        connection=sock;
        ser=s;
        index= in;
    }
    
    public void run()
    {
        try{
              getStreams();
            try {
                getinput();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }

        }

        catch ( IOException ioException )
        {
            ioException.printStackTrace();

        }
    }
    
    
    
    private void getStreams() throws IOException
    {
        output = new ObjectOutputStream(  connection.getOutputStream() );
        
        output.flush(); // flush output buffer to send header information
        input = new ObjectInputStream(  connection.getInputStream() );
    }
    
    public void closeConnection()throws IOException
    {
            output.close();
            input.close();
            connection .close();
    }


    public void sendData( String message )  //msg pathai frm team
    {
        try
        {
            output.writeObject( "Admin:" + message );
            output.flush();
        }
        catch ( IOException ioException )
        {
            ioException.printStackTrace();

        }
    }


    public void sendtimelimit(int t)
    {
        try {
            output.writeObject(t);
            output.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }
    
    
        public void sendproblem(pn a)
    {
        try {
            output.writeObject(a);      
            output.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }


    public void getinput() throws IOException, ClassNotFoundException
    {
        do{
            
            o = input.readObject();

            if(o instanceof String )
            {
                    
                        
                       message = o.toString();
                      f2.displayMessage( "\n" + message );
                      ser.sendToAll(message,index);
                         
            }
            
             else 
            {
                Data d=(Data)o;
                tname=d.Name;
                tpass=d.pass;

                for(int v=0;v<=5;v++)
                {
                    if(AdminJFrame.tn[v].compareTo(tname)==0)
                    {
                        if(AdminJFrame.tp[v].compareTo(tpass)==0)
                        {
                            com = 5;
                        }
                        break;
                    }
                }
                
                pi=d.prbid;
                plang=d.lang;
                code=d.filedata;
                String p=String.valueOf(pi);
                if(com==5)
                {
                
                String fn=tname+p+"."+plang;
                String ab=tname+f2.pnames[pi];
                String fdir="";
                fdir=AdminJFrame.f[pi].getParent();
                File f=new File(fdir+"/"+fn);
                FileWriter out = new FileWriter(f);
                out.write(code);
                out.close();

                Judging j=new Judging(f,AdminJFrame.f[pi],AdminJFrame.of[pi],AdminJFrame.times[pi],ab);
                
                j.d();
               report= j.execute();
              
                }

               this.sendData(report);

            }

     }while ( true );

      


    }
             






    
}





