package handler;

import entities.Kindergarten;
import events.AddKindergartenEvent;
import events.DeleteKindergartenEvent;
import events.EditKindergartenEvent;
import events.KindergartenEvent;
import gui.MainFrame;

public class GuiHandler {
    public static MainFrame mainFrame;

    public static void setMainFrame(MainFrame mainFrame) {
        GuiHandler.mainFrame = mainFrame;
    }

    public static void parse(KindergartenEvent kindergartenEvent){
        if(kindergartenEvent instanceof DeleteKindergartenEvent){
            DeleteKindergartenEvent event = (DeleteKindergartenEvent) kindergartenEvent;
            mainFrame.delete(event.getKindergarten());
        }

        else if(kindergartenEvent instanceof AddKindergartenEvent){
            AddKindergartenEvent event = (AddKindergartenEvent) kindergartenEvent;
            mainFrame.add(event.getKindergarten());
        }

        else if(kindergartenEvent instanceof EditKindergartenEvent){
            EditKindergartenEvent event = (EditKindergartenEvent) kindergartenEvent;
            mainFrame.edit(event.getKindergarten());
        }
    }
}
