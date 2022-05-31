/*
* File: MainController.java
* Author: Baráth Dávid
* Copyright: 2022, Baráth Dávid
* Group: Szoft 1 N
* Date: 2022-05-31
* Github: https://github.com/david587/
* Licenc: GNU GPL
*/
package controllers;

import models.MainModel;
import views.MainFrame;

public class MainController {
    MainFrame mainFrame;
    MainModel mainModel;
    public MainController() {
        this.mainFrame = new MainFrame();
        this.mainModel = new MainModel();
        this.mainFrame.groupModel.addElement("Válasszon Beosztást");
        this.mainModel.groupList.forEach(group ->{
            this.mainFrame.groupModel.addElement(group.beosztas);            
        });
        
       // this.setEvents();
    }
    // private void setEvents() {
    //     this.mainFrame.groupCombo.addActionListener(e -> onActionGroupCombo());
    // }
    // private void onActionGroupCombo() {
    //     int index = this.mainFrame.groupCombo.getSelectedIndex();
    //     // System.out.println(index);
    //     int selectedGroupId = index;
    //     this.mainFrame.studentModel.clear();
    //     this.mainModel.BeosztList.forEach(student -> {
            
    //         if(selectedGroupId == student.groupId) {
    //             System.out.println(student.name);
    //             this.mainFrame.studentModel.addElement(student.name);
    //         }
    //     });
    // }
}
