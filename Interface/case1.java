/* 
 * Using Interface to find Area of Rectangle and Circle
*/

interface area {
    double pie=3.14;
    public void ar();
}

class rectangle implements area {
    int l, b;

    rectangle(){
        l=10;
        b=20;
    }

    public void ar() {
        int a = l*b;
        System.out.println("Area of Rectangle : "+a);
    }
}

class circle implements area {
    int r;

    circle() {
        r = 5;
    }

    public void ar() {
        double a = pie * r * r ;
        System.out.println("Area of Circle : "+a);
    }
}

public class case1 {
    public static void main (String args[]) {

        rectangle obj1 = new rectangle();
        circle obj2 = new circle();

        obj1.ar();
        obj2.ar();

    }
}