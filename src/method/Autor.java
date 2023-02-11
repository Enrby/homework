package method;

import java.util.Objects;

public class Autor {

    private final String name;
    private final String surname;

    public Autor(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return Objects.equals(name, autor.name) && Objects.equals(surname, autor.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}
