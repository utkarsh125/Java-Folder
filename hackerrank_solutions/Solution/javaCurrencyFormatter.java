package hackerrank-solutions.Solution;

public class javaCurrencyFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        sc.close();
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("US: $"+df.format(amount));
        System.out.println("India: Rs."+df.format(amount));
        System.out.println("US: ￥"+df.format(amount));
        System.out.println("US: "+df.format(amount)+"€");
}
