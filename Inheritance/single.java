/* 
 * Here we take an example of a company_info which is extended by the employee class and it's properties.
*/

class company_info {
    int cid;
    String cname;

    company_info(int ci, String cn) {
        cid = ci;
        cname = cn;
    }
}

class employee extends company_info {
    int eid;
    String ename;

    employee (int ci, String cn, int ei, String en) {
        super(ci, cn);
        eid = ei;
        ename = en;
    }

    void display() {
        System.out.println("\n -- Company Details --");
        System.out.println("Company ID : "+cid+"\nCompany Name : "+cname);
        System.out.println("\n -- Employee Details -- ");
        System.out.println("Employee ID : "+eid+"\nEmployee Name : "+ename);
    }
}

class single {
    public static void main(String args[]) {
        employee e = new employee(333, "CoreV", 111, "Abc");

        e.display();
    }
}