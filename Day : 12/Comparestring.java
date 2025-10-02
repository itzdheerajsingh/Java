public class Comparestring{
    public static void main(String args[]){
        String s1 = "spark";
        String s2= "spark";
        String s3= new String("spark");
        
        // == in string is used to compare both at object level as in string if we don't use new string then its value is assigned to previous string object that is used

        // equal becoz == compare at object level and both are same object as not used new
        if(s1==s2){
            System.out.println("strings are equal");
        }
        else{
            System.out.println("strings are not equal");
        }
        // not equal becoz == compare at object level and both are different object
         if(s1==s3){
            System.out.println("strings are equal");
        }
        else{
            System.out.println("strings are not equal");
        }
        if(s1.equals(s3)){// this equals function returns boolean value
              System.out.println("strings are equal");
        }
        else{
            System.out.println("strings are not equal");
        }
        
    }
}