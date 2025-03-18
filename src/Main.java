
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        agecheck(30);
        betygsKalkylator(70);
        miniraknareif(3,6,'+');
        miniraknareschitch(3,4.6,"+");
        weekplaner(3);
        bmi(43,1.62);
        leapyear(1954);
        //scaner();
        love("anna","bengt");

    }

    //Övning 1: Ålderskontroll
    public static void agecheck(int a){

        int age= a;

        if(age<0){
            System.out.println("you where not born yet");
        }else if (age<13){
            System.out.println("You are still a child");
        }else if(age<=19){
            System.out.println("You are a teenager");
        }else if(age<=64){
            System.out.println("you are an adult");
        }else{
            System.out.println("you are old as fuck");
        }

    }

    //Övning 2: BetygsKalkylator
    public static void betygsKalkylator(int aa){
        int score = aa;

        String a = "A";
        String b = "B";
        String c = "C";
        String d = "D";
        String f = "F";


        if (score >= 90 && score <= 100) {
            System.out.println("Your grade is " + a);
        } else if (score >= 80 && score < 90) {
            System.out.println("Your grade is " + b);
        } else if (score >= 70 && score < 80) {
            System.out.println("Your grade is " + c);
        } else if (score >= 60 && score < 70) {
            System.out.println("Your grade is " + d);
        } else if (score < 60) {
            System.out.println("Your grade is " + f);
        } else {
            System.out.println("Invalid score");
        }
    }

    // Övning 3: Miniräknare med if sats
    public static void miniraknareif(int a, int b, char c){

        char operator = c; // Testa med olika operatorer: '+', '-', '*', '/'
        int sum = 0;

        if(operator == '+'){
            System.out.println(sum= a+b);
        }else if(operator == '-'){
            System.out.println(sum=a-b);
        }else if(operator== '*'){
            System.out.println(sum=a*b);
        }else if(operator=='/'){
            System.out.println(sum=a/b);
        }

    }
    // Övning 3: Miniräknare med switch sats och overloading
    public static void miniraknareschitch(int a, int b, String c){

        String operator = c;

        switch(operator){
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break;
        }

    }

    public static void miniraknareschitch(double a, double b, String c){

        String operator = c;

        switch(operator){
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break;
        }

    }

    //Övning 4: VeckoplaneringsApp
    public static void weekplaner(int a){

        int day = a;

        switch(day) {
            case 1:
                System.out.println("Måndag: Skola/Jobb");
                break;
            case 2:
                System.out.println("Tisdag: Gym");
                break;
            case 3:
                System.out.println("Onsdag: Studiecirkel");
                break;
            case 4:
                System.out.println("Torsdag: Ledig kväll");
                break;
            case 5:
                System.out.println("Fredag: Socialt umgänge");
                break;
            case 6:
            case 7:
                System.out.println("Lördag och Söndag: Vila och återhämtning");
                break;
            default:
                System.out.println("Only numbers between 1 and 7 are valid.");
                break;
        }

    }

    //uppgift 5: Övning 5: BMI-Kalkylator
    public static void bmi(double a, double b){

        double kg = a;
        double hight = b;
        double result = a/(b*b);

        if(result<18.5){
            System.out.println("You have: Undervikt");
        }else if(result<24.9){
            System.out.println("You have: Normalvikt");
        }else if(result<29.9){
            System.out.println(" You have: Övervikt");
        }else{
            System.out.println("you have: Fetma");
        }

    }

    //Övning 6: Skottår
    public static void leapyear(int x){

        int year = x;

        if(year % 4 == 0 || year % 400 == 0 ){
            System.out.println("This is a leap year");
        }else{
            System.out.println("This is not a leap year");
        }
    }

    //Övning 7: Förbättrad Miniräknare med Scanner
    /*public static void scaner(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the operator (+, -, *, /):");
        String operator = sc.next();  // Get the operator

        System.out.println("Enter the first number:");
        int a = sc.nextInt();  // Get the first number

        System.out.println("Enter the second number:");
        int b = sc.nextInt();  // Get the second number

        calculator2(a, b, operator);  // Call the calculator method

        sc.close();
    }

    public static void calculator2(int a, int b, String operator){


        switch(operator){
            case "+":
                System.out.println("The result is: " + (a+b));
                break;
            case "-":
                System.out.println("The result is: "+(a-b));
                break;
            case "*":
                System.out.println("The result is: "+(a*b));
                break;
            case "/":
                System.out.println("The result is: "+(a/b));
                break;
        }


    }
*/
    //Övning 8: KärleksKalkylator (inte klar)---------------------------
    public static void love(String nameOne, String nameTwo){

        int countlenght = nameOne.length();
        int countlenght2= nameTwo.length();
        System.out.println(countlenght + " and " + countlenght2);

        StringBuilder matchingChars = new StringBuilder();


    }
}