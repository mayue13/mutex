package MallApp1;

public class ReceiptPrinter {
    public static void printReceipt(Item[] items) {
        double grandTotal = 0;

        System.out.println("*****Receipt*****\n");
        System.out.println("\nName\tPrice\tQuantity\tTax\tTotal");
        for (Item item : items) {
            double localTotal = (item.getPrice() * item.getQuantity()) + item.getTax();
            System.out.println(item.getName() + "\t" + item.getPrice() + "\t" + item.getQuantity() + "\t" + item.getTax() + "\t" + localTotal);
            grandTotal = grandTotal + localTotal;
        }

        System.out.println(" Grand Total : " + grandTotal);
    }
}
