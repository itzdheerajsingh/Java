public class accessmodifier {
    public static void main(String[] args) {
        Bankaccount myacc= new Bankaccount();
        myacc. username="Dheeraj singh";
        //myacc.password="mypassword"; // This line would cause an error because password is private
        myacc.setpassword("mypassword");
        System.out.println("Username: " + myacc.username);
    }
   
}
 class Bankaccount{
       public String username;
        private String password; 
        public void setpassword(String pwd){
            password=pwd;
        }
    }
    // there are 4 types of access modifiers in java
    //1. private - accessible only within the defined class             
    //2. default (no modifier) - accessible only within the same package
    //3. protected - accessible within the same package and subclasses
    //4. public - accessible from any other class