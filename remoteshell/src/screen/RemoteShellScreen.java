package screen;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

import method.RcmdColor;
import method.RcmdCommand;
import method.RcmdFile;
import method.RcmdImage;
import method.RcmdText;

public class RemoteShellScreen extends JFrame {
    private JLabel labelBanner;
    private JLabel labelBannerDescription;
    private JLabel labelWaitTime;
    private JLabel labelUserGitHub;
    private JLabel lablelEmailGitHub;
    private JLabel labelInformation;
    private JLabel labelAuthForm;

    private JTextField textFieldWaitTime;
    private JTextField textFieldUser;
    private JTextField textFieldEmail;

    private JToggleButton toggleButtonSaveMode;
    private JButton buttonExecute;
    private JButton buttonReset;
    private JButton buttonStop;
    private JButton buttonExit;
    private JButton buttonSetting;

    private JPanel panelNorth;
    private JPanel panelWest;
    private JPanel panelCenter;
    private JPanel panelEast;
    private JPanel panelSouth;
    private JPanel panelSouthButtons;
    private JPanel panelSouthLabel;

    private int contador;

    public static final String TITLE = "Remote Shell";
    public static final RcmdImage IMAGE = new RcmdImage();
    public static final String IDIOMA = Locale.getDefault().getDisplayLanguage();
    public static final String USER = System.getProperty("user.name");
    protected static final String PATH = "/home/"+USER+"/.cmd/";
    protected static final String MAIN_PATH = "/home/"+USER+"/rcmd/";
    protected static final RcmdFile FOLDER_REPO = new RcmdFile(PATH);
    protected static final RcmdFile MAIN_FOLDER = new RcmdFile(MAIN_PATH);
    protected static final RcmdFile AUTH_FILE = new RcmdFile(MAIN_FOLDER.getCaminho()+".auth");
    protected static final RcmdFile FOLDER_SH = new RcmdFile("/usr/share/remote-shell/sh/");
    public static final RcmdText TEXT = new RcmdText(IDIOMA);
    public static final RcmdColor COLOR = new RcmdColor();
    public static final RcmdCommand CMD = new RcmdCommand();

    public JPanel getPanelNorth() {
        if (panelNorth == null) {
            panelNorth = new JPanel(new FlowLayout());
            panelNorth.setBackground(COLOR.pegarCor(3));

            labelBanner = new JLabel();
            labelBanner.setOpaque(false);
            labelBanner.setBackground(COLOR.pegarCor(3));
            labelBanner.setIcon(IMAGE.pegarIcon("/resource/shell.png"));
            labelBannerDescription = new JLabel(TEXT.pegarTexto(0));
            labelBannerDescription.setBackground(COLOR.pegarCor(3));
            labelBannerDescription.setForeground(COLOR.pegarCor(6));

            panelNorth.add(labelBanner);
            panelNorth.add(labelBannerDescription);
        }

        return panelNorth;
    }
    
    public JPanel getPanelWest() {
        if (panelWest == null) {
            panelWest = new JPanel(new FlowLayout());
            panelWest.setBackground(COLOR.pegarCor(3));

            toggleButtonSaveMode = new JToggleButton(TEXT.pegarTexto(8));
            toggleButtonSaveMode.setFocusPainted(false);
            toggleButtonSaveMode.setBackground(COLOR.pegarCor(3));
            toggleButtonSaveMode.setForeground(COLOR.pegarCor(6));
            panelWest.add(toggleButtonSaveMode);
        }
        return panelWest;
    }
    
    public JPanel getPanelCenter() {
        if (panelCenter == null) {
            panelCenter = new JPanel(new GridLayout(3, 2));
            panelCenter.setBackground(COLOR.pegarCor(0));

            Component[] centerComps = {
                labelWaitTime = new JLabel(TEXT.pegarTexto(1)),
                textFieldWaitTime = new JTextField(),
                labelUserGitHub = new JLabel(TEXT.pegarTexto(2)),
                textFieldUser = new JTextField(),
                lablelEmailGitHub = new JLabel(TEXT.pegarTexto(3)),
                textFieldEmail = new JTextField()
            };
            contador = 0;
            for (Component component : centerComps) {
                if (contador % 2 == 0) {
                    component.setBackground(COLOR.pegarCor(0));
                    component.setForeground(COLOR.pegarCor(6));
                }
                panelCenter.add(component);
                contador++;
            }

        }
        return panelCenter;
    }
    
    public JPanel getPanelEast() {
        return panelEast;
    }
    
    public JPanel getPanelSouth() {
        if (panelSouth == null) {
            panelSouth = new JPanel(new GridLayout(2, 1));
            panelSouth.setBackground(COLOR.pegarCor(0));
            panelSouthButtons = new JPanel(new FlowLayout());
            panelSouthButtons.setBackground(COLOR.pegarCor(3));
            panelSouthLabel = new JPanel(new FlowLayout());
            panelSouthLabel.setBackground(COLOR.pegarCor(3));

            labelInformation = new JLabel();
            labelInformation.setBackground(COLOR.pegarCor(3));
            labelInformation.setForeground(COLOR.pegarCor(6));
            labelInformation.setAutoscrolls(true);

            Component[] southComps = {
                buttonExecute = new JButton(TEXT.pegarTexto(4)),
                buttonSetting = new JButton(TEXT.pegarTexto(12)),
                buttonReset = new JButton(TEXT.pegarTexto(5)),
                buttonStop = new JButton(TEXT.pegarTexto(6)),
                buttonExit = new JButton(TEXT.pegarTexto(7)),
            };
            for (Component comp : southComps) {
                comp.setBackground(COLOR.pegarCor(0));
                comp.setForeground(COLOR.pegarCor(6));
                comp.setFocusable(false);
                panelSouthButtons.add(comp);
            }

            panelSouthLabel.add(labelInformation);

            panelSouth.add(panelSouthButtons);
            panelSouth.add(panelSouthLabel);
        }
        return panelSouth;
    }
    public void setPanelSouth(JPanel panelSouth) {
        this.panelSouth = panelSouth;
    }

    public JLabel getLabelBanner() {
        return labelBanner;
    }
    public void setLabelBanner(JLabel labelBanner) {
        this.labelBanner = labelBanner;
    }
    public JLabel getLabelBannerDescription() {
        return labelBannerDescription;
    }
    public void setLabelBannerDescription(JLabel labelBannerDescription) {
        this.labelBannerDescription = labelBannerDescription;
    }
    public JLabel getLabelWaitTime() {
        return labelWaitTime;
    }
    public void setLabelWaitTime(JLabel labelWaitTime) {
        this.labelWaitTime = labelWaitTime;
    }
    public JLabel getLabelUserGitHub() {
        return labelUserGitHub;
    }
    public void setLabelUserGitHub(JLabel labelUserGitHub) {
        this.labelUserGitHub = labelUserGitHub;
    }
    public JLabel getLablelEmailGitHub() {
        return lablelEmailGitHub;
    }
    public void setLablelEmailGitHub(JLabel lablelEmailGitHub) {
        this.lablelEmailGitHub = lablelEmailGitHub;
    }
    public JLabel getLabelInformation() {
        return labelInformation;
    }
    public void setLabelInformation(JLabel labelInformation) {
        this.labelInformation = labelInformation;
    }
    public JTextField getTextFieldWaitTime() {
        return textFieldWaitTime;
    }
    public void setTextFieldWaitTime(JTextField textFieldWaitTime) {
        this.textFieldWaitTime = textFieldWaitTime;
    }
    public JTextField getTextFieldUser() {
        return textFieldUser;
    }
    public void setTextFieldUser(JTextField textFieldUser) {
        this.textFieldUser = textFieldUser;
    }
    public JTextField getTextFieldEmail() {
        return textFieldEmail;
    }
    public void setTextFieldEmail(JTextField textFieldEmail) {
        this.textFieldEmail = textFieldEmail;
    }
    public JLabel getLabelAuthForm() {
        return labelAuthForm;
    }
    public void setLabelAuthForm(JLabel labelAuthForm) {
        this.labelAuthForm = labelAuthForm;
    }
    public JToggleButton getToggleButtonSaveMode() {
        return toggleButtonSaveMode;
    }
    public void setToggleButtonSaveMode(JToggleButton toggleButtonSaveMode) {
        this.toggleButtonSaveMode = toggleButtonSaveMode;
    }
    public JButton getButtonExecute() {
        return buttonExecute;
    }
    public void setButtonExecute(JButton buttonExecute) {
        this.buttonExecute = buttonExecute;
    }
    public JButton getButtonReset() {
        return buttonReset;
    }
    public void setButtonReset(JButton buttonReset) {
        this.buttonReset = buttonReset;
    }
    public JButton getButtonExit() {
        return buttonExit;
    }
    public void setButtonExit(JButton buttonExit) {
        this.buttonExit = buttonExit;
    }
    public JButton getButtonStop() {
        return buttonStop;
    }
    public void setButtonStop(JButton buttonStop) {
        this.buttonStop = buttonStop;
    }

    public JButton getButtonSetting() {
        return buttonSetting;
    }

    public void setButtonSetting(JButton buttonSetting) {
        this.buttonSetting = buttonSetting;
    }

}
