/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ttt.james.server;

import javax.swing.JButton;

/**
 *
 * @author New User
 */
public class TTT extends javax.swing.JFrame {
    private int currentID;
    private String currentUsername;
    private int gameID;
    private boolean asleep = false;
    private int playerToStart =0;
    private boolean gameOver = false;
    public static TTTWebService ws;
    /**
     * Creates new form TTT
     */
    class myThread extends Thread{
        
        @Override
        public void run(){
            while(true){
                if(!gameOver)
                    initBoard();
               
            try{
                
                sleep(1000);
                if(!gameOver)
                    initBoard();
   
            }catch(Exception e){
            
            }
            }
        }
    }
    public TTT() {
        initComponents();
        ws = new TTTWebService();
        myThread t = new myThread();
        t.start();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        game_btn2 = new javax.swing.JButton();
        game_btn0 = new javax.swing.JButton();
        game_btn1 = new javax.swing.JButton();
        game_btn3 = new javax.swing.JButton();
        game_btn4 = new javax.swing.JButton();
        game_btn6 = new javax.swing.JButton();
        game_btn7 = new javax.swing.JButton();
        game_btn5 = new javax.swing.JButton();
        game_btn8 = new javax.swing.JButton();
        squareChose_lbl = new javax.swing.JLabel();
        takeTurn_btn = new javax.swing.JButton();
        gameTitle_lbl = new javax.swing.JLabel();
        currentStatus_lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        game_btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                game_btn2ActionPerformed(evt);
            }
        });

        game_btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                game_btn0ActionPerformed(evt);
            }
        });

        game_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                game_btn1ActionPerformed(evt);
            }
        });

        game_btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                game_btn3ActionPerformed(evt);
            }
        });

        game_btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                game_btn4ActionPerformed(evt);
            }
        });

        game_btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                game_btn6ActionPerformed(evt);
            }
        });

        game_btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                game_btn7ActionPerformed(evt);
            }
        });

        game_btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                game_btn5ActionPerformed(evt);
            }
        });

        game_btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                game_btn8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(game_btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(game_btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(game_btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(game_btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(game_btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(game_btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(game_btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(game_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(game_btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(game_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(game_btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(game_btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(game_btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(game_btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(game_btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(game_btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(game_btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(game_btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        takeTurn_btn.setText("Take Turn");
        takeTurn_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                takeTurn_btnActionPerformed(evt);
            }
        });

        gameTitle_lbl.setText("Game ID:");

        currentStatus_lbl.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150)
                        .addComponent(squareChose_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addComponent(takeTurn_btn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(366, 366, 366)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(currentStatus_lbl)
                            .addComponent(gameTitle_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gameTitle_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(currentStatus_lbl)
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(takeTurn_btn)
                .addGap(136, 136, 136))
            .addGroup(layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(squareChose_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void game_btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_game_btn2ActionPerformed
        // TODO add your handling code here:
        squareChose_lbl.setText("0,2");
    }//GEN-LAST:event_game_btn2ActionPerformed

    private void game_btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_game_btn0ActionPerformed
        // TODO add your handling code here:
        squareChose_lbl.setText("0,0");
        
    }//GEN-LAST:event_game_btn0ActionPerformed

    private void game_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_game_btn1ActionPerformed
        // TODO add your handling code here:
        squareChose_lbl.setText("0,1");
    }//GEN-LAST:event_game_btn1ActionPerformed

    private void game_btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_game_btn3ActionPerformed
        // TODO add your handling code here:
        squareChose_lbl.setText("1,0");
    }//GEN-LAST:event_game_btn3ActionPerformed

    private void game_btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_game_btn4ActionPerformed
        // TODO add your handling code here:
        squareChose_lbl.setText("1,1");
    }//GEN-LAST:event_game_btn4ActionPerformed

    private void game_btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_game_btn5ActionPerformed
        // TODO add your handling code here:
        squareChose_lbl.setText("1,2");
    }//GEN-LAST:event_game_btn5ActionPerformed

    private void game_btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_game_btn6ActionPerformed
        // TODO add your handling code here:
        squareChose_lbl.setText("2,0");
    }//GEN-LAST:event_game_btn6ActionPerformed

    private void game_btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_game_btn7ActionPerformed
        // TODO add your handling code here:
        squareChose_lbl.setText("2,1");
    }//GEN-LAST:event_game_btn7ActionPerformed

    private void game_btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_game_btn8ActionPerformed
        // TODO add your handling code here:
        squareChose_lbl.setText("2,2");
    }//GEN-LAST:event_game_btn8ActionPerformed

    private void takeTurn_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_takeTurn_btnActionPerformed
        // TODO add your handling code here:
        String str [] = squareChose_lbl.getText().split(",");
        int x = Integer.parseInt(str[0]);
        int y = Integer.parseInt(str[1]);
        ws.takeSquare(x, y, gameID, currentID);
        checkWin();
        initBoard();
    }//GEN-LAST:event_takeTurn_btnActionPerformed
    public void setInfo( int _id , String _username , int _gameID){
        currentID = _id;
        currentUsername = _username;
        gameID = _gameID;
        gameTitle_lbl.setText(gameTitle_lbl.getText() + " " + gameID);
        java.util.Random rand = new java.util.Random();
        playerToStart = rand.nextInt(2)+1;
        
        initBoard();
        
    }
    public void checkWin(){
            String res = ws.checkWin(gameID);
            if(res.matches("1")){
                currentStatus_lbl.setText("This game is over, Player 1 is the winner");
                ws.setGameState(gameID, 1);
                takeTurn_btn.setEnabled(false);
                gameOver = true;
            }else  if(res.matches("2")){
                currentStatus_lbl.setText("This game is over, Player 2 is the winner");
                ws.setGameState(gameID, 2);
                gameOver = true;
                takeTurn_btn.setEnabled(false);
            }else if(res.matches("3")){
                currentStatus_lbl.setText("This game is over, it ended in a draw");
                ws.setGameState(gameID, 3);
                gameOver = true;
                takeTurn_btn.setEnabled(false);
            }

    }
    public void initBoard(){
        JButton btns [][] = new JButton[3][3];
        btns[0][0] = game_btn0;
        btns[0][1] = game_btn1;
        btns[0][2] = game_btn2;
        btns[1][0] = game_btn3;
        btns[1][1] = game_btn4;
        btns[1][2] = game_btn5;
        btns[2][0] = game_btn6;
        btns[2][1] = game_btn7;
        btns[2][2] = game_btn8;
        
        
        int board [][] = new int [3][3];
        
        String res [] = ws.getBoard(gameID).split("\n");
        int playerTurn = currentID;
        if(!res[0].matches("ERROR-NOMOVES")){
            for( int i = 0; i < res.length ; i++){
                String parse []= res[i].split(",");
                int x = Integer.parseInt(parse[1]);
                int y = Integer.parseInt(parse[2]);
                board[x][y] = Integer.parseInt(parse[0]);
                playerTurn = Integer.parseInt(parse[0]);
            }
            if(playerTurn == currentID || playerToStart == currentID){
                takeTurn_btn.setEnabled(false);
            }else{
                 takeTurn_btn.setEnabled(true);
            }
            checkWin();
        }
        for(int i = 0 ; i < 3 ; i++)
            for(int j = 0 ; j < 3 ; j++){
            if(board[i][j] == currentID){
                btns[i][j].setText("X");
                btns[i][j].setEnabled(false);
            }else if(board[i][j] != currentID && board[i][j]!=0){
                btns[i][j].setText("0");
                btns[i][j].setEnabled(false);
            }
        }
        
        
    }
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
            java.util.logging.Logger.getLogger(TTT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TTT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TTT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TTT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                    new TTT().setVisible(true);
  
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel currentStatus_lbl;
    private javax.swing.JLabel gameTitle_lbl;
    private javax.swing.JButton game_btn0;
    private javax.swing.JButton game_btn1;
    private javax.swing.JButton game_btn2;
    private javax.swing.JButton game_btn3;
    private javax.swing.JButton game_btn4;
    private javax.swing.JButton game_btn5;
    private javax.swing.JButton game_btn6;
    private javax.swing.JButton game_btn7;
    private javax.swing.JButton game_btn8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel squareChose_lbl;
    private javax.swing.JButton takeTurn_btn;
    // End of variables declaration//GEN-END:variables
}
