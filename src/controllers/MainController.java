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
        this.setEvents();
    }
    private void setEvents() {
        this.mainFrame.groupCombo.addActionListener(e -> onActionGroupCombo());
    }
    private void onActionGroupCombo() {
        int index = this.mainFrame.groupCombo.getSelectedIndex();
        // System.out.println(index);
        int selectedGroupId = index + 1;
        this.mainModel.studentList.forEach(student -> {
            
            if(selectedGroupId == student.groupId) {
                System.out.println(student.name);
            }
        });
    }
}
