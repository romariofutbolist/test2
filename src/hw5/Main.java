package hw5;

public class Main {
    public static void main(String[] args) {
        Reader[] readers = {
                new Reader("Петров Сергей", 17892, "mecanical", "17.05.1993", "111-11-11"),
                new Reader("Григорьев Иван", 17999, "electric", "19.12.1990", "222-21-21")
        };

        readers[0].takeBook(1);
        readers[0].takeBook("Война и мир");

        readers[0].returnBook(1);
        readers[0].returnBook("Война и мир");

        readers[1].takeBook(2);
        readers[1].takeBook("Игрок", "3 сестры");

        readers[1].returnBook(2);
        readers[1].returnBook("Игрок", "3 сестры");
    }
}