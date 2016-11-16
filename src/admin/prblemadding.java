/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package admin;

/**
 *
 * @author srs
 */
public class prblemadding{

    AdminJFrame fo;
    Addprblm m;
    int a;
    String s1="";
    String s2="";
    prblemadding(AdminJFrame k,int i,Addprblm q)
    {
        fo=k;
        a=i;
        m=q;
    }
    public void addp()
    {
        s1=m.prblmid.getText();
        s2=String.valueOf(fo.times[a]);

        fo.p1id.setText(s1);
        fo.p1n.setText(fo.pnames[a]);
        fo.p1tl.setText(s2);
    }
    

}
