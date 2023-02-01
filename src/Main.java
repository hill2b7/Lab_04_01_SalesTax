public class Main {
    public static void main(String[] args)
    {
        double priceOfPurchase = 10.99; // This sets the purchase price to an exact cost
        double SALES_TAX_PERCENTAGE  = 0.05; //All capitals for a constant
        double totalSalesTax = 0.00; // sets total sales tax
        double totalPrice = 0.00; // sets total price

        System.out.println("The price of this item is " + priceOfPurchase);
        totalSalesTax = priceOfPurchase * SALES_TAX_PERCENTAGE; //calculation for total sales tax
        System.out.println("The total sales tax is " + totalSalesTax); //outputs the calculation of sales tax
        totalPrice = totalSalesTax + priceOfPurchase; // calculates total cost including sales tax and price of item
        System.out.println("The total price is " + totalPrice); // outputs total price of sale
    }

}