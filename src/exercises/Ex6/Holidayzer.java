package exercises.Ex6;

import java.util.ArrayList;
import java.util.List;

import exercises.ExBase;

public class Holidayzer extends ExBase {
  private List<Holyday> holydays = new ArrayList<>();

  public Holidayzer() {
    super(6);
    this.holydays.add(new Holyday("01-01-2024", "Confraternização Mundial"));
    this.holydays.add(new Holyday("12-02-2024", "Carnaval"));
    this.holydays.add(new Holyday("13-02-2024", "Carnaval"));
    this.holydays.add(new Holyday("29-03-2024", "Sexta-feira Santa"));
    this.holydays.add(new Holyday("21-04-2024", "Tiradentes"));
    this.holydays.add(new Holyday("01-05-2024", "Dia do Trabalho"));
    this.holydays.add(new Holyday("30-05-2024", "Corpus Christi"));
    this.holydays.add(new Holyday("07-09-2024", "Independência do Brasil"));
    this.holydays.add(new Holyday("12-10-2024", "Nossa Senhora Aparecida"));
    this.holydays.add(new Holyday("02-11-2024", "Finados"));
    this.holydays.add(new Holyday("15-11-2024", "Proclamação da República"));
    this.holydays.add(new Holyday("20-11-2024", "Dia Nacional de Zumbi e da Consciência Negra"));
    this.holydays.add(new Holyday("25-12-2024", "Natal"));
  }

  public void isHolyday(String date) {
    for (Holyday holyday : holydays) {
      if (holyday.getDate().equals(date)) {
        System.out.println("Dia " + holyday.getDate() + " é " + holyday.getName() + "! 🎉");
        return;
      }
    }

    System.out.println("Dia " + date + " não é feriado 🥲");
  }

  public void printHolydayList() {
    System.out.println("\nLista de feriados:\n");

    for (Holyday holyday : holydays) {
      System.out.println(holyday);
    }
  }
}
