
package student.list;


public class StudentList {
//Hello this is comment
    //Hello this is comment for rollback
    
    public static void main(String[] args) {
        
        Student s1 = new Student("s1", "Gurleen" );
     //  Scanner input = new Scanner(System.in) ;
     Student[] studentList = new Student[3] ;
     studentList[0] = s1;
     studentList[1] = new Student("s2", "abc");
     studentList[2] = new Student("s3", "def") ;
     
     for(int i = 0; i < studentList.length; i++) {
         System.out.println(studentList[i].getSname());
     }
       
       
       
       
       
    }
    
}
