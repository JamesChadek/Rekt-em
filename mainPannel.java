import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class mainPannel extends JFrame implements ActionListener{
	public static void main(String args[]) {
		new mainPannel();
	}
	mainPannel() {
		JLabel main = new JLabel("Hello World");
		add(main);
		this.setSize(650,400);
		String[] sites={"meme center","/b/","/g/","/pol/","string"};
		JComboBox siteList = new JComboBox(sites);
		siteList.setSelectedIndex(4);
		siteList.addActionListener(this);
		//swing stuff
	}
}

