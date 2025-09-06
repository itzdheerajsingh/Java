public class binarytodeceg {
    public static void bianrytodec(int binarynum){
        int mynum= binarynum;
        int pow=0;
        int decnum=0;
        while(binarynum>0){
            int lastdigit= binarynum%10;
            decnum = decnum + (lastdigit*(int)Math.pow(2,pow));//math.pow is used to calculate power(base, exponent)
            pow++;
            binarynum = binarynum/10;

        }
        System.out.println("decimal of " + mynum + " is " + decnum);

    }
    public static void main(String args[]){
        bianrytodec(1011);

    }
}
