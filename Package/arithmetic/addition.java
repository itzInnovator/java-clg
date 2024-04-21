package arithmetic;

public class addition {
    int a,b;

    public addition(int x1, int x2) {
        a = x1;
        b = x2;
    }

    public void add() {
        int s = a+b;
        System.out.println("Addition of A & B : "+s);
    }

}