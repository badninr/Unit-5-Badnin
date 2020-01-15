public class Slogan {
    private String phrase;
    private static int phraseNum;

    public Slogan(String phraseInp){
        phrase = phraseInp;
        phraseNum++;
    }

    public String toString(){
        return phrase;
    }

    public static int getPhraseNum(){
        return phraseNum;
    }
}
