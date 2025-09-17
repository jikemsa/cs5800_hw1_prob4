import java.util.ArrayList;

public class Course {
    String courseName;
    ArrayList<Instructor> instructors;
    ArrayList<Textbook> textbooks;

    public ArrayList<Textbook> getTextbooks() {
        return textbooks;
    }

    public void setTextbooks(ArrayList<Textbook> textbooks) {
        this.textbooks = textbooks;
    }
    public void addTextbook(Textbook textbook){
        textbooks.add(textbook);
    }

    public ArrayList<Instructor> getInstructors() {
        return instructors;
    }

    public void setInstructors(ArrayList<Instructor> instructors) {
        this.instructors = instructors;
    }

    public void addInstructor(Instructor instructor){
        this.instructors.add(instructor);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }


    public Course(String courseName) {
        this.courseName = courseName;
        textbooks = new ArrayList<Textbook>();
        instructors= new ArrayList<Instructor>();
    }

    public void print(){
        IO.println(String.format("Course name:"+courseName));
        IO.println(String.format("Instructor(s):"));
        if(instructors.size()==0){
            IO.println(String.format("NONE"));
        }else{
            for(int i = 0; i < instructors.size(); i++){
                instructors.get(i).print();
            }
        }
        IO.println(String.format("Textbooks:"));
        if(textbooks.size() ==0){
            IO.println(String.format("NONE"));
        }else{
            for(int i = 0; i < textbooks.size(); i++){
                textbooks.get(i).print();
            }
        }
    }

}


