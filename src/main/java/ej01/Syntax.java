package ej01;

public class Syntax {

    // Main method must be assigned like this
    public static void main(String[] args) {
        // Content
    }

    // Simple method with parameter & return
    public void action(String name) {
        System.out.println("Action: " + name);
    }

    // Conditional (if - else)
    public void isEven(int num) {
        if (num % 2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    // While method allows to continua execute the code til the condition stop being true
    public void countDown(int start) {
        while (start > 0) {
            System.out.println("Countdown: " + start);
            start--;
        }
    }
}
