/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Client;
import java.io.IOException;
import java.util.TimerTask;

/**
 *
 * @author srs
 */
public class Task extends TimerTask {

    NewJFrame2 f;
    int d=0;
Task(NewJFrame2 k,int m) {
     d=m;
    f=k;
}
    public String s=null;
    int i=59;
    int e=0;

            public void run() {
                 if(i==-1)
                 {
                     e++;
                     i = 59;
                }
                 if(e==d) return;

                s=String.valueOf(i);
                f.sec.setText(s);
                i--;
        }

}

 class Task1 extends TimerTask {


        NewJFrame2 f;
        int c;
        Team t;
    Task1(NewJFrame2 k,int m,Team l) {
        f=k;
        c=m-1;
        t=l;
    }
    public String m=null;

            public void run() {
                if(c==-1)
                {
                    javax.swing.JOptionPane.showMessageDialog(null,"Contest time has been finished");
                    try {
                        t.closeConnection();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    return;
                }
                m=String.valueOf(c);
                 f.min.setText(m);
                c--;
        }

}

 