import io.joshworks.restclient.http.Unirest;
import resources.LanguageMaps;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.net.http.HttpResponse;
import java.util.Map;

public class NewStudentPanel implements ActionListener {
    private String language = LanguageMaps.PT_BR;
    private JPanel mainPanel, pPersonal, pAddress, namePanel, cpfPanel, telPanel, streetPanel, ufPanel, cepPanel, numberPanel, buttonPanel;
    private JLabel lPersonal, lAddress, lName, lCPF, lTel, lStreet, lUF, lCEP, lNumber;
    private JTextField tfName, tfCPF, tfTel, tfStreet, tfUF, tfCEP, tfNumber;
    private JButton bSave, bClose;
    private JFrame refToMainFrame;
    public NewStudentPanel(Map map, JFrame frame){
        refToMainFrame = frame;
        mainPanel = new JPanel();
        pPersonal = new JPanel();
        pAddress = new JPanel();
        namePanel = new JPanel();
        cpfPanel = new JPanel();
        telPanel = new JPanel();
        streetPanel = new JPanel();
        ufPanel = new JPanel();
        cepPanel = new JPanel();
        numberPanel = new JPanel();
        buttonPanel = new JPanel();

        lPersonal = new JLabel(String.format("%s", map.get("personal-data")));
        lAddress = new JLabel(String.format("%s", map.get("address")));

        lName = new JLabel(String.format("%s", map.get("name")));
        tfName = new JTextField(30);
        namePanel.add(lName);
        namePanel.add(tfName);

        lCPF = new JLabel(String.format("%s", map.get("social")));
        tfCPF = new JTextField(12);
        cpfPanel.add(lCPF);
        cpfPanel.add(tfCPF);

        lTel = new JLabel(String.format("%s", map.get("telephone")));
        tfTel = new JTextField(12);
        telPanel.add(lTel);
        telPanel.add(tfTel);

        lStreet = new JLabel(String.format("%s", map.get("street")));
        tfStreet = new JTextField(30);
        streetPanel.add(lStreet);
        streetPanel.add(tfStreet);

        lUF = new JLabel(String.format("%s", map.get("uf")));
        tfUF = new JTextField(3);
        ufPanel.add(lUF);
        ufPanel.add(tfUF);

        lNumber = new JLabel(String.format("%s", map.get("number")));
        tfNumber = new JTextField(6);
        numberPanel.add(lNumber);
        numberPanel.add(tfNumber);

        lCEP = new JLabel(String.format("%s", map.get("zip-code")));
        tfCEP = new JTextField(15);
        cepPanel.add(lCEP);
        cepPanel.add(tfCEP);

        bSave = new JButton(String.format("%s", map.get("save")));
        bSave.addActionListener(this);
        bClose = new JButton(String.format("%s", map.get("close")));
        bClose.addActionListener(this);
        buttonPanel.add(bSave);
        buttonPanel.add(bClose);

        pPersonal.add(lPersonal);
        pAddress.add(lAddress);

        mainPanel.setSize(400, 400);
        mainPanel.setLayout(new GridLayout(10,1));
        mainPanel.add(pPersonal);
        mainPanel.add(namePanel);
        mainPanel.add(cpfPanel);
        mainPanel.add(telPanel);
        mainPanel.add(pAddress);
        mainPanel.add(streetPanel);
        mainPanel.add(numberPanel);
        mainPanel.add(ufPanel);
        mainPanel.add(cepPanel);
        mainPanel.add(buttonPanel);
    }

    public JPanel getMainPanel(){
        return this.mainPanel;
    }

    public void registerStudent(){

        HttpResponse<String> response = (HttpResponse<String>) Unirest.post("http://localhost:8080/api/v1/alunos/")
                .header("Content-Type", "application/json")
                .body("{\n    \"marca\":\"ford\",\n    \"modelo\":\"fiesta\",\n    \"cor\":\"branco\",\n    \"combustivel\":\"flex\"\n}")
                .asString();
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bClose){
            refToMainFrame.dispatchEvent(new WindowEvent(refToMainFrame, WindowEvent.WINDOW_CLOSING));
        }
        if (e.getSource() == bSave){
            //TODO: request api to save student
            //Reminder: address data is optional, personal is not.
        }
    }
}
