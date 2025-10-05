public class getoperation {
    public static void get(int n,int pos) {
        if((n&(1<<pos))==0){
            System.out.println("Bit is 0");
        }
        else{
            System.out.println("Bit is 1");
        }
    }
    public static void main(String[] args) {
        get(10,2);
        
    }
}
