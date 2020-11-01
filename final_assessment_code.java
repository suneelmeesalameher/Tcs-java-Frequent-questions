import java.io.*;
import java.util.*;


public class Main {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc=new Scanner(System.in);
        Book[] book=new Book[4];
        
        int[] a=new int[0];
        int d=0;

        for(int i=0;i<4;i++)
        {
            
            int id=sc.nextInt();sc.nextLine();
            String title=sc.nextLine();
            String author=sc.nextLine();
            double price=sc.nextDouble();sc.nextLine();
            book[i]=new Book(id,title,author,price);
        }
        String checker=sc.nextLine();
        sc.close();
        Book[] book2=searchTitle(book, checker);
        for(int j=0;j<book2.length;j++)
        {
            a=Arrays.copyOf(a,a.length+1);
            a[a.length-1]=book2[j].getId();
        }
        Arrays.sort(a);
        for(int m=0;m<a.length;m++)
        {
            System.out.println(a[m]);
        }
        
        
    }
    public static  Book[] searchTitle(Book[] book, String value){
        Book[] book1=new Book[0];
        int length=1;
        for(int j=0;j<4;j++)
        {
            if(book[j].getTitle().contains(value))
            {
                book1=Arrays.copyOf(book1,book1.length+1);
                book1[book1.length-1]=book[j];
            }
        }
        return book1;
    }
    
}

class Book
{
    private int id;
    private String title;
    private String author;
    private double price;
    
      public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
    public Book(int id, String title, String author, double price) {
        super();
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }
}