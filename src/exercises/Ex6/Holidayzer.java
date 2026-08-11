package exercises.Ex6;

import java.util.ArrayList;
import java.util.List;

import exercises.ExBase;

public class Holidayzer extends ExBase {
  private List<Holiday> holidays = new ArrayList<>();

  public Holidayzer() {
    super(6);
    this.holidays.add(new Holiday("01-01-2024", "Confraternização Mundial"));
    this.holidays.add(new Holiday("12-02-2024", "Carnaval"));
    this.holidays.add(new Holiday("13-02-2024", "Carnaval"));
    this.holidays.add(new Holiday("29-03-2024", "Sexta-feira Santa"));
    this.holidays.add(new Holiday("21-04-2024", "Tiradentes"));
    this.holidays.add(new Holiday("01-05-2024", "Dia do Trabalho"));
    this.holidays.add(new Holiday("30-05-2024", "Corpus Christi"));
    this.holidays.add(new Holiday("07-09-2024", "Independência do Brasil"));
    this.holidays.add(new Holiday("12-10-2024", "Nossa Senhora Aparecida"));
    this.holidays.add(new Holiday("02-11-2024", "Finados"));
    this.holidays.add(new Holiday("15-11-2024", "Proclamação da República"));
    this.holidays.add(new Holiday("20-11-2024", "Dia Nacional de Zumbi e da Consciência Negra"));
    this.holidays.add(new Holiday("25-12-2024", "Natal"));
  }

  public void isHoliday(String date) {
    for (Holiday holiday : holidays) {
      if (holiday.getDate().equals(date)) {
        System.out.println("Dia " + holiday.getDate() + " é " + holiday.getName() + "! 🎉");
        return;
      }
    }

    System.out.println("Dia " + date + " não é feriado 🥲");
  }

  public void printHolidayList() {
    System.out.println("\nLista de feriados:\n");

    for (Holiday holiday : holidays) {
      System.out.println(holiday);
    }
  }
}
