import java.util.*;
public class Player {
    private ArrayList<Treasure>stack;
    private int count;
    private int x;
    private int y;
    private boolean turn;
    private boolean isWet;
    private boolean hasntdived;
    public Player(){
        stack = new ArrayList<Treasure>();
        count = 0;
        isWet = false;
        hasntdived = true;
    }
    public int getNumberOfTreasure(){
        return stack.size();
    }
    public void addTreasure(Treasure t){
        stack.add(t);
    }
    public int getValue(){
        int result = 0;
        for (int i =0; i<stack.size();i++){
            result +=stack.get(i).getValue();
        }
        return result;
    }
    public boolean isWet(){
        return isWet;
    }
    public boolean hasntdived(){
        return hasntdived;
    }
    public void setWet(boolean b){
        isWet =b;
    }
    public void setDive(boolean b){
        hasntdived = b;
    }
    public boolean isTurn(){
        return turn;
    }
    public void setTurn(boolean i){
        turn = i;
    }
}
