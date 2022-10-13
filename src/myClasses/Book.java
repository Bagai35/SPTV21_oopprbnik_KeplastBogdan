package myClasses;

import java.util.Arrays;

public class Book {
    private Author[] authors;
    private String caption;

    public Book() {
    }

    public Author[] authors() {
        return authors;
    }

    public Book setAuthors(Author[] authors) {
        this.authors = authors;
        return this;
    }

    public String caption() {
        return caption;
    }

    public Book setCaption(String caption) {
        this.caption = caption;
        return this;
    }

    @Override
    public String toString() {
        return "Book{" +
                "authors=" + Arrays.toString(authors) +
                ", caption='" + caption + '\'' +
                '}';
    }
}
