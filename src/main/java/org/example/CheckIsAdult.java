package org.example;

public class CheckIsAdult {
    int age;

    public boolean checkIsAdult(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
