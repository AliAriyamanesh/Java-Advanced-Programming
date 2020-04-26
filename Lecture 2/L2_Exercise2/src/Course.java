public class Course {
    public String name;
    public int unit;
    public Course prerequisites;
    public Course corequisite;
    public void printFields(){
        System.out.println(this.name + "\nunit : "+this.unit);
        if (this.prerequisites!=null){
            System.out.println("prerequisites : "+prerequisites.name);
        }
        if (this.corequisite!=null){
            System.out.println("prerequisites : "+this.corequisite.name);
        }

    }

    public Course(String name,int unit , Course prerequisites , Course corequisite){
        this.name=name;
        this.unit=unit;
        this.prerequisites=prerequisites;
        this.corequisite=corequisite;
    }
    public Course(String name,int unit , Course prerequisites ){
        this.name=name;
        this.unit=unit;
        this.prerequisites=prerequisites;

    }
    public Course(String name, int unit ) {
        this.name = name;
        this.unit = unit;
    }}
