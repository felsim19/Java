package model;

import java.util.ArrayList;

/**
 * Representa una biblioteca que contiene una lista de libros.
 */
public class Library {

    private ArrayList<Book> books;

    /**
     * Crea una instancia de la clase Library.
     */
    public Library() {
        this.books = new ArrayList<>();
    }

    /**
     * Obtiene el número de libros de la biblioteca.
     *
     * @return un entero que representa el tamaño de la biblioteca en cantidad de libros.
     */
    public int size() {
        return books.size();
    }

    /**
     * Agrega un libro a la biblioteca.
     *
     * @param book un objeto que representa un libro.
     */
    public void addBook(Book book) {
        books.add(book);
    }

    /**
     * Retorna los valores en formato de cadena.
     */
    public String toString() {
        String infoBooks = "";
        String lineBreak = "\n";

        if (books.isEmpty()) {
            infoBooks = "La biblioteca está vacía";
        } else {
            infoBooks += "Libros en la biblioteca:" + lineBreak;
            for (Book book : books) {
                infoBooks += book.toString() + lineBreak;
            }
        }
        return infoBooks;
    }

    /**
     * Método para encontrar libros por un autor dado.
     *
     * @param author un valor String que identifica el nombre del autor.
     * @return un ArrayList que contiene los libros escritos por el autor.
     */
    public ArrayList<Book> findBooksByAuthor(String author) {
        ArrayList<Book> booksByAuthor = new ArrayList<>();
        for (Book book : this.books) {
            if (book.getAuthor().equals(author)) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }

    /**
     * Método para encontrar libros publicados después de un año dado.
     *
     * @param year un valor entero que representa el año de publicación.
     * @return un ArrayList que contiene los libros publicados después del año dado.
     */
    public ArrayList<Book> findBooksPublishedAfter(int year) {
        ArrayList<Book> booksPublishedAfter = new ArrayList<>();
        for (Book book : this.books) {
            if (book.getYear() > year) {
                booksPublishedAfter.add(book);
            }
        }
        return booksPublishedAfter;
    }

    /**
     * Método para eliminar un libro de la biblioteca por ISBN.
     *
     * @param isbn un número de 13 dígitos que identifica de manera única los libros publicados internacionalmente.
     * @return true, si se encontró y eliminó el libro; false, en caso contrario.
     */
    public boolean removeBookByISBN(String isbn) {
        for (Book book : this.books) {
            if (book.getIsbn().equals(isbn)) {
                books.remove(book);
                return true;
            }
        }
        return false;
    }
}
