public class primesinrange {

    public static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
     public static void primesinrange(int n){
        for(int i=2; i<=n; i++){
            if(isprime(i)){//true 
                System.out.println(i + " ");
            }
        
        }
        System.out.println();
      
    }

    public static void main(String args[]){
       
    primesinrange(10);//2 to 10
        }
    }
