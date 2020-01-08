public class Num {
    private int val;

    public Num (int valInp){
        val = valInp;
    }

    public int getVal(){
        return val;
    }

    public void setValue(int valInp){
        val = valInp;
    }

    public String toString(){
        return "The value of your num is " + val;
    }

    public boolean equals(Num otherNum){
       return this.val == otherNum.val;
    }
}