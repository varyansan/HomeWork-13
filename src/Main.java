import Model.Author;
import Model.Book;

public class Main {

    public static void main(String[] args) {

        Author kurtVonnegut = new Author("Курт", "Воннегут");
        Author kanaeMinato = new Author("Канаэ", "Минато");

        Book catsCradle = new Book("Колыбель для кошки", 2001, kurtVonnegut);
        Book guilty = new Book("Виновен", 2022, kanaeMinato);

        guilty.setYearOfPublication(2015);

        System.out.println(catsCradle);
        System.out.println(guilty);

        System.out.println(guilty.equals(catsCradle));
        System.out.println(kurtVonnegut.equals(kanaeMinato));

    }
}