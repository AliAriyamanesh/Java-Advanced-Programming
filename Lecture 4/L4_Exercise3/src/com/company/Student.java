package com.company;

import java.util.List;

public class Student<Name,Id,Father> {
    private Name name;
    private Id id;
    private Father father;
    private List<Integer> scores;
    public Student(){}
    public void printFields(){
        System.out.println("------ Student information ------\nname : "+name+"\nid : "+id+"\nfather : "+father+"\nScores : ");
        for (Integer i :scores){
            System.out.println(i);
        }
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public Father getFather() {
        return father;
    }

    public void setFather(Father father) {
        this.father = father;
    }

    public List<Integer> getScores() {
        return scores;
    }

    public void setScores(List<Integer> scores) {
        this.scores = scores;
    }
}
