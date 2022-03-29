package application;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import screen.EventsInterface;
import screen.RemoteShellScreen;

public class RemoteShellEvents extends RemoteShellScreen implements EventsInterface {
    
    public void events() {
        getButtonExecute().addActionListener(this::buttonExecuteClick);
        getButtonSetting().addActionListener(this::buttonSettingClick);
        getButtonReset().addActionListener(this::buttonResetClick);
        getButtonStop().addActionListener(this::buttonStopClick);
        getButtonExit().addActionListener(this::buttonExitClick);
    }
    
    @Override
    public void buttonExecuteClick(ActionEvent ev) {
        Thread execute = new Thread(() -> {
            String st = "";
            if (FOLDER_REPO.getArq().isDirectory() && !getTextFieldWaitTime().getText().isEmpty()) {
                getLabelInformation().setText(TEXT.pegarTexto(9));
                if (getToggleButtonSaveMode().isSelected()) st = CMD.comando(FOLDER_SH.getCaminho()+"execute -s "+getTextFieldWaitTime().getText());
                //else st = CMD.comando(FOLDER_SH.getCaminho()+"execute "+getTextFieldWaitTime().getText());
                else st = CMD.comando("/home/fabio/Documentos/remote-shell/remoteshell/sh/execute "+getTextFieldWaitTime().getText());
                getLabelInformation().setText(st);
            } else if (getTextFieldWaitTime().getText().isEmpty()) {
                getLabelInformation().setText(TEXT.pegarTexto(16));
            }
        });
        execute.start();
    }

    @Override
    public void buttonSettingClick(ActionEvent ev) {
        Thread setar = new Thread(() -> {
            if (!getTextFieldUser().getText().isEmpty() && !getTextFieldUser().getText().isEmpty()) {
                getLabelInformation().setText("Setting...");
                if (!AUTH_FILE.getArq().isFile()) JOptionPane.showMessageDialog(null, TEXT.pegarTexto(20), TITLE, JOptionPane.INFORMATION_MESSAGE, IMAGE.pegarIcon("/resource/shell.png"));
                String set = CMD.comando(FOLDER_SH.getCaminho()+"set");
                getLabelInformation().setText(set);
                CMD.sleep(5);
                if (FOLDER_REPO.getArq().isDirectory()) {
                    JOptionPane.showMessageDialog(null, TEXT.pegarTexto(13), TITLE, JOptionPane.INFORMATION_MESSAGE, IMAGE.pegarIcon("/resource/shell.png")); 
                    getLabelInformation().setText(TEXT.pegarTexto(14));
                    CMD.sleep(3);
                    buttonExitClick(ev);
                } else {
                    System.out.println(FOLDER_REPO.getArq().isDirectory());
                    CMD.sleep(2);
                    getLabelInformation().setText(TEXT.pegarTexto(18));
                }
            } else {
                getLabelInformation().setText(TEXT.pegarTexto(19));
            }
        });
        setar.start();
    }
    
    @Override
    public void buttonResetClick(ActionEvent ev) {
        Thread resetar = new Thread(() -> {
            int choose = JOptionPane.showConfirmDialog(null, TEXT.pegarTexto(11), TITLE, 0, JOptionPane.QUESTION_MESSAGE, IMAGE.pegarIcon("/resource/shell.png"));
            if (choose == 0) {
                getLabelInformation().setText(TEXT.pegarTexto(17));
                CMD.comando(FOLDER_SH.getCaminho()+"reset");
                if (!FOLDER_REPO.getArq().isDirectory()) {
                    JOptionPane.showMessageDialog(null, TEXT.pegarTexto(15), TITLE, JOptionPane.INFORMATION_MESSAGE, IMAGE.pegarIcon("/resource/shell.png")); 
                    getLabelInformation().setText(TEXT.pegarTexto(14));
                    CMD.sleep(3);
                    buttonExitClick(ev);
                } else {
                    CMD.sleep(3);
                    getLabelInformation().setText(TEXT.pegarTexto(18));
                }
            }
        });
        resetar.start();
    }

    @Override
    public void buttonStopClick(ActionEvent ev) {
        Thread parar = new Thread(() -> {
            String stop = CMD.comando(FOLDER_SH.getCaminho()+"stop");
            getLabelInformation().setText(stop);
            CMD.sleep(2);
            getLabelInformation().setText(TEXT.pegarTexto(21));
        });
        parar.start();
    }

    @Override
    public void buttonExitClick(ActionEvent ev) {
        CMD.destruir();
        System.exit(0);
    }

    @Override
    public void buttonSaveModeClick(ActionEvent ev) {
        
    }
    
}
