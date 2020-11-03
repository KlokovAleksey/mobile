public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int deposite = 100;
        int bonus;
        int cash;
        if (deposite > 1000) {
            bonus = deposite / 100;
            cash = balance + deposite + bonus;
        } else {
            cash = balance + deposite;
        }
        System.out.println(cash);
    }
}