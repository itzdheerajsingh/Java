public class staticeg {
    public static void main(String args[]){
        student s1=new student();
        student.collegename="ABC College";
        student s2=new student();
        System.out.println(s1.collegename);
        student s3=new student();
        s3.collegename="XYZ College";
        
    }
}
class student{
    String name;
    int rollno;
    static String collegename;
    static int returnpercentage(int phy, int chem, int math){
        return (phy+chem+math)/3;
    }
    void setName(String name){
        this.name=name;
    }
    String getname(){
        return this.name;
    }
}