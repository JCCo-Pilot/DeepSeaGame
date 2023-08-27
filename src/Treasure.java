import java.awt.*;
import java.util.*;
import java.awt.color.*;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.Graphics;
public class Treasure {
    private int tier;
    private int value;
    private int xPos;
    private int yPos;
    private boolean blank;
    private boolean occupied;
    public Treasure(){
        xPos = 0;
        yPos = 0;
        tier = 0;
        value= 0;
        blank = false;
    }
    public Treasure(int i){
        tier = i;
    }
    public Treasure(int i, int a){
        tier = i; 
        value = a;
    }
    public void setOccupied(boolean b){
        occupied = b;
    }
    public boolean occupied(){
        return occupied;
    }
    public void setValue(int i){
        value = i;
    }
    public void setX(int i){
        xPos = i;
    }
    public void setY(int i){
        yPos = i;
    }
    public void setXY(int i, int a){
        xPos = i;
        yPos = a;
    }
    public void setBlank(){
        blank = true;
    }
    public boolean isBlank(){
        return blank;
    }
    public void taken(){
        blank = true;
    }
    public int getTier(){
        return tier;
    }  
    public int getValue(){
        return value;
    }
}
