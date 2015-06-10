//awtism
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
//io
import java.io.*;
//import java.io.Writer.*;
import java.util.*;
import javax.imageio.*;
//swing
import javax.swing.*;
public class mainPannel extends JFrame implements ActionListener{
	//Combobox init
	String[] sites={"Google","/b/","/g/","/pol/","Tahoma"};
	JComboBox box=new JComboBox(sites);
	JLabel dankResponse=new JLabel();
	
	public void paint(Graphics g){//Just for adding images to the JFrame
		BufferedImage img = null;
		try {//reading in
			img = ImageIO.read(new File("Downloaded_Images/image.png"));
		} catch (IOException e) {
			System.out.println("fix it fix it fix it fix it fix it fix it fix it fix it fix it");
		}
		g.drawImage(img, 50, 100, this);//adds to frame
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
	@SuppressWarnings("unchecked")
	public void actionPerformed(ActionEvent e){
		//dankResponses to website choice
		JComboBox c=(JComboBox)e.getSource();
		String m=(String)c.getSelectedItem();
		//out file
		PrintWriter writer=null;
		try{
			writer= new PrintWriter("info.file", "UTF-8");
		}catch(IOException e2){
			
		}
		//
		switch(m){
				case "Google": 
				writer.println("http://google.com");
				dankResponse.setText("lame but ok");
				break;
				case "/b/": 
				writer.println("http://4chan.org/b/");
				dankResponse.setText("won't work at school");
				break;
				case "/g/": 
				writer.println("http://4chan.org/g/");
				dankResponse.setText("the /g/reatest");
				break;
				case "/pol/": 
				writer.println("http://4chan.org/pol/");
				dankResponse.setText("Glorious");
				break;
				case "Tahoma": 
				writer.println("http://tahomahigh.com");
				dankResponse.setText("Glorious");
				break;
				default: 
				writer.println("suckit");
				dankResponse.setText("error.jpeg");
				break;
		}
		writer.close();
	}
}
//Note: Combo box will be on the left side in the final version

