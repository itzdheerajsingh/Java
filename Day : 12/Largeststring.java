// Finding Largest String by Lexicographically i.e. Dictionary Order comparison
public class Largeststring {
    public static void main(String args[]){
        String fruits[]={"apple","mango","banana"};
        String largest=fruits[0];
        for(int i=0; i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
        // 0 means both are equal, +ve i.e. >0 means st1>st2, -ve means i.e. <0 st1<st2
        // if its < 0 then st1<st2 then st2 is larger string and replace larger by st2
                largest=fruits[i];
            }
        }
        System.out.println("Largest String is: "+largest);
    }
}
// comparetoignorecase() method ignores case differences i.e. A,a will be treated same in string comparison
// compareto() method considers case differences i.e. A,a will be treated different in string comparison