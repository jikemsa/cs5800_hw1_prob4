//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Aggregaton Homework:"));

    IO.println(String.format("No instructors or textbooks:"));

    Course course1 = new Course("CS5800");
    course1.print();

    IO.println(String.format("1 instructors and 1 textbooks:"));

    Instructor instructor1 = new Instructor("Nima", "Davarpanah","3-2636");
    course1.addInstructor(instructor1);

    Textbook textbook1 = new Textbook("Clean Code","Robert C. Martin", "Prentice Hall");
    course1.addTextbook(textbook1);
    course1.print();

    IO.println(String.format("2 instructors and 2 textbooks:"));

    Instructor instructor2 = new Instructor("Ericsson", "Marin", "8-39");
    course1.addInstructor(instructor2);

    Textbook textbook2 = new Textbook("Underwater Basketweaving", "Some guys in a pool","Fool Money Publishing");
    course1.addTextbook(textbook2);
    course1.print();
}
