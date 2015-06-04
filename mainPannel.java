//awtism
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
//io
import java.io.*;
import java.util.*;
import javax.imageio.*;
//swing
import javax.swing.*;
public class mainPannel extends JFrame implements ActionListener{
	//Combobox init
	String[] sites={"meme center","/b/","/g/","/pol/","string"};
	JComboBox box=new JComboBox(sites);
	JLabel dankResponse=new JLabel();
	
	public void paint(Graphics g){//Just for adding images to the JFrame
		BufferedImage img = null;
		try {//reading in
			img = ImageIO.read(new File("image.png"));
		} catch (IOException e) {
			System.out.println("fix it fix it fix it fix it fix it fix it fix it fix it fix it");
		}
		g.drawImage(img, 50, 50, this);//adds to frame
		g.drawImage(img, 300, 50, this);
	}
	public static void main(String args[]) {//pannel start
		new mainPannel();
	}
	mainPannel() {
		//Set pannel attributes
		this.setLayout(new FlowLayout());
		this.setSize(650,400);
		ImageIcon img = new ImageIcon("icon.png");
		this.setIconImage(img.getImage());
		this.setTitle("Internet danker than you can even imagine");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//Combobox for site selection
		box.setSelectedIndex(0);
		box.addActionListener(this);
		//swing stuff
		add(box);
		add(dankResponse);
		this.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e){
		//dankResponses to website choice
		JComboBox c=(JComboBox)e.getSource();
		String m=(String)c.getSelectedItem();
		switch(m){
				case "q": System.out.println("hey");
				break;
				default: dankResponse.setText("yes");
		}
	}
}
//Note: Combo box will be on the left side in the final version

