
import java.profile;

public class managingpeople {
    public static void main(String[] args) {
        Profile p1 = new Profile("Lisa", 20);
        Profile p2 = new Profile("Tegar",21); 

        if (p1.getAge() == p2.getAge()) {
            System.out.println(p1.getName() + " is the same age as " + p2.getName());
        } else {

            System.out.println(p1.getName() + " is NOT the same age as " + p2.getName());
        }
    }



}
