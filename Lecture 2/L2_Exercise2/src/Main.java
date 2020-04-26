import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    //Predefined Courses
        //************
        Course[] courses=new Course[5];
        courses[0] = new Course("Mabani Barnameh Nevisi",3);
        courses[1] = new Course("Kargah Barnameh Nevisi",3);
        courses[2]  = new Course("Barnameh Nevisi Pishrafteh",3,courses[0]);
        courses[3] = new Course("Riazi Omoumi 1",3);
        courses[4]  = new Course("Riazi Omoumi 2",3,courses[3]);
        //************


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of predefined course : ");
        String name = input.nextLine();
        for(int i =0;i<5;i++){
            if (courses[i].name.equals(name)){
                courses[i].printFields();
                break;
            }
        }


    }

}
