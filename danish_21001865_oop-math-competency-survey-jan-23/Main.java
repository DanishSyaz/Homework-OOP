/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

public class Main {
    // Application code
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        School sk1 = new School();

        // Direct access to attributes is not a good practices
        System.out.print("Enter School Name: ");
        sk1.setName(sc.nextLine());

        Address addr = new Address();
        System.out.print("Enter Street: ");
        addr.setStreet(sc.nextLine());
        System.out.print("Enter District: ");
        addr.setDistrict(sc.nextLine());
        System.out.print("Enter Postcode: ");
        addr.setPostcode(sc.nextLine());
        System.out.print("Enter State: ");
        addr.setState(sc.nextLine());
        sk1.setAddress(addr);
        
        System.out.println("");
        System.out.println("School Name: " + sk1.getName());

        Marks marks = new Marks();
        System.out.print("Enter Student Count: "); // Enter the input 2 times due to unknown reasons
        marks.createData(sc.nextInt());
        int studentCount = sc.nextInt();
        
        for(int i=0;i<studentCount;i++){
            System.out.print("Enter Marks for Student #" + i + ": ");
            marks.setMark(sc.nextInt(),i);
        }
        
        System.out.println("");
        
        for(int i=0;i<studentCount;i++){
            float mark = marks.getMark(i);
            System.out.println("Marks for student #" + i + " is " + mark);
        }
    }
}
