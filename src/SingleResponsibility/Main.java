package SingleResponsibility;

public class Main {

    public static void main(String[] args) {

        Book b1 = new Book("What If?","Randall Munroe", 12);
        Book b2 = new Book("Qualityland","Marc-Uwe Kling",11);
        Book b3 = new Book("1000 Places To See Before You Die", "Patricia Schultz");

        BookFormatter.displayInformation(b1);
        BookFormatter.displayInformation(b2);
        BookFormatter.displayInformation(b3);

        BookPriceCalculator.calculateAndSetDiscount(b1,20);
        BookPriceCalculator.removeDiscount(b1);
        BookPriceCalculator.calculateAndSetDiscount(b2, 50);
        b3.setPrice(15);

        System.out.println("-----------------------------------------------------------------------------");

        BookFormatter.displayInformation(b1);
        BookFormatter.displayInformation(b2);
        BookFormatter.displayInformation(b3);
    }

}
