

public class LinearSearch_MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
            {1, 2, 3},
            {3, 4, 5},
            {5, 2, 6},
        };
        wealthCheck(accounts);
    }

    static void wealthCheck(int[][] accounts) {
        int cust = 1;
        for (int[] personAccounts : accounts) {
            int rowsum = 0;
            for (int account : personAccounts) {
                rowsum += account;
            }
            System.out.println(cust + " Customer wealth: " + rowsum);
            cust++;
        }
    }
}
