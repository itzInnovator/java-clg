package arithmetic;

public class multiplication {
    int a,b;
    
    public multiplication(int x1, int x2) {
        a=x1;
        b=x2;
    }

    public void mul() {
        int s = a*b;
        System.out.println("Multiplication of A and B : "+s);
    }
}
