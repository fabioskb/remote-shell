package application;

import java.awt.BorderLayout;

public class RemoteShell extends RemoteShellEvents{

    public RemoteShell() {
        init();
        events();
    }

    public void init() {
        if (!MAIN_FOLDER.getArq().isDirectory()) MAIN_FOLDER.getArq().mkdir();        
        this.setTitle(TITLE);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setIconImage(IMAGE.pegarImage("/resource/shell.png"));
        this.setResizable(false);
        this.setLocation(500, 250);

        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(getPanelNorth(), BorderLayout.NORTH);
        this.getContentPane().add(getPanelWest(), BorderLayout.WEST);
        this.getContentPane().add(getPanelCenter(), BorderLayout.CENTER);
        this.getContentPane().add(getPanelSouth(), BorderLayout.SOUTH);

        getButtonSetting().setVisible(false);

        if (FOLDER_REPO.getArq().isDirectory()) {
            getLabelUserGitHub().setVisible(false);
            getTextFieldUser().setVisible(false);
            getLablelEmailGitHub().setVisible(false);
            getTextFieldEmail().setVisible(false);
        } else {
            getLabelWaitTime().setVisible(false);
            getTextFieldWaitTime().setVisible(false);
            getButtonExecute().setVisible(false);
            getButtonSetting().setVisible(true);
        }
        
        this.pack();
    }
}
