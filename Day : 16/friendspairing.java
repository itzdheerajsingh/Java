public class friendspairing {
    public static int pairing(int n) {
        // Base cases
        if (n == 1 || n == 2) {
            return n;
        }

        // Single: the nth friend stays single
        int fnm1 = pairing(n - 1);

        // Pairing: the nth friend pairs up with (n-1) others
        int fnm2 = pairing(n - 2);
        int pairways = (n - 1) * fnm2;

        // Total ways = single + pairing
        int totalways = fnm1 + pairways;

        return totalways;
    }

    public static void main(String[] args) {
        System.out.println(pairing(3));
    }
}
