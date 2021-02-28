import resources.LanguageMaps;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class MainScreenUI {
    private static String language = new String(LanguageMaps.PT_BR);
    private static LanguageMaps lm = new LanguageMaps();
    private static JFrame frame;
    private static JPanel mainPanel;
    private Menu menu;
    private static Container c;
    public MainScreenUI(Map map){
        menu = new Menu(getLanguage(), frame);
        mainPanel = new JPanel();
        frame = new JFrame(String.format("%s", map.get("turing")));
        frame.setSize(500,500);
        frame.setLocation(200,200);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setJMenuBar(menu.getMenu());
        c = frame.getContentPane();
        c.add(mainPanel);
        frame.setVisible(true);
    }

    public static JFrame getFrame(){
        return frame;
    }

    public static JPanel getMainPanel(){
        return mainPanel;
    }

    public static void setMainPanel(JPanel p){
        frame.setSize(p.getSize());
        frame.remove(mainPanel);

        mainPanel = p;
        c.add(mainPanel);
        mainPanel.revalidate();
        mainPanel.repaint();

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
        new MainScreenUI(getLanguage());
    }
}
