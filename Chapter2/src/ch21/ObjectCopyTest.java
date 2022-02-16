package ch21;

public class ObjectCopyTest {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        Book[] copyBooks = new Book[5];


        books[0] = new Book("태백산맥1","조정래");
        books[1] = new Book("태백산맥2","조정래");
        books[2] = new Book("태백산맥3","조정래");
        books[3] = new Book("태백산맥4","조정래");
        books[4] = new Book("태백산맥5","조정래");

        System.arraycopy(books,0,copyBooks,0,5); //얕은 복사


        System.out.println("오리지널");
        for(Book x: books){
            System.out.println(x);
            x.showInfo();
        }
        System.out.println("카피");
        for(Book x: copyBooks){
            System.out.println(x);
            x.showInfo();
        }



        //깊은 복사
        copyBooks[0] = new Book();
        copyBooks[1] = new Book();
        copyBooks[2] = new Book();
        copyBooks[3] = new Book();
        copyBooks[4] = new Book();

        int i = 0;
        for(Book x: books){
            copyBooks[i].setAuthor(books[i].getAuthor());
            copyBooks[i].setTitle(books[i].getTitle());
            i++;
        }
        System.out.println("카피2");
        for(Book x: copyBooks){
            System.out.println(x);
            x.showInfo();
        }



    }
}
