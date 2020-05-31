package ru.mikhail.app.easy;

public class Count_Primes_204 {
    public int countPrimes(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            /*if (i / 2 != 0 && i / 3 != 0 && i / 5 != 0 && i / 7 != 0) {
                result++;
            }*/

            if ((i / 2 == 0 && i % 3 == 0)|| i == 2){
                result++;
            } else
            if ((i / 3 == 0 && i % 3 == 0) || i == 3){
                result++;
            } else
            if ((i / 5 == 0 && i % 5 == 0) || i == 5){
                result++;
            } else
            if ((i / 7 == 0 && i % 7 == 0) || i == 7){
                result++;
           } else
            if ((i / 11 == 0 && i % 11 == 0) || i == 11){
                result++;
            } else
            if ((i / 13 == 0 && i % 13 == 0) || i == 13){
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 10;
        //int n = 2;
        Count_Primes_204 function = new Count_Primes_204();
        System.out.println(function.countPrimes(n));
    }
}
