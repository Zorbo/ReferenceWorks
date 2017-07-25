package inheritanceconstructor.trainer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Training on 2017. 03. 23..
 */
public class Trainer extends Human {

    public Trainer(String name, int age, List<Course> courses) {
        super(name, age);
        this.courses = courses;
    }

    private List<Course> courses = new ArrayList<>();

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    
}
