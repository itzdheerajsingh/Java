public class type_promotion2 {
    public static void main(String args[]){
        int a =10;
        float b=12.5f;
        char c='i';
        long d=123456789;
        double e=1234.56789;

      //  int ans = a+b+c+d+e;   //this will give error because all variable are in double and double is higher tham int
     // due to type promotion rule 2 i.e. if there is float,long,double . so, all variables will be promoted to higher data type i.e.in this code double
     double ans = a+b+c+d+e; 
     System.out.println(ans); // here all the variables will be promoted to double and then addition will be done
    }
}
