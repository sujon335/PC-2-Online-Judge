
package admin;

import java.io.*;
import java.io.File;
import java.io.FileWriter;


public class Judging {

    File codefile;
    File batfile;
    File inputf;
    File outputf;
    int tl;
    String n;
    Judging(File c,File i,File o,int t,String a)
    {
        codefile=c;
        inputf=i;
        outputf=o;
        tl=t;
        n=a;
    }
String in_dir="";
String out_dir="";
String in_name="";
String out_name="";
String cf_name="";
String bat_string="";
String Status="result can't be found";


    public void d() throws IOException{
    in_dir=inputf.getParent();
    out_dir=outputf.getParent();
    in_name=inputf.getName();
    out_name=outputf.getName();
    cf_name=codefile.getName();

    batfile=new File(in_dir+"/"+"run"+".bat");

    FileWriter bt =new FileWriter(batfile);

    bat_string="@echo off\r\n"
            +"call gcc -o "+in_dir+"/"+n+".exe "+in_dir+"/"+cf_name+"\r\n"
            +"call "+in_dir+"/"+n+".exe<"+in_dir+"/"+in_name+">"+in_dir+"/"+n+".txt"+"\r\n"
            +"call fc "+in_dir+"\\"+out_name+" "+in_dir+"\\"+n+".txt\r\n"
            +"call pause";

    bt.write(bat_string);
    bt.close();

    }

    public String execute()
    {
        try{
        String line;
        long startTime = System.nanoTime();
        Process p = Runtime.getRuntime().exec(in_dir+"/run.bat");

         long estimatedTime = System.nanoTime() - startTime;
         long extime=estimatedTime/1000000; //milisec
         long executiontime=extime/1000;//sec;
        BufferedReader rin = new BufferedReader(new InputStreamReader(p.getErrorStream()));
        String err = rin.readLine();
        System.out.println("err "+err);
        BufferedReader input =
 	new BufferedReader
 	(new InputStreamReader(p.getInputStream()));
         	while ((line = input.readLine()) != null) {
 		System.out.println(line);

                if(line.contains("FC: no differences encountered"))
                {
                    if(executiontime>tl) {
                        Status ="Time limit exceeded";
                        break;
                    }

                    else {
                        Status = "Accepted";
                        break;
                    }
                }
                else if(line.contains("*****"))
                {
                    Status ="Wrong Answer";
                    break;
                }

 	}

        if((new File(in_dir+"\\"+n+".txt")).length()==0)
            Status ="Compilation error";

        input.close();
    }
        catch (Exception err) {
 	err.printStackTrace();
        }
        
        return Status;
    }




}
