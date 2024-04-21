/*
In Java, Multiple inheritance is not possible. Therefore, we use 'interface' to do so. 
Let's take an example of finding area of circle and rectangle.
*/

interface area {
    double pie = 3.14;
    public void ar();
}

class rectangle implements area {
    int l, b;

    rectangle(){
        l=10;
        b=20;
    }

    public void ar() {
        System.out.println("Area of Rectangle : "+(l*b));
    }
}

class circle implements area {
    int r;

    circle() {
        r = 5;
    }

    public void ar() {
        System.out.println("Area of Circle : "+(pie*r*r));
    }
    
}

public class multiple {
    public static void main(String args[]) {
        rectangle obj1 = new rectangle();
        circle obj2 = new circle();

        obj1.ar();
        obj2.ar();
    }
}
