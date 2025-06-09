// Q1Create a class Book with fields title, author, and price. Create 2 objects and print their details.

class Book{
    String title,author;
    double price;

    Book(String title,String book,double price){
        this.title=title;
        this.author=author;
        this.price=price;
        
    }
    void display(){
        System.out.println("The value is"+title);
    }


public static void main(String[] args){
    Book book1= new Book("Java Program","SA",2000);
    Book book2= new Book("Cpp Program","SA",1000);
    Book book3= new Book("Go Program","SA",4000);
book1.display();
}

}
/*
