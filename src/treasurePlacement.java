import java.awt.*;
import java.util.*;
public class treasurePlacement {
    private ArrayList<Integer> xValues;
    private ArrayList<Integer> yValues;
    private int submarine1;
    private int submarine2;
    private int submarine3;
    private int submarine4;
    public treasurePlacement(){
        int x = 660;
        int y = 50;
        xValues = new ArrayList<Integer>();
        yValues = new ArrayList<Integer>();
        for (int i = 0; i<7;i++){
            xValues.add(x);
            yValues.add(y);
            x+=160;
        }
        x = 110;
        y = 230;
        for (int i = 0; i<11;i++){
            xValues.add(x);
            yValues.add(y);
            x+=160;
        }
        x = 110;
        y +=180;
        for (int i = 0; i<11;i++){
            xValues.add(x);
            yValues.add(y);
            x+=160;
        }
        y+=180;
        x =110;
        for (int i = 0; i<3;i++){
            xValues.add(x);
            yValues.add(y);
            x+=160;
        }
        /*xValues.add(660);
        yValues.add(50);
        xValues.add(820);
        yValues.add(50);
        xValues.add(980);
        yValues.add(50);
        xValues.add();
        yValues.add();
        xValues.add();
        yValues.add();
        xValues.add();
        yValues.add();*/
    }
    public int getX(int index){
        return xValues.get(index);
    }
    public int getY(int index){
        return yValues.get(index);
    }
}
