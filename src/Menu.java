import resources.LanguageMaps;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.Map;

public class Menu implements ActionListener {
    private JFrame refToMainFrame;
    private JMenuBar menuBar;
    private JMenu file, help, mLanguagePtBr, mLanguageEnUS;
    private JMenuItem open, close, about, iHelp;
    public Menu(Map map, JFrame frame){
        refToMainFrame= frame;
        menuBar = new JMenuBar();
        file = new JMenu(String.format("%s", map.get("file")));
        help = new JMenu(String.format("%s", map.get("help")));

        ImageIcon ptbrIcon = new ImageIcon(getClass().getResource("resources/img/bra_flag_25_x_24.jpg"));
        ImageIcon enusIcon = new ImageIcon(getClass().getResource("resources/img/usa_flag_25_x_25.jpg"));

        mLanguagePtBr = new JMenu();
        mLanguagePtBr.setIcon(ptbrIcon);
        mLanguagePtBr.addActionListener(this);

        mLanguageEnUS = new JMenu();
        mLanguageEnUS.setIcon(enusIcon);
        mLanguageEnUS.addActionListener(this);

        open = new JMenuItem(String.format("%s", map.get("open")));
        open.addActionListener(this);

        close = new JMenuItem(String.format("%s", map.get("close")));
        close.addActionListener(this);

        about = new JMenuItem(String.format("%s", map.get("about")));
        about.addActionListener(this);

        iHelp = new JMenuItem(String.format("%s", map.get("help")));
        iHelp.addActionListener(this);

        file.add(open);
        file.addSeparator();
        file.add(close);

        help.add(iHelp);
        help.addSeparator();
        help.add(about);

        menuBar.add(file);
        menuBar.add(help);
        menuBar.add(mLanguagePtBr);
        menuBar.add(mLanguageEnUS);
    }

    public JMenuBar getMenu(){
        return this.menuBar;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == close){
            refToMainFrame.dispatchEvent(new WindowEvent(refToMainFrame, WindowEvent.WINDOW_CLOSING));
        }
    }
}
