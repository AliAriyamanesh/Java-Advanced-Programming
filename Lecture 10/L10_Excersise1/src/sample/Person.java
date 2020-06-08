package sample;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Person {
    private SimpleStringProperty name;
    private SimpleStringProperty family;
    private SimpleIntegerProperty age;

    public Person() {}

    public Person(String name, String family, Integer age) {
        this.name = new SimpleStringProperty(name);
        this.family = new SimpleStringProperty(family);
        this.age = new SimpleIntegerProperty(age);
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getFamily() {
        return family.get();
    }

    public SimpleStringProperty familyProperty() {
        return family;
    }

    public void setFamily(String family) {
        this.family.set(family);
    }

    public int getAge() {
        return age.get();
    }

    public SimpleIntegerProperty ageProperty() {
        return age;
    }

    public void setAge(int age) {
        this.age.set(age);
    }
}
