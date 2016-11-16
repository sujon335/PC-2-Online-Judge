/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package admin;
import java.util.TimerTask;
/**
 *
 * @author srs
 */
public class Task extends TimerTask {

    AdminJFrame f;
    int d=0;
Task(AdminJFrame k,int m) {
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


        AdminJFrame f;
        int c;
    Task1(AdminJFrame k,int m) {
        f=k;
        c=m-1;
    }
    public String m=null;

            public void run() {
                if(c==-1)
                {
                    javax.swing.JOptionPane.showMessageDialog(null,"Contest time has been finished");
                    return;
                }
                m=String.valueOf(c);
                 f.min.setText(m);
                c--;
        }

}

 