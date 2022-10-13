import myClasses.Author;
import myClasses.Book;

public class ooppoject {
    public static void main(String[] args) {
        Author author1 = new Author();
        Author author2 = new Author();
        author1.setFirstName("Саша");
        author1.setLastName("Пушкин");
        author2.setFirstName("Владимир");
        author2.setLastName("Орлов");
        Book book1 = new Book();
        Book book2 = new Book();
        book1.setCaption("Евгений Онегин");
        book2.setCaption("Золотой Циплёнок");
        Author[] authors = new Author[2];
        authors[0]=author1;
        authors[1]=author2;
        book1.setAuthors(new Author[]{author1});
        book2.setAuthors(new Author[]{author2});
        System.out.println(book1.toString());
        System.out.println(book2.toString());
    }
}
