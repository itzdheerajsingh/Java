import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<Integer> st = new ArrayDeque<>();

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println(st.peek()); // 30
        System.out.println(st.pop());  // 30
    }
}