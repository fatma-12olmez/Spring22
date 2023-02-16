package day28;

public class E04 {
    // Try block cannot be used alone,can be used with 1 or more catch blocks.
    public static void main(String[] args) {
        convertStringToIntegerThenDivideByGivenNumber("2314",2);

        convertStringToIntegerThenDivideByGivenNumber("1a",3);//NumberFormatException==>Runtime Exception   ====Issue occurred in conversion
        convertStringToIntegerThenDivideByGivenNumber("12",0);//Issue occurred in division

    }
    public static void convertStringToIntegerThenDivideByGivenNumber(String s,int num){

        try { System.out.println(Integer.parseInt(s)/num);

        }catch (NumberFormatException e) {

            System.out.println("Issue occurred in conversion");

        }catch (ArithmeticException e){

            System.out.println("Issue occurred in division");
    }



    }
}
