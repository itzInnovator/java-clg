/*
 * Using For loop to print Odd and Even numbers from 1 to 10
*/

public class forloop {
    public static void main(String args[]){

        System.out.println("\nOdd numbers between 1 to 10");
        for(int i=1; i<=10; i+=2) {
            System.out.print(i+"\t");
        }

        System.out.println("\n\nEven numbers between 1 to 10");
        for(int i=2; i<=10; i+=2){
            System.out.print(i+"\t");
        }

    }
}