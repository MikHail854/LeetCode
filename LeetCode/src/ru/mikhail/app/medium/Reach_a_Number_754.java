package ru.mikhail.app.medium;

public class Reach_a_Number_754 {
    public int reachNumber(int target) {
        long sum = 0;
        int step = 1;
        if (target < 0) {
            target = -target;
        }
        while (sum < target) {
            sum += step;
            step++;
        }
        while ((sum - target) % 2 != 0) {
            sum += step;
            step++;
        }
        return step - 1;
    }

    public static void main(String[] args) {
        int target = -1;
        Reach_a_Number_754 function = new Reach_a_Number_754();
        System.out.println(function.reachNumber(target));
    }
}
