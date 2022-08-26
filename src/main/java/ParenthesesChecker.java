import java.util.*;

public class ParenthesesChecker {


    public static boolean checkParentheses(String testString) {

        int leftParentheses = 0;
        int rightParentheses = 0;
        int leftSquare = 0;
        int rightSquare = 0;
        int leftCurly = 0;
        int rightCurly = 0;
        int leftAngle = 0;
        int rightAngle = 0;
        for (Character character : testString.toCharArray()){
            if (character == '('){
                leftParentheses += 1;
            } else if (character == '{' ){
                leftCurly += 1;
            } else if (character == '['){
                leftSquare += 1;
            } else if (character == '<'){
                leftAngle += 1;
            } else if (character == ')' ){
                rightParentheses += 1;
            } else if (character == ']'){
                rightSquare += 1;
            } else if (character == '}'){
                rightCurly += 1;
            } else if (character == '>'){
                rightAngle  += 1;
            } else leftParentheses += 0;
        }
        if (leftParentheses == rightParentheses && leftCurly == rightCurly && leftAngle == rightAngle && leftSquare == rightSquare){
            return true;
        } else {
            return false;
        }

    }


}


