import java.util.*;

public class ParenthesesChecker {


    public static boolean checkParentheses(String testString) {

        int leftParentheses = 0;
        int rightParentheses = 0;
        for (Character character : testString.toCharArray()){
            if (character == '('){
                leftParentheses += 1;
            } else if (character == ')' ){
                rightParentheses += 1;
            }else leftParentheses += 0;
        }
        if (leftParentheses == rightParentheses){
            return true;
        } else {
            return false;
        }

    }


}


