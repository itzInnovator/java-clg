/*
 * Sorting array into Ascending order
*/

public class array_sort {
    public static void main(String args[]) {

        int a[] = {30, 10, 5, 20, 50};
        int i, j, temp;
        int n=5; // Size of array

        for(i=0; i<n; i++) {
            for(j=i+1; j<n; j++) {
                if(a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("Array is Ascending order: ");
        for(i=0; i<n; i++) {
            System.out.print(a[i]+"\t");
        }

    }
}
