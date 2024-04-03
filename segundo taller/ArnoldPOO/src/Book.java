package model;

/**
 * Representa un libro con sus atributos.
 */
public class Book {

    private String title;
    private String author;
    private int year;
    private int pages;
    private String isbn;
    private String publisher;

    /**
     * Crea una instancia de libro con los parámetros dados.
     *
     * @param title     El título del libro.
     * @param author    El autor del libro.
     * @param year      El año de publicación del libro.
     * @param pages     El número de páginas del libro.
     * @param isbn      El ISBN del libro.
     * @param publisher El editor del libro.
     */
    public Book(String title, String author, int year, int pages, String isbn, String publisher) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = pages;
        this.isbn = isbn;
        this.publisher = publisher;
    }


    /** Getters y setters para todos los atributos */

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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * Retorna los valores en formato de cadena.
     */
    public String toString() {
        String info_book = "";
        String line_tap = "\n\t";

        info_book += line_tap + "Title: " + getTitle();
        info_book += line_tap + "Author: " + getAuthor();
        info_book += line_tap + "Year: " + getYear();
        info_book += line_tap + "Pages: " + getPages();
        info_book += line_tap + "ISBN: " + getIsbn();
        info_book += line_tap + "Publisher: " + getPublisher();
        info_book += line_tap;

        return info_book;
    }
}
