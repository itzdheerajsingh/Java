public class constructortype {

 public static void main(String[] args) {
    student s1=new student("Dheeraj");
    student s2=new student();
    student s3=new student("Amit", 21);

        student s4=new student();
        s4.name="Rahul";
        s4.age=22;
        s4.password="myPass123";
        s4.marks[0]=80;
        s4.marks[1]=85;
        s4.marks[2]=90;
        student s5=new student(s4); // Using copy constructor
        s5.password="xyz789";
        s4.marks[0]=70;  // shallow copy demonstration it will affect s5 as well
        for(int i=0;i<3;i++){
            System.out.println(s5.marks[i]);
        }
        student s6=new student(s4); // deep copy constructor
         s4.marks[0]=70;
    }   
}
class student{
        String name;
        int age;
        String password;
        int marks[];

        // Parameterized constructor
        student(String name){
            this.name=name;
            
        }
        // Default or non-parameterized constructor
            student(){
            marks=new int[3];
            System.out.println("Constructor called...");
        }   
        // You can also have multiple constructors (Constructor Overloading)
        student(String name, int age){
            marks=new int[3];
            this.name=name;
            this.age=age;
        }
        // shallow copy constructor
        student(student s4){
            marks=new int[3];
            this.name=s4.name;
            this.age=s4.age;
            this.marks=s4.marks;
        }
        // // deep copy constructor
                // student(student s4){
                //     marks=new int[3];
                //     this.name=s4.name;
                //     this.age=s4.age;
                //     for(int i=0;i<3;i++){
                //         this.marks[i]=s4.marks[i];
                //     }
                // }
}