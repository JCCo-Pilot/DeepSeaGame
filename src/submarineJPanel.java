import java.awt.*;
import java.awt.Color;
import java.awt.image.*;
import java.util.*;
import javax.imageio.ImageIO;
import javax.imageio.ImageIO.*;
import javax.swing.*;
import java.io.*;
import java.io.File;
import javax.imageio.ImageIO;

public class submarineJPanel extends JPanel{
    private BufferedImage image;
	private BufferedImage tier1;
	private BufferedImage tier2;
	private BufferedImage tier3;
	private BufferedImage tier4;
	private BufferedImage player1icon;
	private BufferedImage player2icon;
	private BufferedImage player3icon;
	private BufferedImage player4icon;
	private ArrayList<Treasure> ruins;
	private Graphics graph;
	private boolean result;
	private int player1BaseY;
	private int player1BaseX;
	private int player2BaseY;
	private int player2BaseX;
	private int player3BaseY;
	private int player3BaseX;
	private int player4BaseY;
	private int player4BaseX;

	private treasurePlacement values;
	public submarineJPanel(ArrayList<Treasure> r) {
		values = new treasurePlacement();
		ruins = r;
		result = true;
		player1BaseX=50;
		player1BaseY=50;
		player2BaseX= 150;
		player2BaseY=50;
		player3BaseX= 250;
		player3BaseY=50;
		player4BaseX= 350;
		player4BaseY=50;
		try {
			image = ImageIO.read(new File("submarine.png"));
			tier1 = ImageIO.read(new File("tier1treasure.png"));
			tier2 = ImageIO.read(new File("tier2treasure.png"));
			tier3 = ImageIO.read(new File("tier3treasure.png"));
			tier4 = ImageIO.read(new File("tier4treasure.png"));
			player1icon = ImageIO.read(new File ("player1.png"));
			player2icon = ImageIO.read(new File ("player2.png"));
			player3icon = ImageIO.read(new File ("player3.png"));
			player4icon = ImageIO.read(new File ("player4.png"));
		}
		catch(Exception E) {
			System.out.println("Error");
			return;
		}
		
	}
	public void setFalse(){
		result = false;
	}
	public void paint(Graphics g) {
		super.paint(g);
		graph = g;
		graph.drawImage(image,0,10,600,150,null);
		graph.drawImage(player1icon,player3BaseX,player3BaseY,null);
		refresh();
		drawBase1();
		//draw1();
		//draw2();
		//draw3();
		//draw4();
	}
	public void refresh(){
		int xVal = 630;
		int yVal = 10;
		int width = 150;
		int height = 150;
		// first row
		for (int i = 0; i<ruins.size();i++){
			if (!ruins.get(i).isBlank()&&ruins.get(i).getTier()==1){
				graph.drawImage(tier1,xVal,yVal,width,height,null);
			}
			if (!ruins.get(i).isBlank()&&ruins.get(i).getTier()==2){
				graph.drawImage(tier2,xVal,yVal,width,height,null);
			}
			if (!ruins.get(i).isBlank()&&ruins.get(i).getTier()==3){
				graph.drawImage(tier3,xVal,yVal,width,height,null);
			}
			if (!ruins.get(i).isBlank()&&ruins.get(i).getTier()==4){
				graph.drawImage(tier4,xVal,yVal,width,height,null);
			}
			graph.setColor(Color.GREEN);
			if (ruins.get(i).isBlank()){
				graph.drawRect(xVal,yVal,width,height);
				graph.fillRect(xVal,yVal,width,height);
			}
			if (i == 6){
				yVal += 180;
				xVal = 75;
			}
			if (i==17){
				yVal +=180;
				xVal = 75;
			}
			if (i==28){
				yVal +=180;
				xVal = 75;
			}
			if (i!=6&&i!=17&&i!=28){
				xVal +=160;
			}
			
		}
		//graph.drawImage(player1icon,660,40,Color.WHITE,null);
		//graph.drawImage(player2icon,110+160,230+180,Color.WHITE,null);
	}
	public void draw1(){
		graph.drawImage(player1icon,values.getX(1+4),values.getY(1+4),null);
	}
	public void draw2(){
		graph.drawImage(player2icon,values.getX(2+4),values.getY(2+4),null);
	}
	public void draw3(){
		graph.drawImage(player3icon,values.getX(3+4),values.getY(3+4),null);
	}
	public void draw4(){
		graph.drawImage(player4icon,values.getX(31),values.getY(31),null);
	}
	public void drawBase1(){
		graph.drawImage(player1icon,player1BaseX,player1BaseY,null);
	}
	public void drawBas2(){

	}
	public void drawBase3(){

	}
	public void drawBase4(){

	}
	public void move1(){
		while (){

		}
	}
	public void move2(){

	}
	public void move3(){

	}
	public void move4(){

	}
}
