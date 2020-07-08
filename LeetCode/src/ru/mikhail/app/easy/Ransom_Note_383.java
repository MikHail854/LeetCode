package ru.mikhail.app.easy;

import java.util.ArrayList;

/**
 * Given an arbitrary ransom note string and another string containing letters from all the magazines,
 * write a function that will return true if the ransom note can be constructed from the magazines ;
 * otherwise, it will return false.
 *
 * Each letter in the magazine string can only be used once in your ransom note.
 *
 * Example 1:
 * Input: ransomNote = "a", magazine = "b"
 * Output: false
 *
 * Example 2:
 * Input: ransomNote = "aa", magazine = "ab"
 * Output: false
 *
 * Example 3:
 * Input: ransomNote = "aa", magazine = "aab"
 * Output: true
 */
public class Ransom_Note_383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        ArrayList<Character> magazineList = new ArrayList();
        ArrayList<Character> ransomList = new ArrayList();

        for (int i = 0; i < magazine.length(); i++) {
            magazineList.add(magazine.charAt(i));
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            ransomList.add(ransomNote.charAt(i));
        }
        for (int i = 0; i < magazineList.size(); i++) {
            for (int j = 0; j < ransomList.size(); j++) {
                if (ransomList.get(j) == magazineList.get(i)) {
                    ransomList.remove(j);
                    magazineList.remove(i);
                    i = -1;
                    break;
                }
            }
        }
        return ransomList.size() == 0;
    }

    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        Ransom_Note_383 function = new Ransom_Note_383();
        System.out.println(function.canConstruct(ransomNote, magazine));
    }
}
