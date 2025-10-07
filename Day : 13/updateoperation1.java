public class updateoperation1 {
    public static int updateithbit(int n,int pos,int newbit) {
        if(newbit == 0) {
            //clear the bit
            int bitmask = ~(1<<pos);
            return n & bitmask;
        } else {
            //set the bit
            int bitmask = (1<<pos);
            return n | bitmask;
        }
    }
    public static void main(String[] args) {
       System.out.println(updateithbit(10,2,1));
    }
    
}
