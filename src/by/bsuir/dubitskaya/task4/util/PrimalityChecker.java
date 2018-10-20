package by.bsuir.dubitskaya.task4.util;

public class PrimalityChecker {
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2, max = (int) Math.round(Math.sqrt(number)); i <= max; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
