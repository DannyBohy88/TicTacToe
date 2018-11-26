package ttt.james.server;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author New User
 */

public class TicTacToe {
    public static String currentUsername;
    // Windows
        public static ArrayList<JFrame> windows; // 1 = Main Menu 2 = Register Window
    // Panels
        // Main Window
        public static JPanel mw_panel;
        // Register Winoow
        public static JPanel rw_panel;
        // Game Window
        public static JPanel gw_panel;
        // Show Games Window
        public static JPanel sgw_panel;
    // Labels
        // Main Window
        //ArrayList<JLabel> mw_labels; // 
        public static JLabel mw_loginTitleLbl;
        public static JLabel mw_messageLbl;
        public static JLabel mw_usernameLbl;
        public static JLabel mw_passwordLbl;
        //Register Window
        public static JLabel rw_usernameLbl;
        public static JLabel rw_passwordLbl;
        public static JLabel rw_forenameLbl;
        public static JLabel rw_surnameLbl;
        public static JLabel rw_messageLbl;    
        // Game Window
        public static JLabel gw_usernameLbl;
        public static JLabel gw_historyTitleLbl;
        public static JLabel gw_historyContentLbl;
    // Buttons
        //Main Window
        public static JButton mw_loginBtn;
        public static JButton mw_registerBtn;
        public static JButton mw_clearBtn;
        //Register Window
        public static JButton rw_confirmBtn;
        public static JButton rw_clearBtn;
        public static JButton rw_backBtn;
        // Game Window
        public static JButton gw_findgameBtn;
        public static JButton gw_hostgameBtn;
        public static JButton gw_logoutBtn;
    //Textfields
        // Main Window
        public static JTextField mw_usernameTF;
        public static JTextField mw_passwordTF;
        
        // Register Window
        public static JTextField rw_usernameTF;
        public static JTextField rw_passwordTF;
        public static JTextField rw_forenameTF;
         public static JTextField rw_surnameTF;
        // Show Games Window
        public static JTable sgw_openGameTBL;
        public static ActionL al;
        public static TTTWebService webService;
    public static void main( String srgs [] ){
        al = new ActionL();
        webService = new TTTWebService();
        
        initWindows();
    }
    public static void showWindow( int index){
        for( int i = 0 ; i < windows.size() ; i++ ){
            if(i != index){
                windows.get(i).setVisible(false);
                clearWindowText();
            }else {
                windows.get(i).setVisible(true);
            }
        }
    }
    public static void initWindows(){
       windows = new ArrayList<>();
       windows.add(new JFrame());
        mw_loginTitleLbl = new JLabel("Welcome to tic tac toe");
        mw_messageLbl = new JLabel("");
        mw_usernameLbl = new JLabel("Username");
        mw_passwordLbl = new JLabel("Password");
        mw_usernameTF = new JTextField();
        mw_passwordTF = new JTextField();
        mw_loginBtn = new JButton("Login");
        mw_loginBtn.addActionListener(al);
        mw_registerBtn = new JButton("Register");
        mw_registerBtn.addActionListener(al);
        mw_clearBtn = new JButton("Clear");
        mw_clearBtn.addActionListener(al);
        mw_panel = new JPanel();
        mw_panel.setLayout(new GridLayout(7,1));
        mw_panel.add(mw_loginTitleLbl);
        mw_panel.add(mw_messageLbl);
        mw_panel.add(mw_usernameLbl);
        mw_panel.add(mw_usernameTF);
        mw_panel.add(mw_passwordLbl);
        mw_panel.add(mw_passwordTF);
        mw_panel.add(mw_loginBtn);
        mw_panel.add(mw_registerBtn);
        windows.get(0).add(mw_panel);
       windows.add(new JFrame());
       // Register Window
        rw_messageLbl = new JLabel("Register New User");
        rw_usernameLbl = new JLabel("Username");
        rw_passwordLbl = new JLabel("Password");
        rw_forenameLbl = new JLabel("FirstName");
        rw_surnameLbl = new JLabel("Surname");
        rw_usernameTF = new JTextField();
        rw_passwordTF = new JTextField();
        rw_forenameTF = new JTextField();
        rw_surnameTF = new JTextField();
        rw_confirmBtn = new JButton("Confirm");
        rw_clearBtn = new JButton("Clear");
        rw_backBtn = new JButton("Back");
        rw_confirmBtn.addActionListener(al);
        rw_clearBtn.addActionListener(al);
        rw_backBtn.addActionListener(al);
        rw_panel = new JPanel();
        rw_panel.setLayout(new GridLayout(7,1));
        rw_panel.add(rw_usernameLbl);
        rw_panel.add(rw_usernameTF);
        rw_panel.add(rw_passwordLbl);
        rw_panel.add(rw_passwordTF);
        rw_panel.add(rw_forenameLbl);
        rw_panel.add(rw_forenameTF);
        rw_panel.add(rw_surnameLbl);
        rw_panel.add(rw_surnameTF);
        rw_panel.add(rw_confirmBtn);
        rw_panel.add(rw_clearBtn);
        rw_panel.add(rw_backBtn);
       windows.get(1).add(rw_panel);
       windows.get(1).setTitle("Register User");
       showWindow(0);
       windows.add(new JFrame());
       windows.get(2).setTitle("Lobby");
        gw_usernameLbl = new JLabel(currentUsername);
        gw_historyTitleLbl = new JLabel("History:  W   L   D ");
        gw_historyContentLbl = new JLabel("        0  0   0 ");
        gw_findgameBtn = new JButton("Find Game");
        gw_hostgameBtn = new JButton("Host Game");
        gw_logoutBtn = new JButton("Logout");
        gw_findgameBtn.addActionListener(al);
        gw_hostgameBtn.addActionListener(al);
        gw_logoutBtn.addActionListener(al);
        gw_panel = new JPanel();
        gw_panel.setLayout(new GridLayout(7,1));
        gw_panel.add(gw_usernameLbl);
        gw_panel.add(gw_historyTitleLbl);
        gw_panel.add(gw_historyContentLbl);
        gw_panel.add(gw_findgameBtn);
        gw_panel.add(gw_hostgameBtn);
        gw_panel.add(gw_logoutBtn);
        windows.get(2).add(gw_panel);
       windows.add(new JFrame());
       windows.get(3).setTitle("OpenGames");
       sgw_panel = new JPanel();
       Object data [][] = new String[50][50];
       String colNames [] = {"ID","p1","p2","gamestate","date"};
       sgw_openGameTBL = new JTable(data,colNames);
       sgw_panel.add(sgw_openGameTBL);
       windows.get(3).add(sgw_panel);
       
       
       
       
       for(JFrame temp : windows){
           temp.setSize(500,500);
           temp.setDefaultCloseOperation(EXIT_ON_CLOSE);
       }

    }
    public static void clearWindowText(){
        rw_usernameTF.setText((""));
        rw_passwordTF.setText("");
        mw_usernameTF.setText((""));
        mw_passwordTF.setText("");
    }
    
    static class ActionL implements ActionListener {
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        // Main Window
        if(source.equals(mw_registerBtn)){
            showWindow(1);
        }else if(source.equals(mw_loginBtn)){
            gw_usernameLbl.setText(mw_usernameTF.getText());
            int res = webService.login(mw_usernameTF.getText(), mw_passwordTF.getText());
            System.out.print(res);
            //if(res > 0)
                showWindow(2);
        }else if(source.equals(mw_clearBtn)){
            clearWindowText();
        }
        // Register Winodw
        if(source.equals(rw_backBtn)){
            showWindow(0);
        }else if(source.equals(rw_clearBtn)){
            clearWindowText();
        }else if(source.equals(rw_confirmBtn)){currentUsername = rw_usernameTF.getText();
            showWindow(0);
            //System.out.print(webService.register(rw_usernameTF.getText(), rw_passwordTF.getText(), rw_forenameTF.getText(), rw_surnameTF.getText()));
            webService.register("uname","password",rw_forenameTF.getText().toString(),rw_surnameTF.getText());
        }
        // Game Window
        if(source.equals(gw_findgameBtn)){
           
            
            String res = webService.showOpenGames();
            System.out.print(res);
            String temp [] = res.split(",");
             sgw_openGameTBL.setValueAt(temp[0],0,0);
             sgw_openGameTBL.setValueAt(temp[1],0,1);
             sgw_openGameTBL.setValueAt(temp[2],0,2);
             sgw_openGameTBL.setValueAt(temp[3],0,3);
                showWindow(3);
        }else if(source.equals(gw_hostgameBtn)){
               System.out.print(webService.newGame(12));
        
        }if(source.equals(gw_logoutBtn)){
            currentUsername = "";
            showWindow(0);
        }
    }
}
    

}
