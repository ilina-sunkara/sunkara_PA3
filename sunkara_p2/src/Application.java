public class Application {
    public static void main(String[] args){
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();

        saver1.setSavingsBalance(2000.00);
        saver2.setSavingsBalance(3000.00);

        saver1.setAnnualInterestRate(4);
        saver2.setAnnualInterestRate(4);

        double monthlyInterest1=0;
        double monthlyInterest2=0;
        for(int i=1; i<=12; i++){
            monthlyInterest1 = saver1.calculateMonthlyInterest();
            monthlyInterest2 = saver2.calculateMonthlyInterest();

            System.out.printf("Saver 1- Balance after month %d: %.2f\n",i, monthlyInterest1);
            System.out.printf("Saver 2- Balance after month %d: %.2f\n",i, monthlyInterest2);
            System.out.println("");
        }


        saver1.modifyInterestRate(5);
        saver2.modifyInterestRate(5);

        double modifiedMonthlyInterest1 = saver1.calculateMonthlyInterest();;
        double modifiedMonthlyInterest2 = saver2.calculateMonthlyInterest();

        System.out.printf("Saver 1- Balance after first month with modified interest: %.2f\n",modifiedMonthlyInterest1);
        System.out.printf("Saver 2- Balance after first month with modified interest: %.2f\n",modifiedMonthlyInterest2);
    }
}
