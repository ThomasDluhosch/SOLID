package SingleResponsibility;

// Responsibility is to format the book

public class BookFormatter {

    public static void displayInformation(Book book){
        System.out.println(book.getTitle() +" | " + book.getAuthor() +" | " +book.getPrice() +" | " +book.getOldPrice() +" | " +book.getDiscoundApplied());
    }

}
