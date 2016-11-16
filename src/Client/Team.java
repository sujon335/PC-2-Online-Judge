/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Client;
import admin.pn;
import java.util.Timer;
import java.io.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import javax.swing.*;




public class Team extends Thread{
    private ObjectOutputStream output;
    private ObjectInputStream input;
    private String chatServer;
    private Socket client;
    private String message = "";
    NewJFrame2 f2;
    Object o;
    int timelimit=0;
    String[] b;

    
    public Team( String host ,NewJFrame2 x){
        chatServer = host;
        f2 =x;

    }
    public void run()
    {
       try{
          connectToServer();
          getStreams();
          getdata();

        }

        catch ( IOException ioException )
        {
            ioException.printStackTrace();

        }

    }

    private void connectToServer() throws IOException
    {

        client = new Socket( InetAddress.getByName( chatServer ), 12345 );

    }

    private void getStreams() throws IOException
    {
        output = new ObjectOutputStream( client.getOutputStream() );
        
        output.flush(); // flush output buffer to send header information
        input = new ObjectInputStream( client.getInputStream() );
    }

    public void closeConnection()throws IOException
    {
            output.close();
            input.close();
            client.close();
    }




    public void getdata() throws IOException         //input nei msg
    {
        do
        {
            try {
                o = input.readObject();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
 
            if(o instanceof String )
            {
                 message = o.toString();
                 if(message.compareTo("Admin:contest started")==0)
                 {
                     starttime();
                 }
                f2.displayMessage( "\n" + message );


             }
            else if(o instanceof pn)
            {
                pn c=(pn)o;
                    b=c.k;
                setcombobox(b);
            }
            else
            {
                String sa=o.toString();
                timelimit=Integer.parseInt(sa);
            }

        }while (true);

    }



    
    public void sendData ( String message )  //msg pathai frm team
    {
        try
        {
            output.writeObject( message );
            output.flush();
            
           
            f2.displayMessage( "\n " + message );
        }
        catch ( IOException ioException )
        {
            ioException.printStackTrace();

        }
    }


    public void process() throws Exception{

          Data d=new Data(f2);
          output.writeObject(d);
          output.flush();

    }


    public void starttime()
    {
        Timer timer1 = new Timer();
        Timer timer2=new Timer();

        long delay1 = 1*1000;
        long delay2=60*1000;

        timer1.schedule(new Task(f2,timelimit), 0, delay1);
        timer2.schedule(new Task1(f2,timelimit,this), 0, delay2);

    }
    public void setcombobox(String[] k)
    {
        f2.prblm.removeAllItems();
        f2.prblm.setModel(new DefaultComboBoxModel(k));
    }








 


}
