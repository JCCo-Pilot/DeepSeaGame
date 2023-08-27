import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame.*;
import java.awt.Graphics;
import java.lang.*;
public class fillTreasure {
    private int zeros,ones,twos,threes;
    private int fours, fives, sixes, sevens;
    private int eights, nines, tens, elevens;
    private int twelves, thirteens, fourteens, fifteens;
    public fillTreasure(){
        zeros = 2;
        ones = 2;
        twos = 2;
        threes = 2;
        fours = 2;
        fives = 2;
        sixes = 2;
        sevens = 2;
        eights = 2;
        nines = 2;
        tens = 2;
        elevens = 2;
        twelves =2;
        thirteens = 2;
        fourteens = 2;
        fifteens = 2;
    }
    public ArrayList fill(ArrayList<Treasure> t){
        int loopCount = 0;
        for (int i = 0; i<8; loopCount++){
            int seed = (int)(Math.random()*4)+0;
            if(seed == 0&&zeros>0){
                t.get(i).setValue(seed);
                zeros--;
                i++;
            }
            if(seed == 1&&ones>0){
                t.get(i).setValue(seed);
                ones--;
                i++;
            }
            if(seed == 2&&twos>0){
                t.get(i).setValue(seed);
                twos--;
                i++;
            }
            if(seed == 3&&threes>0){
                t.get(i).setValue(seed);
                threes--;
                i++;
            }
        }
        for (int i = 8; i<16; loopCount++){
            int seed = (int)(Math.random()*4)+4;
            if(seed == 4&&fours>0){
                t.get(i).setValue(seed);
                fours--;
                i++;
            }
            if(seed == 5&&fives>0){
                t.get(i).setValue(seed);
                fives--;
                i++;
            }
            if(seed == 6&&sixes>0){
                t.get(i).setValue(seed);
                sixes--;
                i++;
            }
            if(seed == 7&&sevens>0){
                t.get(i).setValue(seed);
                sevens--;
                i++;
            }
        }
        for (int i = 16; i<24; loopCount++){
            int seed = (int)(Math.random()*4)+8;
            if(seed == 8&&eights>0){
                t.get(i).setValue(seed);
                eights--;
                i++;
            }
            if(seed == 9&&nines>0){
                t.get(i).setValue(seed);
                nines--;
                i++;
            }
            if(seed ==10&&tens>0){
                t.get(i).setValue(seed);
                tens--;
                i++;
            }
            if(seed == 11&&elevens>0){
                t.get(i).setValue(seed);
                elevens--;
                i++;
            }
        }
        for (int i = 24; i<32; loopCount++){
            int seed = (int)(Math.random()*4)+12;
            if(seed == 12&&twelves>0){
                t.get(i).setValue(seed);
                twelves--;
                i++;
            }
            if(seed == 13&&thirteens>0){
                t.get(i).setValue(seed);
                thirteens--;
                i++;
            }
            if(seed ==14&&fourteens>0){
                t.get(i).setValue(seed);
                fourteens--;
                i++;
            }
            if(seed == 15&&fifteens>0){
                t.get(i).setValue(seed);
                fifteens--;
                i++;
            }
        }
        return t;
    }
}
