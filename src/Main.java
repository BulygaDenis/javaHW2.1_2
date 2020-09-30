public class Main {
    public static void main(String[] args) {
        boolean registred = true;
        int percent;
        if (registred) {
            percent = 1;
        }
        long account = 100;
        long transfer = 2100;
        long bonus = transfer / 100;
        long limit = 1000;
        if (transfer < limit) {
            bonus = 0;
        }
        long amount = account + transfer + bonus;
        System.out.println(amount);
    }
}