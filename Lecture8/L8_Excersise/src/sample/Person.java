package sample;

public class Person {
    private String name;
    private String family;
    private String father;
    private String jens;
    private String date;

    public Person() {   }
    public Person(String name, String family, String father, String jens, String date) {
        this.name = name;
        this.family = family;
        this.father = father;
        this.jens = jens;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public String getFamily() {
        return family;
    }

    public Person setFamily(String family) {
        this.family = family;
        return this;
    }

    public String getFather() {
        return father;
    }

    public Person setFather(String father) {
        this.father = father;
        return this;
    }

    public String getJens() {
        return jens;
    }

    public Person setJens(String jens) {
        this.jens = jens;
        return this;
    }

    public String getDate() {
        return date;
    }

    public Person setDate(String date) {
        this.date = date;
        return this;
    }
}
