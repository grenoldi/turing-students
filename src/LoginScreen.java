import resources.LanguageMaps;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class LoginScreen implements ActionListener {

    private JFrame loginFrame;
    private JPanel mainPanel, loginPanel, passwordPanel, buttonPanel;
    private JLabel lUsername, lPassword;
    private JTextField tfUsername;
    private JPasswordField tfPassword;
    private JButton bLogin, bClose;

    private static String language = LanguageMaps.PT_BR;
    private static LanguageMaps lm = new LanguageMaps();
    private Menu menu;

    public LoginScreen(Map map){

        loginFrame = new JFrame(String.format("%s", map.get("loginScreenTitle")));
        loginFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        loginFrame.setLocation(300,300);
        loginFrame.setSize(320,240);


        menu = new Menu(map, loginFrame);

        mainPanel= new JPanel();
        mainPanel.setLayout(new GridLayout(3,1));

        loginPanel = new JPanel();
        lUsername = new JLabel(String.format("%s", map.get("username")));
        tfUsername = new JTextField(15);
        loginPanel.add(lUsername);
        loginPanel.add(tfUsername);

        passwordPanel = new JPanel();
        lPassword = new JLabel(String.format("%s", map.get("password")));
        tfPassword = new JPasswordField(15);
        passwordPanel.add(lPassword);
        passwordPanel.add(tfPassword);

        buttonPanel = new JPanel();
        bLogin = new JButton(String.format("%s", map.get("login")));
        bLogin.addActionListener(this);

        bClose = new JButton(String.format("%s", map.get("close")));
        bClose.addActionListener(this);

        buttonPanel.add(bLogin);
        buttonPanel.add(bClose);

        mainPanel.add(loginPanel);
        mainPanel.add(passwordPanel);
        mainPanel.add(buttonPanel);

        Container c = loginFrame.getContentPane();
        loginFrame.setJMenuBar(menu.getMenu());
        c.add(mainPanel);
        loginFrame.setVisible(true);
    }

    public static Map getLanguage(){
        if(language.equals(LanguageMaps.EN_US)){
            return lm.getEnglishStringMap();
        }
        if (language.equals(LanguageMaps.PT_BR)){
            return lm.getPortugueseStringMap();
        }
        return lm.getPortugueseStringMap(); //standard language of the ui
    }

    public static void main(String[] args){
        new LoginScreen(getLanguage());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == bClose){
            System.exit(0);
        }
    }
}
