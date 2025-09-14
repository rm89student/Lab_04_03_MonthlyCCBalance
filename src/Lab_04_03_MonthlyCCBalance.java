//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Lab_04_03_MonthlyCCBalance {
    public static void main(String[] args) {
        double balance = 5000.00;
        double monthlyInterestRate = .17;
        double interestMonth1 = balance * monthlyInterestRate;
        System.out.println("Interest after month 1: $" + interestMonth1);

        double balanceMonth2 = balance + interestMonth1;

        double interestMonth2 = balanceMonth2 * monthlyInterestRate;
        System.out.println("Interest after 2 months: $" + interestMonth2);
    }
}