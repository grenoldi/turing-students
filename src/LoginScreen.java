import resources.LanguageMaps;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class LoginScreen {

    private JFrame loginFrame;
    private JPanel mainPanel, loginPanel, passwordPanel;
    private JLabel lLogin, lPassword;
    private JTextField tfLogin, tfPassword;
    private JButton bLogin;

    private static String language = LanguageMaps.PT_BR;
    private static LanguageMaps lm = new LanguageMaps();

    public LoginScreen(Map map){
        loginFrame = new JFrame(String.format("%s", map.get("loginScreenTitle")));
        loginFrame.setLayout(new GridLayout(2,1));
        loginFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        loginFrame.setLocation(200,200);

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
}
