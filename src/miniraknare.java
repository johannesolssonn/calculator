import java.util.Scanner;

public class miniraknare {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int val = 0;
        double tal1 = 0;
        double tal2 = 0;
        boolean isNumber;

        System.out.println("welcome to the calculator");

        System.out.println("\nHär är dina val:");
        System.out.println("\n1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        do {

            System.out.print("\nWhat would you like to do?: ");
            if (input.hasNextInt()){
                val = input.nextInt();
                isNumber = true;


            }else {
                System.out.println("i dont understand you, you need to write a number ");
                isNumber = false;
                input.next();
            }

        }while (!(isNumber));
        boolean b = true;
        while (b) {
            if (val > 4) {
                System.out.println("Write something between 1-4");
                val = input.nextInt();
            } else {
                System.out.println();
                b= false;
            }
        }
        System.out.println(val);

        do {

            System.out.print("write your first number ");
            if (input.hasNextDouble()){
                tal1 = input.nextDouble();
                isNumber = true;

            }else {
                System.out.println("i dont understand you, you need to write a number ");
                isNumber = false;
                input.next();
            }

        }while (!(isNumber));
        System.out.println(tal1);

        do {

            System.out.print("write your second number");
            if (input.hasNextDouble()){
                tal2 = input.nextDouble();
                isNumber = true;

            }else {
                System.out.println("i dont understand you, you need to write a number ");
                isNumber = false;
                input.next();
            }

        }while (!(isNumber));
        System.out.println(tal2);



        if(val == 1){
            System.out.println("The answer is : " + Operationer.add(tal1,tal2));
        }
        else if(val == 2){
            System.out.println("The answer is: " + Operationer.sub(tal1,tal2));
        }
        else if(val == 3){
            System.out.println("The answer is : " + Operationer.mul(tal1,tal2));
        }
        else if(val == 4){
            System.out.println("The answer is: " + Operationer.div(tal1,tal2));
        }



    }

}

