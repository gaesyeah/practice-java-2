package exercises.Ex8;

public class Book implements Comparable<Book> {
  private String title;
  private String author;
  private boolean available;

  public Book(String title, String author) {
    this.title = title;
    this.author = author;
    this.available = true;
  }

  public void markAsBorrowed() {
    this.available = false;
  }

  public void markAsReturned() {
    this.available = true;
  }

  public boolean isAvailable() {
    return this.available;
  }

  public String getTitle() {
    return this.title;
  }

  @Override
  public int compareTo(Book other) {
    return this.title.compareTo(other.title);
  }

  @Override
  public String toString() {
    return "Livro: " + this.title + " - " + this.author + (this.available ? " (disponível)" : " (emprestado)");
  }
}
