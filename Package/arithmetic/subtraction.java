package arithmetic;

public class subtraction {
    int a, b;
    
    public subtraction (int x1, int x2) {
        a=x1;
        b=x2;
    }

    public void sub() {
        int s = a-b;
        System.out.println("Subtraction of A and B : "+s);
    }
}
