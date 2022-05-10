package views;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.concurrent.Flow;

public class MainFrame extends JFrame {
  JPanel mainPanel;
  JPanel buttonPanel;

  JComboBox<String> comboBox;

  JButton goButton;

  JList<String> list;
  DefaultListModel<String> defaultListModel;

  public MainFrame() {

    setFrame();

    setMainPanel();
    setPanels();

    setMainPanelComponents();
    setButtonPanelComponents();

  }

  private void setButtonPanelComponents() {
    this.goButton = new JButton("Go");

    this.buttonPanel.add(goButton);
  }

  private void setMainPanelComponents() {
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

  private void setPanels() {
    this.buttonPanel = new JPanel();
    
    //layout for buttonPanel
    this.buttonPanel.setLayout(new FlowLayout());

    this.mainPanel.add(buttonPanel, BorderLayout.SOUTH);
  }

  private void setMainPanel() {
    this.mainPanel = new JPanel();

    // layout for mainPanel
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