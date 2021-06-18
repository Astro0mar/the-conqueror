package views;

import java.awt.FontFormatException;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.Action;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.FontFormatException;
import java.awt.event.*;
import java.io.IOException;

public class MilitaryBuildingPanel extends JPanel {
  private boolean built = false;
  private StyledButton upgrade;
  private StyledButton recruit;
  private StyledLabel buildingName;
  private JTextArea info;

  public MilitaryBuildingPanel(ActionListener a, String name) throws FontFormatException, IOException {
    setLayout(new GridLayout(2, 2));
    setUpgrade(new StyledButton("Upgrade", 30));
    setInfo(new JTextArea("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX \n xxxxxxxxxxxxxxxxxx"));
    info.setEditable(false);
    setRecruit(new StyledButton("Recruit", 30));
    add(new JLabel("<html><h1><strong><i>" + name + "</i></strong></h1><hr></html>"));
    add(upgrade);
    add(info);
    add(recruit);
  }

  public boolean isBuilt() {
    return built;
  }

  public void setBuilt(boolean built) {
    this.built = built;
  }

  public StyledLabel getBuildingName() {
    return buildingName;
  }

  public void setBuildingName(StyledLabel buildingName) {
    this.buildingName = buildingName;
  }

  public StyledButton getUpgrade() {
    return upgrade;
  }

  public void setUpgrade(StyledButton upgrade) {
    this.upgrade = upgrade;
  }

  public StyledButton getRecruit() {
    return recruit;
  }

  public void setRecruit(StyledButton recruit) {
    this.recruit = recruit;
  }

  public JTextArea getInfo() {
    return info;
  }

  public void setInfo(JTextArea info) {
    this.info = info;
  }

}