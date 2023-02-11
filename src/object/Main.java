package object;

public class Main {
    public static void main(String[] args) {
        Autor dostoevsky = new Autor("Федор", "Достоевский");
        Autor tolstoy = new Autor("Лев", "Толстой");

        Book Crime = new Book("Преступление и наказание", 1866, dostoevsky);
        Book War = new Book("Война и мир", 1867, tolstoy);

        Crime.printInfo();
        War.printInfo();

        Crime.setPublishingYear(1870);

        Crime.printInfo();
    }
}
