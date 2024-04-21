/* 
 * Implementing the following Inheritance - https://i.imgur.com/5zS1vHE.png
*/

interface salary {
    int basic_salary=70000;
    public void basic_sal();
}

class employee {
    String name;
    int age;
    
    employee(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("\nEmployee Name : "+name);
        System.out.println("Employee Age : "+age);
    }
}

class gross_salary extends employee implements salary {
    int ta, da,hra;

    gross_salary(String n, int a, int t, int d, int h) {
        super(n, a);
        ta = t;
        da = d;
        hra = h;
    }

    public void basic_sal() {
        System.out.println("\nBasic Salary : "+basic_salary);
    }

    void total_sal(){
        int total = basic_salary+ta+da+hra;

        System.out.println("Total Salary : "+total);
    }
}

public class case2 {

    public static void main(String args[]) {
        gross_salary obj = new gross_salary("abc", 30, 2000, 1500, 4000);

        obj.display();
        obj.basic_sal();
        obj.total_sal();
    }
    
}
