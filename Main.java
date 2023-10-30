import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //1 - Write a Java method to find the smallest number among three numbers.

//        System.out.print("Input the first number: ");
//        int a = scan.nextInt();
//        System.out.print("Input the second number: ");
//        int b = scan.nextInt();
//        System.out.print("Input the third number: ");
//        int c = scan.nextInt();
//
//        smallest(a,b,c);

        //2- Write a Java method that check if the entered number is
        //negative or positive or zero.


//        System.out.print("Input a number: ");
//        int a = scan.nextInt();
//
//        check(a);


        //3 - Write a Java method to check whether a string is a valid password.
        //Password rules:
        //A password must have at least ten characters.
        //A password consists of only letters and digits.
        //A password must contain at least two digits.


        // -------- ten characters ---------

//        System.out.println("1. A password must have at least ten characters.\n2. A password consist of only letters and digits.\n3. A password must contain at least two digits.\nInput a password (You are agreeing to the above Terms and Conditions).");
//        String s = scan.next();
//        password(s,10);

        // -------- eight characters ---------

//        System.out.println("1. A password must have at least eight characters.\n2. A password consist of only letters and digits.\n3. A password must contain at least two digits.\nInput a password (You are agreeing to the above Terms and Conditions).");
//        String st = scan.next();
//        password(st,8);

        }

        public static void smallest(int a , int b ,int c){
            if(a<b && a<c) System.out.println("The smallest value is "+a);
            else if(b<a && b<c) System.out.println("The smallest value is "+b);
            else System.out.println("The smallest value is "+c);
        }
        public static void check(int a){
            if(a>0) System.out.println("positive");
            else if(a<0) System.out.println("negative");
            else System.out.println("zero");
        }

    public static  void password(String pass,int min){
        int digits = 0;
        int letdigit = 0;
        for(int i = 0 ; i<pass.length();i++){
            if(pass.codePointAt(i)>=48 && pass.codePointAt(i)<=57) digits++;
        }
        letdigit+=digits;
        for(int i = 0 ; i<pass.length();i++){
            if((pass.codePointAt(i)>=97 && pass.codePointAt(i)<=122)||(pass.codePointAt(i)>=65 && pass.codePointAt(i)<=90) ) letdigit++;
        }

        if(pass.length()>=min && digits>=2 && letdigit == pass.length()) System.out.println("Password is valid: "+pass);
        else System.out.println("Wrong password");
    }

    }
