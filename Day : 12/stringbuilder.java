public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Dheeraj");
        System.out.println(sb);
        sb.setCharAt(0, 'd');
        System.out.println(sb);
        sb.insert(0, 'A');
        System.out.println(sb);
        sb.deleteCharAt(0);
        System.out.println(sb);
        sb.append(" Singh");
        sb.setCharAt(0, 'D');

        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());

         StringBuilder sb2 = new StringBuilder("");
         for(char ch='a';ch<='z';ch++){
             sb2.append(ch);
         }
         System.out.println(sb2);
         System.out.println(sb2.length());
         System.out.println(sb2.capacity());
     
    }
    
}
