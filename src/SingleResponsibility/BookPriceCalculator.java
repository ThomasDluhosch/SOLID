package SingleResponsibility;

// Responsibility is to set discounts

public class BookPriceCalculator {

    public static void calculateAndSetDiscount(Book book, double discountInPercent){

        if(!book.getDiscoundApplied()){

            book.setOldPrice(book.getPrice());
            book.setPrice(book.getPrice() - (book.getPrice() * discountInPercent / 100));
            book.setDiscountApplied();

        }

    }


    public static void removeDiscount(Book book){
        if(book.getDiscoundApplied()){

            book.setPrice(book.getOldPrice());
            book.setDiscountApplied();

        }
    }

}
