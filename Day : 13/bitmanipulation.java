public class Bitmanipulation{
    public static void main(String args[]){
        //5 = 0101 here first 0 is MSB (Most Significant Bit) and last 1 is LSB (Least Significant Bit)
        //3 = 0011
        System.out.println(5&3); // Bitwise AND - ampersand
        System.out.println(5|3); // Bitwise OR - pipe
        System.out.println(5^3); // Bitwise XOR - caret 
        //i.e. if both bits are same then 0 else 1
    
        System.out.println(~5); 
        System.out.println(~3);  // Bitwise NOT - tilde 
        //means 2's complement where we do first 1's complement i.e. invert the bits and then add 1 because it is negative number due to MSB 1 when we do 1's complement . for positive number we just do 1's complement . lets see for 5 and 3
        // ~5 = 1010 + 1 = 1011 = -6
        // ~3 = 1100 + 1 = 1101 = -4

        System.out.println(5<<2); // Left Shift 
        System.out.println(5>>2); // Right Shift
       
    }
}
// formula for left shift = a * 2^b where n is number and x is number of bits to be shifted
// formula for right shift = a / 2^b where n is number and x is number of bits to be shifted
