package controllers;

import models.MainModel;
import views.MainFrame;

public class MainController {
    MainFrame mainFrame;
    MainModel mainModel;
    public MainController() {
        this.mainFrame = new MainFrame();
        this.mainModel = new MainModel();
        this.mainModel.groupList.forEach(group ->{
            this.mainFrame.groupModel.addElement(group.name);            
        });
        
    }
    
}
