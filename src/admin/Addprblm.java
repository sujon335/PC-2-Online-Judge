/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Addprblm.java
 *
 * Created on Dec 20, 2011, 4:46:51 PM
 */

package admin;

/**
 *
 * @author srs
 */
public class Addprblm extends javax.swing.JFrame {


    java.io.File  tmpfin, tmpfo;
    int pi;
    String pn;
    int t;
    int a=0;
    AdminJFrame fr;

    /** Creates new form Addprblm */
    public Addprblm() {
        pi = -1;
        t = -1;
        initComponents();
    }
    public void Addjframe( AdminJFrame k)
    {
        fr=k;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        prblmid = new javax.swing.JTextField();
        prblmname = new javax.swing.JTextField();
        timelimit = new javax.swing.JTextField();
        ifdirectory = new javax.swing.JTextField();
        ofdirectory = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ifbrowser = new javax.swing.JButton();
        ofbrowser = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        addp = new javax.swing.JButton();
        cancel = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        prblmid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prblmidActionPerformed(evt);
            }
        });

        prblmname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prblmnameActionPerformed(evt);
            }
        });

        timelimit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timelimitActionPerformed(evt);
            }
        });

        ifdirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ifdirectoryActionPerformed(evt);
            }
        });

        ofdirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ofdirectoryActionPerformed(evt);
            }
        });

        jLabel2.setText("Prblm ID:");

        jLabel3.setText("Prblm Name:");

        jLabel4.setText("Time Limit:");

        jLabel5.setText("Input data file:");

        jLabel6.setText("Output data file:");

        ifbrowser.setText("Browse");
        ifbrowser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ifbrowserActionPerformed(evt);
            }
        });

        ofbrowser.setText("Browse");
        ofbrowser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ofbrowserActionPerformed(evt);
            }
        });

        jLabel7.setText("Seconds");

        jLabel8.setText("ADD PROBLEM");

        addp.setText("ADD");
        addp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addpActionPerformed(evt);
            }
        });

        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                .addGap(1, 1, 1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(prblmid, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(timelimit, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(prblmname, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(218, 218, 218))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(ifdirectory))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(ofdirectory, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ifbrowser)
                    .addComponent(ofbrowser))
                .addContainerGap(127, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(281, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(cancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 229, Short.MAX_VALUE)
                .addComponent(addp)
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prblmid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(prblmname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(timelimit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ifdirectory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ifbrowser))
                .addGap(22, 22, 22)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ofdirectory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ofbrowser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addp)
                    .addComponent(cancel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ofdirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ofdirectoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ofdirectoryActionPerformed

    private void ifdirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ifdirectoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ifdirectoryActionPerformed

    private void addpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addpActionPerformed

        pn=prblmname.getText();
        String s1=prblmid.getText();
         if(s1!=null) pi=Integer.parseInt(s1);
         String s=timelimit.getText();
         if(s!=null)
        t=Integer.parseInt(s);


        if(t==-1||pi ==-1 || tmpfin==null || tmpfo== null || pn ==null)
            javax.swing.JOptionPane.showMessageDialog(null, "Please give info!!");
        else{
            
            fr.pids[pi-1]= pi;
            fr.pnames[pi] = pn;
            AdminJFrame.f[pi]=tmpfin;
            AdminJFrame.of[pi]=tmpfo;
            fr.times[pi]=t;
            prblemadding p=new prblemadding(fr,pi,this);
            p.addp();
            fr.prblemaddingsuccess.setVisible(true);
            fr.p1id.setVisible(true);
            fr.p1n.setVisible(true);
            fr.p1tl.setVisible(true);
            this.setVisible(false);
          
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_addpActionPerformed

    private void prblmnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prblmnameActionPerformed

    }//GEN-LAST:event_prblmnameActionPerformed

    private void prblmidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prblmidActionPerformed

    }//GEN-LAST:event_prblmidActionPerformed

    private void timelimitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timelimitActionPerformed

    }//GEN-LAST:event_timelimitActionPerformed

    private void ifbrowserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ifbrowserActionPerformed
    javax.swing.JFileChooser jfc = new javax.swing.JFileChooser();
     int returnVal1 = jfc.showOpenDialog(this);
    if (returnVal1 == javax.swing.JFileChooser.APPROVE_OPTION) {
                tmpfin = jfc.getSelectedFile();
            }
            ifdirectory.setText(tmpfin.toString());
        // TODO add your handling code here:
    }//GEN-LAST:event_ifbrowserActionPerformed

    private void ofbrowserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ofbrowserActionPerformed

    javax.swing.JFileChooser jfc = new javax.swing.JFileChooser();
     int returnVal1 = jfc.showOpenDialog(this);
    if (returnVal1 == javax.swing.JFileChooser.APPROVE_OPTION) {
                tmpfo = jfc.getSelectedFile();
            }
            ofdirectory.setText(tmpfo.toString());

        // TODO add your handling code here:
    }//GEN-LAST:event_ofbrowserActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Addprblm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addp;
    private javax.swing.JButton cancel;
    private javax.swing.JButton ifbrowser;
    private javax.swing.JTextField ifdirectory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton ofbrowser;
    private javax.swing.JTextField ofdirectory;
    public javax.swing.JTextField prblmid;
    private javax.swing.JTextField prblmname;
    private javax.swing.JTextField timelimit;
    // End of variables declaration//GEN-END:variables

}