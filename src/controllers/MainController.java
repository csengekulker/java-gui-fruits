package controllers;

import javax.swing.DefaultListModel;
import javax.swing.JList;

import models.MainModel;
import views.MainFrame;

public class MainController {
  MainFrame mainFrame;
  MainModel mainModel;
  
  public MainController() {
    this.mainFrame = new MainFrame();
    this.mainModel = new MainModel();

    setEvents();
  }

  private void setEvents() {
    //declare events here
    this.mainFrame.getGoButton().addActionListener(action -> onGoButtonClick());

  }

  private void onGoButtonClick() {
    DefaultListModel defaultListModel = mainFrame.getDefaultListModel();
    JList list = mainFrame.getList();
    if (
      this.mainFrame.getDefaultListModel().isEmpty()) {
        System.out.println("empty");
      } else {
        System.out.println("not empty");
        // System.out.println(defaultListModel.contains("First"));
        // System.out.println(defaultListModel.contains("Firstttt"));
      }

      // this.mainFrame.getDefaultListModel().addElement("Another element");
      

      System.out.println(list.getSelectedIndex());
      System.out.println(list.getSelectedValue());
  }
}