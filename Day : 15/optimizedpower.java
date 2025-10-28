public class optimizedpower {
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        //for even n
        int halfpower=power(x, n/2)*power(x, n/2);        
        //for odd n
        if(n%2!=0){
            halfpower=x*halfpower;
        
            
        }
        return halfpower;
    }
        public static void main(String args[]){
        System.out.println(power(2,10));
    }
}
