
import java.util.Scanner;

public class Bot {
    final static Scanner scanner = new Scanner(System.in); 

    public static void main(String[] args) {
        greet("ErikaBot", "2020"); 
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a incredible name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("If an expression contains double, int, float, long, \nthen the whole expression will be automatically cast to ...");
        System.out.println("1. float");
        System.out.println("2. double");
        System.out.println("3. int");
        System.out.println("4. long");

        boolean flag = true;
        while(flag) {
            int option = scanner.nextInt();
            
            if (option == 2) {
                flag = false;                
            } else {
                System.out.println("Please, try again. I know you can do it!");
                
            }       
        }
    }

    static void end() {
        System.out.println("Congratulations, you're awesome! Have a nice day!"); 
    }
}