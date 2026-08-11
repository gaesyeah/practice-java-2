package exercises.Ex6;

public class Holiday {
  private String date;
  private String name;

  public Holiday(String date, String name) {
    this.date = date;
    this.name = name;
  }

  public String getDate() {
    return this.date;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public String toString() {
    return "Dia " + this.date + ": " + this.name;
  }
}
