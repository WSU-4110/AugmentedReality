package com.example.augmented_reality_app;

public class info_checker {

    public info_checker(){


    }
    public  boolean passwordlengthcheck(String input){

        if (input.length() < 6){
            return true;

        }
        else return false;


    }
    public boolean PasswordEmptyCheck(String input){
        if (input.isEmpty()) return true;
        else return false;

    }
    public boolean emaillengthcheck(String input){

        if(input.length() < 10) return false;

        else return true;
    }

    public boolean agecheck(String input){

        if ( Integer.valueOf(input)<0 || Integer.valueOf(input) >120)
            return false;
        else return true;


    }
    public boolean EmailCheck(String input){
        Boolean checker =false;
        for (int i = 0; i< input.length(); i++){

            if (input.charAt(i) == '@') checker = true;

        }

        return checker;
    }



}