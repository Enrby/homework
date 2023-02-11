package method;

import java.util.Objects;

public class Book {

    private final String title;
    private int publishingYear;
    private final Autor autor;

    public Book(String title, int publishingYear, Autor autor) {
        this.title = title;
        this.publishingYear = publishingYear;
        this.autor = autor;
    }

    public String getTitle() {
        return title;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public Autor getAutor() {
        return autor;
    }
    @Override
    public String toString() {
        return ("Название книги: " + title + ", год издания: " + publishingYear + ", автор: " + autor);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(title, book.title) && Objects.equals(autor, book.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, publishingYear, autor);
    }
}
