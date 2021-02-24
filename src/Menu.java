import resources.LanguageMaps;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class Menu implements ActionListener {
    private JMenuBar menuBar;
    private JMenu file, help, mLanguagePtBr, mLanguageEnUS;
    public Menu(Map map){
        menuBar = new JMenuBar();
        file = new JMenu(String.format("%s", map.get("file")));
        help = new JMenu(String.format("%s", map.get("help")));

        ImageIcon ptbrIcon = new ImageIcon(getClass().getResource("resources/img/bra_flag_25_x_24.jpg"));
        ImageIcon enusIcon = new ImageIcon(getClass().getResource("resources/img/bra_flag_25_x_25.jpg"));

        mLanguagePtBr = new JMenu();
        mLanguagePtBr.setIcon(ptbrIcon);
        mLanguagePtBr.addActionListener(this);

        mLanguageEnUS = new JMenu();
        mLanguageEnUS.setIcon(enusIcon);
        mLanguageEnUS.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
