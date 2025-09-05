public class prime {
//only for n>1
    public static boolean isprime(int n){
        if(n==2){
            System.out.println("prime");
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                System.out.println("not prime");
                return false;
            }
        
        }
        System.out.println("prime");
        return true;
    }

    public static void main(String args[]){
       
            System.out.println(isprime(10));
        }
    }
