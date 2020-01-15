public class LockableTesterju
    public static void main(String[] args) {
        System.out.println("Welcome to the dice simulator.");

        Scanner scan = new Scanner();
        Die d1 = new Die(1234);

        int keyInp;

        System.out.println("What is the password?");
        keyInp = scan.nextInt();
        d1.unlock(keyInp);

        if (d1.locked() == true) {
                System.out.println("Die 1 = " + d1.getSide());
                d1.roll();

        }

        System.out.println("Die 1 = " + d1.getSide());


    }
}