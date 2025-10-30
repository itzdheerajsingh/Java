public class Binarywithnonrepeated1 {
    public static void checkbianryrepeated(int n,int lastplace,String str){
        // Base case
        if(n==0){
            System.out.println(str);
            return;
        }
        //recursion
        checkbianryrepeated(n-1,0,str+0);
        //lastdigit is 0
        if(lastplace==0){
               checkbianryrepeated(n-1,1,str+1);
        }
    }
    public static void main(String args[]){
        checkbianryrepeated(3,0,"");
    }
}
