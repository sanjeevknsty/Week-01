public class University {
    public static void main(String[] args) {
      int fee = 125000;
        int percent = 10;
        double discount = (fee * percent) / 100.0;

        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount + " and the final discounted fee is INR " + finalFee);
    
    }
}