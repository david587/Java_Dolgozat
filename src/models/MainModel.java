package models;

import java.util.Arrays;
import java.util.Vector;

public class MainModel {

    Group[] groupArray = {
        new Group(1, "Szoftvertesztelő"),
        new Group(2, "Szoftverfejlesztő"),
        new Group(3, "Üzemmérnök"),
        new Group(4, "Takaritó"),
        new Group(5, "Vilanyszerelő"),
        new Group(6, "Mechatronikus"),
        new Group(7, "Gépész"),
        new Group(8, "Tanár"),
        new Group(9, "Szakács"),
        new Group(10, "Webdesigner")
    };
    public Vector<Group> groupList = 
        new Vector<>(Arrays.asList(groupArray)); 
    // Student[] studentArray = {
    //     new Student(1, "Pala Sándor", 1),
    //     new Student(2, "Alga Irén", 1),
    //     new Student(3, "Rota Valér", 1),
    //     new Student(4, "Siku Ferenc", 1),
    //     new Student(5, "Hari Béla", 2),
    //     new Student(6, "Közle Mihály", 2),
    //     new Student(7, "Csont Emőke", 2),
    //     new Student(8, "Ete Levente", 3),
    //     new Student(9, "Erős István", 3),
    // };
    // public Vector<Student> BeosztList =
    //     new Vector<>(Arrays.asList(studentArray));
}
