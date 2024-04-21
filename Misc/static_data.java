/* 
 * Showcasing usage of Static Data Member
*/

public class static_data {

    static int count;

    public static_data() {
        count++;
    }

    public static void main(String[] args) {
        static_data obj1 = new static_data();
        static_data obj2 = new static_data();
        static_data obj3 = new static_data();

        System.out.println("The number of objects created : " + count);
    }
}