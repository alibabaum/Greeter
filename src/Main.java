import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner intScanner = new Scanner(System.in);
        //make a scanner for every data type you're going to use
        System.out.println("What's your name");
        Scanner stringScanner = new Scanner(System.in);
        String name = stringScanner.next();
        //each new string uses type of scanner you established above.
        System.out.println(name + " is a beautiful name! The name of a true monarch!");
        System.out.println("Anyway, where are you from?");
        String homeCountry = stringScanner.next();
        System.out.println("I've never heard of " + homeCountry + ".");
        System.out.println("Hold are you?");
        int age = intScanner.nextInt();
        System.out.println("I had no idea the people of " +homeCountry +
                " could live to the age of " + age + " .");
        System.out.println("What's your favorite thing to do?");
        String activity = stringScanner.next();
        System.out.println(activity + "? I guess there's room for everyone.");
        System.out.println("Well, anyway. How much money can you give for world peace? Please round to the nearest hundreth.");
        int donation = intScanner.nextInt();
        //hit enter for readability.
        System.out.println(donation + " bucks? Wow. We will forever be in your debt. Your " + donation +
                "has saved us. I'm surprised you can even part with it. " +
                "You should feel proud. You've single-handedly solved war " +
                "with your incredibly generous $" + donation);

    }
}