public class updateoperation {
    public static int update(int n,int pos,int value) {
        int bitmask = ~(1<<pos);
        n = n & bitmask;
        return n | (value<<pos);
        
    }
    public static void main(String[] args) {
       
        System.out.println( update(10,1,1));
        //10 = 1010
        //pos = 1
        //value = 1
        //1<<pos = 0010
        //~(1<<pos) = 1101
        //n & bitmask = 1010 & 1101 = 1000 = 8
        //n | (value<<pos) = 1000 | 0010 = 1010 = 10
    }
}
