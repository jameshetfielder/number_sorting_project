import java.util.Scanner;
 class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3;

        System.out.print("Please enter 1st number: ");
        num1 = input.nextInt();
        System.out.print("Please enter 2nd number: ");
        num2 = input.nextInt();
        System.out.print("Please enter 3rd number: ");
        num3 = input.nextInt();

        if (num1 > num2 && num1 > num3){
            if(num2 > num3){
                System.out.print(num1 + ">" + num2 + ">" + num3);
            }else{
                System.out.print(num1 + ">" + num3 + ">" + num2);
            }
        }
        else if (num2 > num1 && num2 > num3){
            if(num1 > num3){
                System.out.print(num2 + ">" + num1 + ">" + num3);
            } else{
                System.out.print(num2 + ">" + num3 + ">" + num1);
            }
}
        else if (num3 > num1 && num3 > num2){
            if(num1 > num2){
                System.out.print(num3 + ">" + num1 + ">" + num2);
            }else{
                System.out.print(num3 + ">" + num2 + ">" + num1);
            }
        }
        else {
            System.out.print("An error occured. \nPlease restart the program.");
        }
    }
}