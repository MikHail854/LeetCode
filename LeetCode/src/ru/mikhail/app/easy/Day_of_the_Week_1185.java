package ru.mikhail.app.easy;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Given a date, return the corresponding day of the week for that date.
 *
 * The input is given as three integers representing the day, month and year respectively.
 *
 * Return the answer as one of the following values
 * {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}.
 *
 *
 * Example 1:
 * Input: day = 31, month = 8, year = 2019
 * Output: "Saturday"
 *
 *  Example 2:
 * Input: day = 18, month = 7, year = 1999
 * Output: "Sunday"
 *
 * Example 3:
 * Input: day = 15, month = 8, year = 1993
 * Output: "Sunday"
 *
 *
 * Constraints:
 * The given dates are valid dates between the years 1971 and 2100.
 */
public class Day_of_the_Week_1185 {
    public String dayOfTheWeek(int day, int month, int year) {
        /**
         * Runtime: 62 ms, faster than 6.18% of Java online submissions for Day of the Week.
         * Memory Usage: 41.2 MB, less than 5.01% of Java online submissions for Day of the Week.
         *
         * It works correctly, but for a long time.
         */
        /*String date = day + "." + month + "." + year;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date dayWeek = null;
        try{
            dayWeek = simpleDateFormat.parse(date);
        }catch (Exception e){
            e.printStackTrace();
        }
        String day_Week = new SimpleDateFormat("EEEE").format(dayWeek);
        if (day_Week.equals("понедельник"))
            return "Monday";
        if (day_Week.equals("вторник"))
            return "Tuesday";
        if (day_Week.equals("среда"))
            return "Wednesday";
        if (day_Week.equals("четверг"))
            return "Thursday";
        if (day_Week.equals("пятница"))
            return "Friday";
        if (day_Week.equals("суббота"))
            return "Saturday";
        if (day_Week.equals("воскресенье"))
            return "Sunday";

        return day_Week;*/

        /**
         * Runtime: 0 ms, faster than 100.00% of Java online submissions for Day of the Week.
         * Memory Usage: 38.6 MB, less than 12.30% of Java online submissions for Day of the Week.
         */

        if (month == 1 || month == 2) {
            year = year - 1;
            month = month + 10;
        } else {
            month = month - 2;
        }
        return weekDay((day + (31 * month) / 12 + year + year / 4 - year / 100 + year / 400) % 7);
    }

    private static String weekDay(int day) {
        switch (day) {
            case 0:
                return "Sunday";
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            default:
                return "";
        }
    }

    public static void main(String[] args) {
        int day = 31;
        int month = 8;
        int year = 2019;
        Day_of_the_Week_1185 function = new Day_of_the_Week_1185();
        System.out.println(function.dayOfTheWeek(day, month, year));
    }
}
