package com.example.augmented_reality_app;

public class User {
    public String fullname , age , email;

    public User(){


    }
    public User(String fullname , String age , String email){

        this.fullname = fullname;
        this.age =age;
        this.email = email;
    }

    public int addition(int userNum, int userNum2) { return userNum + userNum2; }

    public int subtraction(int userNum, int userNum2){ return userNum - userNum2; }

    public int division(int userNum, int userNum2) { return userNum / userNum2; }

    public int multiplication(int userNum, int userNum2) { return userNum * userNum2; }

    public int powerOfTwo(int userNum) { return userNum * userNum; }

    public double squareRoot(int userNum) { return Math.sqrt(userNum); }

}
