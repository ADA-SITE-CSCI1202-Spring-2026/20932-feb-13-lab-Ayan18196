package week03.invoice;

public class InvoiceTest {
    public static void main(String[] args) {

        Invoice myInvoice = new Invoice("A123", "Bolt", 5, 2.50);

        System.out.println("Part Number: " + myInvoice.getPartNumber());
        System.out.println("Description: " + myInvoice.getPartDescription());
        System.out.println("Total: " + (myInvoice.getQuantity() * myInvoice.getPricePerItem()));
    }
}
