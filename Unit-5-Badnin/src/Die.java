public class Die implements Lockable {
    private int key;
    private boolean locked;
    private int face;

    public Die(int key){
        this.key = key;
        locked = true;
    }

    public void setKey(int bestKey, int newKey){
        if(bestKey == key);
        key = newKey;
    }

    public boolean locked(){
        return locked;
    }

    public void lock(int bestKey){
        if(bestKey == key);
        locked = true;
    }

    public void unlock(int bestKey){
        if(bestKey == key);
        locked = false;
    }
}
