
public class Die implements Lockable{
    private int side;
    private int key;
    private boolean isUnlocked;

    public Die(){
        side = 1;
    }

    public int getSide(){
        return side;
    }

    public void roll(){
        side = (int) ((Math.random() * 6) + 1);
    }

    public String toString(){
        String result = "Face value = " + side;
        return result;
    }

    public void setKey(int key){
       this.key = key;
       isUnlocked = true;
    }

    public boolean lock (int key){
        if (this.key == key){
            return true;
        } else {
            return false;
        }
    }

    public boolean unlock (int key){
        if (this.key == key){
            return false;
        } else {
            return true;
        }
    }

}