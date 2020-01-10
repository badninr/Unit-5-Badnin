public class SloganClient {
    public static void main(String[] args){
        Slogan s1 = new Slogan("This is my first slogan");
        Slogan s2 = new Slogan("This is my second slogan");
        Slogan s3 = new Slogan("This is my third slogan");
        Slogan s4 = new Slogan("This is my fourth slogan");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        System.out.println("You have "+Slogan.getPhraseNum()+" slogans.");
    }
}
