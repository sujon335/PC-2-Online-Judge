/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;
import java.io.*;

/**
 *
 * @author ctg
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        NewJFrame2 frm = new NewJFrame2();

        Team t1;
        t1 = new Team( "127.0.0.2",frm );

        frm.setTeam(t1);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
             
     t1.start();
  

    }



}


