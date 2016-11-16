/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package admin;
import java.io.*;
/**
 *
 * @author srs
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
 

            AdminJFrame fr=new AdminJFrame();

            SERVER se;
            se=new SERVER(fr);

            fr.setserver(se);
            fr.setVisible(true);
            fr.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);        

            se.runserver();
        // TODO code application logic here
    }

}
