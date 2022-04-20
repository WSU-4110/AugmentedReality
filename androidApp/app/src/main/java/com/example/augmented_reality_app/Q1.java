//class user_info_checker
//{
//    public user_info_checker(){}
//
//    public boolean password(String user_input)
//    {
//        //checks to see whether it is a symbol such as @ or # (our passwords cannot be random symbols found online or ascii)
//        for(int i = 0; i < user_input.length(); i++)
//        {
//            if(Character.isDigit(user_input.charAt(i)) == false)
//            {
//                return true;
//            }
//        }
//
//        //checks whether it is a number or not
//        int x = Integer.parseInt(user_input);
//        if (((x % 2) == 0 ) || (x%2) != 0)
//        {
//            return true;
//        }
//        else
//        {
//            return false;
//        }
//
//    }
//
//    //checks to see whether it is adding correctly for total output of costs
//    public boolean totalCostAddition()
//    {
//        int x = 1;
//        int y = 2;
//        int c = x + y;
//        if(Integer.sum(x,y) == c)
//        {
//            return true;
//        }
//        else
//        {
//            return false;
//        }
//    }
//
//    //checks between user input packages from unity "buttons" and search options within UI of application
//    public boolean userObjectSelection(String user_input)
//    {
//        String firstObj = "Chair";
//        String secondObj = "Gaming Chair";
//        String thirdObj = "Office Chair";
//
//        if((user_input.equalsIgnoreCase(user_input) != firstObj.equalsIgnoreCase(firstObj)) || (user_input.equalsIgnoreCase(user_input) != secondObj.equalsIgnoreCase(secondObj)) || (user_input.equalsIgnoreCase(user_input) != thirdObj.equalsIgnoreCase(thirdObj)))
//        {
//            return false;
//        }
//        else
//        {
//            return true;
//        }
//
//    }
//
//    //max capacity is between 0-16 for search length
//    public boolean searchBarLength(String user_input)
//    {
//        if ((user_input.length() > 0) && (user_input.length() < 16))
//        {
//            return true;
//        }
//        else
//        {
//            return false;
//        }
//
//    }
//
//}
