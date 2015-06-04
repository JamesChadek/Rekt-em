import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.swing.*;
import java.util.*;
import javax.imageio.*;

public class mainPannel extends JFrame implements ActionListener{
	
	String[] sites={"meme center","/b/","/g/","/pol/","string"};
	JComboBox box=new JComboBox(sites);
	JLabel dankResponse=new JLabel();
	public void paint(Graphics g){
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("image.png"));
		} catch (IOException e) {
			System.out.println("fix it fix it fix it fix it fix it fix it fix it fix it fix it");
		}
		g.drawImage(img, 50, 50, this);
		g.drawImage(img, 300, 50, this);
	}
	public static void main(String args[]) {//pannel start
		new mainPannel();
	}
	mainPannel() {
		//JLabel main = new JLabel("Hello World");
		//add(main);
		//Set pannel attributes
		this.setLayout(new FlowLayout());
		this.setSize(650,400);
		this.setTitle("Internet danker than you can even imagine");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//Combobox for site selection
		box.setSelectedIndex(0);
		box.addActionListener(this);
		//Main image
		
		//swing stuff
		add(box);
		add(dankResponse);
		this.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e){
		JComboBox c=(JComboBox)e.getSource();
		String m=(String)c.getSelectedItem();
		switch(m){
				case "q": System.out.println("hey");
				break;
				default: dankResponse.setText("yes");
		}
	}
}

