import java.util.*;

class FirstLastMiddle{

    public static void execute(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input string:");
        String s = sc.nextLine();
        int strLength = s.length();
        String resultString = "";
        resultString = resultString + s.charAt(0) + " ";
        if(strLength>1){
            resultString = resultString + s.charAt(strLength - 1) + " ";
        }
        for(int i=1; i < strLength - 1; i++){
            resultString = resultString + s.charAt(i);
        }
        System.out.println(resultString);
    }
}


class Monogram {
    public static void execute(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input string:");
        String str = sc.nextLine();
        String[] arrOfStr = str.split(" ");
        int arrLength = arrOfStr.length;
        
        if(arrOfStr.length > 1){
            for(int i=0; i< arrLength ; i++){
                resultString = resultString + arrOfStr[i].charAt(0);
            }
        }
        System.out.println(resultString);
    }
}

public class QuestionOne {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1. First Middle last");
            System.out.println("2. Monogram");
            System.out.println("0. Exit");
            int choice = sc.nextInt();
            switch(choice){
                case 1: FirstLastMiddle.execute();
                        break;
                case 2: Monogram.execute();
                        break;
                case 0: return;
                default: System.out.println("Invalid Choice")
            }
        }
    }
}