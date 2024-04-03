package SingleResponsibility;

// Responsibility is to store information about books

public class Book {
    private String title;
    private String author;
    private double price;
    private double oldPrice;
    private boolean discountApplied;



    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.discountApplied = false;
    }

    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
        this.discountApplied = false;
    }


    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public double getPrice(){
        return this.price;
    }

    public double getOldPrice(){
        return this.oldPrice;
    }

    public boolean getDiscoundApplied(){
        return this.discountApplied;
    }

    public void setDiscountApplied(){
        this.discountApplied = !this.discountApplied;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setOldPrice(double oldPrice){
        this.oldPrice = oldPrice;
    }

}
