import java.util .*;
public class student_status {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks");
        int marks= sc.nextInt();

        //ternary operator
        String status= (marks>33)?"pass" : "fail" ;  // x:y means if not x then y ......and this value will assign to status
        System.out.println(status);
        sc.close();
    }
}
