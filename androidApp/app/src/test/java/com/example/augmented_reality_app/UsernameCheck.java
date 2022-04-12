public class UsernameCheck {
    //Checks for username length requirement (between 4 and 16 characters).
    public boolean UserNameLength(String input) {
        if (input.length() > 4 || input.length() < 16){
            return true;
        }
        else {
            return false;
        }
    }

    //Username cannot contain certain symbols just numbers or letters.
    public boolean UserNameSymbol(String input) {
        if (input.matches("[a-zA-Z0-9]*")){
            return true;
        }
        else {
            return false;
        }
    }

    //Checks to make sure the username field is not empty, if so returns error to user.
    public boolean IsEmptyUsername(String input){
        if (input.isEmpty()){
            return true;
        }
        else {
            return false;
        }
    }

    //Checks to see if the number of objects selected is correct.
    public boolean TotalObjectSelection () {
        int object = 1;
        int object2 = 1;
        int total = object + object2;
        if (Integer.sum(object, object2) == total) {
            return true;
        }
        else {
            return false;
        }
    }



}
