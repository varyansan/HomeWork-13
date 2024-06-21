package Model;

import java.util.Objects;

public class Book {
    private String title;
    private int yearOfPublication;
    private Author author;

    public Book(String title, int yearOfPublication, Author author) {
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.author = author;

    }

    public String getTitle() {
        return this.title;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;

    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Book book = (Book) object;
        return yearOfPublication == book.yearOfPublication && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, yearOfPublication, author);
    }

    @Override
    public String toString() {
        return "Книга: " + "\"" + getTitle() + "\"" + ", написана в " + getYearOfPublication() + " году. Автор: " + author.toString();
    }

}
