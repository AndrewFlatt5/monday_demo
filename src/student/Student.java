package student;
import java.util.Scanner;

/**
 *
 * @author AndyR
 */
public class Student {
    
    int id;
    String name;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Student s= new Student();
        Student[] list=new Student[5];
        
                
        
//        list[0].id= 101;
//        list[0].name="ABC";
//                
                
        Scanner in = new Scanner(System.in);
        
        for(int i=0; i<=list.length-1;i++)
        {
            list[i]=new Student();
            System.out.print("Enter Student ID: ");
            list[i].id=in.nextInt();
            System.out.print("Enter Student Name: ");
            list[i].name = in.next();
      
        }
       /* for(int i=0; i<=list.length-1;i++)
        {
            System.out.print("Student ID; "+list[i].id+"Student name;" +list[i]);
        }*/
        
    }
    
}
