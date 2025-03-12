public class Conditionals {

    String question = "Do you like ice cream?";

    public static void main(String[] args) {
        Conditionals MagicEightBall = new Conditionals();
    }

    public Conditionals() {
        System.out.println(question);

        int randomInt = (int)(Math.random()*11);

        if (randomInt == 0) {
            System.out.println("Most probably");
        }
        else if (randomInt == 1) {
            System.out.println("Definitely not");
        }
        else if (randomInt == 3) {
            System.out.println("Without a doubt");
        }
        else if (randomInt == 4) {
            System.out.println("Maybs");
        }
        else if (randomInt == 5) {
            System.out.println("Prolly");
        }
        else {
            System.out.println("Indubitably");
        }
    }
}
