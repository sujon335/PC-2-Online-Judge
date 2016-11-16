/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Client;
import java.io.*;

/**
 *
 * @author srs
 */
public class Data implements Serializable {

    public String Name;
     public String pass;
    public int  prbid;
    public  String lang;
     public String filedata;
   Data(NewJFrame2 f3)
    {
        Name=f3.n;
        pass=f3.p;
        prbid=f3.pn;
        lang=f3.l;
        filedata=f3.fd;
    }
  
}
