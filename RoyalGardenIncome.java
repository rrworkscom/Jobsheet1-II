

public class RoyalGardenIncome {

    static int aglonemaPrice = 75000;
    static int yamPrice = 50000;
    static int alocasiaPrice = 60000;
    static int rosePrice = 10000;

    public static int incomeCalculation(int[] stock) {
        return (stock [0] * aglonemaPrice) +
               (stock [1] * yamPrice) +
               (stock [2] * alocasiaPrice) + 
               (stock [3] * rosePrice);
    }

    public static String getStatus(int income) {
        if (income > 1500000) {
            return "Very Good";
        } else {
            return "Need Evaluation";
        }
    }

    public static void main(String[] args) {

        System.out.println("===================");
        System.out.println("Royal Garden Income");
        System.out.println("===================");

        int [][] stock = {
            {10, 5, 15, 7}, 
            {6, 11, 9, 12 },
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };

        String[] branches = {
            "RoyalGraden 1",
            "RoyalGraden 2",
            "RoyalGraden 3",
            "RoyalGraden 4"
        };

        for (int i = 0; i < stock.length; i++) {

            int income = incomeCalculation(stock[i]);
            String status = getStatus(income);

            System.out.println(branches[i]);
            System.out.println("Income : IDR " + income);
            System.out.println("Status : " + status);
            System.out.println("===================");
        }
    }
    
}
