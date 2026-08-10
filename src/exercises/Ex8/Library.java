package exercises.Ex8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

import exercises.ExBase;

public class Library extends ExBase {
  private List<Book> books = new ArrayList<>();

  public Library() {
    super(8);
    this.books.add(new Book("Dom Casmurro", "Machado de Assis"));
    this.books.add(new Book("O Cortiço", "Aluísio Azevedo"));
    this.books.add(new Book("Grande Sertão: Veredas", "Guimarães Rosa"));
    this.books.add(new Book("Vidas Secas", "Graciliano Ramos"));
    this.books.add(new Book("A Hora da Estrela", "Clarice Lispector"));
    this.books.add(new Book("Memórias Póstumas de Brás Cubas", "Machado de Assis"));
    this.books.add(new Book("Capitães da Areia", "Jorge Amado"));
    this.books.add(new Book("Iracema", "José de Alencar"));
  }

  private Book findBook(String title) {
    for (Book book : books) {
      if (book.getTitle().equals(title)) {
        return book;
      }
    }
    return null;
  }

  public void borrowBook(String title) {
    Book book = findBook(title);

    if (book == null) {
      System.out.println("Livro não encontrado 🔍");
      return;
    }

    if (book.isAvailable()) {
      book.markAsBorrowed();
      System.out.println("Você pegou emprestado: " + book.getTitle() + " 📖");
      return;
    }

    System.out.println(book.getTitle() + " já está emprestado 😕");
  }

  public void returnBook(String title) {
    Book book = findBook(title);

    if (book == null) {
      System.out.println("Livro não encontrado 🔍");
      return;
    }

    if (!book.isAvailable()) {
      book.markAsReturned();
      System.out.println("Você devolveu: " + book.getTitle() + " 📚");
      return;
    }

    System.out.println(book.getTitle() + " não estava emprestado 🤔");
  }

  private void printBooks(Predicate<Book> filter) {
    for (Book book : books) {
      if (filter.test(book)) {
        System.out.println(book);
      }
    }
  }

  public void printAvailableBooks() {
    System.out.println("\nLista de livros disponíveis:\n");
    Collections.sort(this.books);
    printBooks(book -> book.isAvailable());
  }

  public void printAllBooks() {
    System.out.println("\nLista de todos os livros:\n");
    Collections.sort(this.books);
    printBooks(book -> true);
  }
}
