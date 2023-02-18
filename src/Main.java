public class Main {
    public static void main(String[] args) {

        SalariedEmployee manou = new SalariedEmployee("Manou", "20-12-1985", 000, "01-01-2020",
                35000);

        System.out.println(manou);
        System.out.println(manou.getAge());
        System.out.println(manou.collectPay());
        SalariedEmployee thomas = new SalariedEmployee("Thomas", "12-08-1985", 000, "01-07-2020",
                35000);
        thomas.retire();
        System.out.println("Thomas's pension is $" +thomas.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/1985",000, "03/03/2020", 15);
        System.out.println("Mary's paycheck = $" +mary.collectPay());
        System.out.println("Mary's  holyday Pay = $" +mary.getDoublePay());
        System.out.println(mary);
    }
}