import java.util.Objects;

public class Students implements Comparable<Students> {
    @Override
    public int compareTo(Students that) {
        return this.id - that.id;
    }

    private int id;
    private String name;

    public Students(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students student = (Students) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
