public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                { 1, 2, 3 },
                { 4, 3, 2 },
                { 8, 6, 8 }
        };

        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int maximumWealth = Integer.MIN_VALUE;

        for (int i = 0; i < accounts.length; i++) {
            int currentWealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                currentWealth = currentWealth + accounts[i][j];
            }
            if (maximumWealth < currentWealth) {
                maximumWealth = currentWealth;
            }
        }

        return maximumWealth;
    }
}
