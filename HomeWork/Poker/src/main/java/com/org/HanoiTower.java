package com.org.sample;

public class HanoiTower {
    public static void hanoi(int n, char source, char auxiliary, char target) {
        if (n == 1) {
            System.out.println("Переместить диск " + " ( " +  n + " ) " + " с " + source + " на " + target);
            return;
        }
        hanoi(n - 1, source, target, auxiliary);
        System.out.println("Переместить диск " + " ( " +  n + " ) " + " с " + source + " на " + target);
        hanoi(n - 1, auxiliary, source, target);
    }

    public static void main(String[] args) {
        int n = 3;
        char sourceRod = 'A';
        char auxiliaryRod = 'B';
        char targetRod = 'C';


        hanoi(n, sourceRod, auxiliaryRod, targetRod);
    }
}