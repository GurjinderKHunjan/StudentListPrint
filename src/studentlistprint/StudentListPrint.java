package studentlistprint;

public class StudentListPrint {

    public static void main(String[] args) {

        //store and print the student list
        Student[] list = new Student[3]; //decleration Array of object
        
        Student StdName = new Student();
        
        StdName.setName("Peter");
        StdName.setAge(21);
        
        Student StdName2 = new Student();
        
        StdName2.setName("Parul");
        StdName2.setAge(20);
        
        Student StdName3 = new Student();
        
        StdName3.setName("Mia");
        StdName3.setAge(19);
        
        list[0] = StdName;
        list[1] = StdName2;
        list[2] = StdName3;
        
        for(int i = 0; i<list.length; i++){
            
            System.out.println( list[i].getName()+ " " + list[i].getAge());
        }
        
    }
    
}
