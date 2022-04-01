package screen;

import java.awt.event.ActionEvent;

public interface EventsInterface {
    public abstract void buttonSaveModeClick(ActionEvent ev);
    public abstract void buttonExecuteClick(ActionEvent ev);
    public abstract void buttonSettingClick(ActionEvent ev);
    public abstract void buttonResetClick(ActionEvent ev);
    public abstract void buttonStopClick(ActionEvent ev);
    public abstract void buttonExitClick(ActionEvent ev);
}
