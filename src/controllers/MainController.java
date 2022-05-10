package controllers;

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
    System.out.println("ok");
  }
}