package ch21;

public class BookTest {
    public static void main(String[] args) {
        Book[] books = new Book[5];


        books[0] = new Book("태백산맥1","조정래");
        books[1] = new Book("태백산맥2","조정래");
        books[2] = new Book("태백산맥3","조정래");
        books[3] = new Book("태백산맥4","조정래");
        books[4] = new Book("태백산맥5","조정래");

        for(Book x: books){
            System.out.println(x);
            x.showInfo();
        }
    }
}
