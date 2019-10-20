import java.security.SecureRandom;
import java.util.Scanner;
public class sunkara_p1 {
    public static float question(Scanner scnr, SecureRandom random, int bound, int type) {
        int num1 = random.nextInt(bound);
        int num2 = random.nextInt(bound);
        float ans = 0;

        int type1;
        if(type==5)
            type1=random.nextInt(4);
        else
            type1=type;
        switch (type1) {
            case 1:
                ans = num1 + num2;
                System.out.println("How much is " + num1 + " plus " + num2 + "?");
                break;
            case 2:
                ans = num1 * num2;
                System.out.println("How much is " + num1 + " times " + num2 + "?");
                break;
            case 3:
                ans = num1 - num2;
                System.out.println("How much is " + num1 + " minus " + num2 + "?");
                break;
            case 4:
                ans = num1 / num2;
                System.out.println("How much is " + num1 + " divided by " + num2 + "?");
                break;
            default:
                ans = num1 * num2;
                System.out.println("How much is " + num1 + " times " + num2 + "?");
                break;
        }
        return ans;
    }
    public static boolean response(Scanner scnr, SecureRandom random, float ans){
        boolean correct = false;
        float input = scnr.nextFloat();
        if (Float.compare(input, ans) == 0) {
            int resp1 = random.nextInt(3);
            switch (resp1) {
                case 0:
                    System.out.println("Very good!\n");
                    break;
                case 1:
                    System.out.println("Excellent!\n");
                    break;
                case 2:
                    System.out.println("Nice work!\n");
                    break;
                case 3:
                    System.out.println("Keep up the good work!\n");
                    break;
            }
            correct=true;
        } else {
            int resp2 = random.nextInt(3);
            switch (resp2) {
                case 0:
                    System.out.println("No. Please try again.\n");
                    break;
                case 1:
                    System.out.println("Wrong. Try once more.\n");
                    break;
                case 2:
                    System.out.println("Don’t give up!\n");
                    break;
                case 3:
                    System.out.println("No. Keep trying.\n");
                    break;
            }
        }
        return correct;
    }
    public static int problemType(Scanner scnr){
        System.out.println("Please enter type of arithmetic problem to study " +
                "(1 means addition problems only, 2 means multiplication problems only, " +
                "3 means subtraction problems only, 4 means division problems only and 5 means a random mixture)");
        int problemType = scnr.nextInt();
        return problemType;
    }
    public static int difficulty(Scanner scnr, SecureRandom random){
        System.out.println("Please enter a difficulty level");
        double difficulty = scnr.nextDouble();
        int bound = (int) Math.pow(10, difficulty) - 1;
        return bound;
    }
    public static void main(String[] args){
        SecureRandom random = new SecureRandom();
        Scanner scnr = new Scanner(System.in);

        //end or begin new session
        boolean session = true;
        while (session == true) {
            System.out.println("Would you like to begin a new session? (enter yes or no)");
            String sess = scnr.next();
            if (sess.equals("no")) {
                session = false;
                break;
            }
            else if (sess.equals("yes"))
                session = true;
            int bound = difficulty(scnr, random);
            int type = problemType(scnr);
            float ans = 0;
            boolean correct;
            int numCorrect = 0;
            for(int i=0; i<10; i++){
                ans = question(scnr, random, bound, type);
                correct = response(scnr, random, ans);
                if(correct==true)
                    numCorrect++;
            }
            if(numCorrect>7.5)
                System.out.println("Congratulations, you are ready to go to the next level!\n");
            else
                System.out.println("Please ask your teacher for extra help.\n");
            }
        }
}
