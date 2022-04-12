public class userTest {

    public boolean ageEmptyCheck(String input){
        if(input.length()==0){
            return true;
        }
        else
            return false;
    }

    public boolean emailEmptyCheck(String input){
        if(input.length()==0){
            return true;
        }
        else
            return false;
    }

    public boolean isPasswordConfirmed(String passwordInput, String confirmPasswordInput){
        if(passwordInput==confirmPasswordInput)
            return true;
        else
            return false;
    }

    public boolean isConfirmedEmptyCheck(String confirmedPassword){
        if(confirmedPassword.length()==0)
            return true;
        else
            return false;
    }

}

