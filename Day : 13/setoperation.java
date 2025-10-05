public class setoperation {
   
    public static int set(int n,int pos) {
        int bitmask = 1<<pos;
       return n | bitmask;
        
    }
    public static void main(String[] args) {
       
        System.out.println( set(10,2));
        //10 = 1010
        //pos = 2
        //1<<pos = 0100
    }
}

