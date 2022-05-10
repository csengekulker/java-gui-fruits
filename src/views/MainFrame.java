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

    setComponents();
    setMainPanel();
    setFrame();
  }

  private void setComponents() {
    this.comboBox = new JComboBox<>();
      comboBox.addItem("Apple");
      comboBox.addItem("Strawberry");
      comboBox.addItem("Mango");

    this.list = new JList<>();
    this.defaultListModel = new DefaultListModel<>();

  }

  private void setMainPanel() {
    this.mainPanel = new JPanel();

    this.mainPanel.setLayout(
      new BorderLayout()
    );

    this.mainPanel.add(comboBox);
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