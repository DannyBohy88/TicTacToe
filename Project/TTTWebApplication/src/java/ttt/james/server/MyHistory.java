/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ttt.james.server;

import java.util.ArrayList;
import static ttt.james.server.Leaderboard.users;
import static ttt.james.server.Leaderboard.ws;

/**
 *
 * @author New User
 */
public class MyHistory extends javax.swing.JFrame {
     public static TTTWebService ws;
     public static int currentID;
     public static String currentUsername;
     public static ArrayList<User> users;
    /**
     * Creates new form MyHistory
     */
    public MyHistory() {
        initComponents();
        ws = new TTTWebService();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        myHistory_historyTbl = new javax.swing.JTable();
        myhistory_MessageLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Your history");

        myHistory_historyTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Wins", "Losses", "Draws"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(myHistory_historyTbl);
        if (myHistory_historyTbl.getColumnModel().getColumnCount() > 0) {
            myHistory_historyTbl.getColumnModel().getColumn(0).setResizable(false);
            myHistory_historyTbl.getColumnModel().getColumn(1).setResizable(false);
            myHistory_historyTbl.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(15, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(myhistory_MessageLbl))
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(myhistory_MessageLbl)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MyHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyHistory().setVisible(true);
            }
        });
    }
    public void setCred ( int _id , String _uname){
        currentID = _id;
        currentUsername = _uname;
        initTable();
    }
    private void initTable(){
    User u = new User(currentUsername);
    String res [] = ws.leagueTable().split("\n");
    ArrayList<String>myRes = new ArrayList<>();
        for(int i = 0; i < res.length ; i++){
            String parse [] = res[i].split(",");
            if(parse[1].matches(currentUsername) || parse[2].matches(currentUsername)){
                myRes.add(res[i]);
            }    
        }
    
    for( String s : myRes){
        String parse[] = s.split(",");
        int gameRes = Integer.parseInt(parse[3]);
        int yourID =0;
        if(parse[1].matches(currentUsername)){ yourID = 1;} 
        else if(parse[2].matches(currentUsername)){ yourID = 2;} 
        if(gameRes == 1 && yourID ==1)
            u.addWin();
        else if (gameRes == 1 && yourID ==2)
            u.addLoss();
        else if (gameRes == 2 && yourID ==2)
            u.addWin();
        else if (gameRes == 2 && yourID ==1)
            u.addLoss();
        else if (gameRes == 3)
            u.addDraw();
    }
        myHistory_historyTbl.setValueAt(u.getWins(),0,0);
        myHistory_historyTbl.setValueAt(u.getLosses(),0,1);
        myHistory_historyTbl.setValueAt(u.getDraws(),0,2);
    
            //myHistory_historyTbl.setValueAt(users.get(findUser(currentUsername)).getWins(),0,0);
          
            
          
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable myHistory_historyTbl;
    private javax.swing.JLabel myhistory_MessageLbl;
    // End of variables declaration//GEN-END:variables
}
