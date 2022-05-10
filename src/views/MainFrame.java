package views;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class MainFrame extends JFrame {
  JPanel mainPanel;
  JComboBox<String> comboBox;

  JList<String> list;
  DefaultListModel<String> defaultListModel;

  public MainFrame() {

    setFrame();
    setMainPanel();
    setComponents();
  }

  private void setComponents() {
    this.comboBox = new JComboBox<>();
      comboBox.addItem("Apple");
      comboBox.addItem("Strawberry");
      comboBox.addItem("Mango");

    this.defaultListModel = new DefaultListModel<>();
    this.list = new JList<>(defaultListModel);

    this.defaultListModel.addElement("First");
    this.defaultListModel.addElement("Second");
    this.defaultListModel.addElement("Third");

    this.mainPanel.add(comboBox, BorderLayout.NORTH);
    this.mainPanel.add(list, BorderLayout.CENTER);

  }

  private void setMainPanel() {
    this.mainPanel = new JPanel();

    this.mainPanel.setLayout(
      new BorderLayout()
    );


    this.add(mainPanel);

  }

  private void setFrame() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(400, 300);
    this.setTitle("Pick your fruits");
    this.setVisible(true);

    // layout for window
    this.setLayout(new FlowLayout());
  }
}