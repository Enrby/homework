package method;

public class Main {
    public static void main(String[] args) {
        Autor dostoevsky = new Autor("Федор", "Достоевский");
        Autor tolstoy = new Autor("Лев", "Толстой");
        Autor tolstoy2 = new Autor("Лев", "Толстой");


        Book crime = new Book("Преступление и наказание", 1866, dostoevsky);
        Book war = new Book("Война и мир", 1867, tolstoy);

        System.out.println(tolstoy.equals(tolstoy2));

        System.out.println(crime);
        System.out.println(war);

        crime.setPublishingYear(1870);

        System.out.println(crime);
    }
}
