public class Section {

    private Teacher teacher;
    private String name;
    private int currentSize;
    private Student[] students = new Student[50];

    public Section(String name){
        this.name = name;
    }

    public String getTeacher() {
        return teacher.getName();
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getStudents() {
        String s = "";
        for(int i = 0; i < currentSize; i++){
            if(i +1 == currentSize){
                s += students[i].getName();
            }else{
                s += students[i].getName() + ", ";
            }

        }
        return s;
    }

    public void addStudent(Student s) {
        this.students[currentSize] = s;
        currentSize++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return name + " is taught by " + getTeacher() + " and has " + currentSize + " students: " + getStudents();
    }
}
