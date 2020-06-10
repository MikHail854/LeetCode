package ru.mikhail.app.easy;

/**
 * You are playing the following Bulls and Cows game with your friend:
 * You write down a number and ask your friend to guess what the number is.
 * Each time your friend makes a guess, you provide a hint that indicates
 * how many digits in said guess match your secret number exactly in both digit
 * and position (called "bulls") and how many digits match the secret number but
 * locate in the wrong position (called "cows"). Your friend will use successive guesses
 * and hints to eventually derive the secret number.
 *
 * Write a function to return a hint according to the secret number and friend's guess,
 * use A to indicate the bulls and B to indicate the cows.
 *
 * Please note that both secret number and friend's guess may contain duplicate digits.
 *
 * Example 1:
 * Input: secret = "1807", guess = "7810"
 * Output: "1A3B"
 * Explanation: 1 bull and 3 cows. The bull is 8, the cows are 0, 1 and 7.
 *
 *  Example 2:
 * Input: secret = "1123", guess = "0111"
 * Output: "1A1B"
 * Explanation: The 1st 1 in friend's guess is a bull, the 2nd or 3rd 1 is a cow.
 *
 * Note: You may assume that the secret number and your friend's guess only contain digits,
 * and their lengths are always equal.
 */
public class Bulls_and_Cows_299 {
    public String getHint(String secret, String guess) {
        int[] nums = new int[10];
        int bulls = 0;
        int cows = 0;
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bulls++;
            } else {
                nums[secret.charAt(i) - '0']++;
            }
        }

        for (int i = 0; i < guess.length(); i++) {
            char curGuess = guess.charAt(i);
            if (secret.charAt(i) != curGuess && nums[curGuess - '0'] > 0) {
                cows++;
                nums[curGuess - '0']--;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(bulls).append("A").append(cows).append("B");
        return sb.toString();
        // return new String(bulls+"A"+cows+"B"); this beats only 90%

    }

    public static void main(String[] args) {
        //String secret = "1807";
        //String guess = "7810";
        //String secret = "1123";
        //String guess = "0111";
        String secret = "11";
        String guess = "01";
        Bulls_and_Cows_299 function = new Bulls_and_Cows_299();
        System.out.println(function.getHint(secret, guess));
    }
}
