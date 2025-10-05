public class clearoperation {
    public static int clear(int n,int pos) {
        int bitmask = ~(1<<pos);
       return n & bitmask;
        
    }
    public static void main(String[] args) {
       
        System.out.println( clear(10,1));
        //10 = 1010
        //pos = 1
        //1<<pos = 0010
        //~(1<<pos) = 1101
        //n & bitmask = 1010 & 1101 = 1000 = 8
    }
}
