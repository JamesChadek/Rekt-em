import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class mainPannel extends JFrame implements ActionListener{
	
	String[] sites={"meme center","/b/","/g/","/pol/","string"};
	JComboBox box=new JComboBox(sites);
	JLabel dankResponse=new JLabel();
	
	public static void main(String args[]) {//pannel start
		new mainPannel();
	}
	mainPannel() {
		//JLabel main = new JLabel("Hello World");
		//add(main);
		//Set pannel attributes
		this.setSize(650,400);
		this.setTitle("Internet danker than you can even imagine");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JComboBox siteList = new JComboBox(sites);
		siteList.setSelectedIndex(4);
		siteList.addActionListener(this);
		//swing stuff
		this.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e){}
}

