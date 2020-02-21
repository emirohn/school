public class Student extends Person{

    private String name;
    private int sectionCount;
    private int grade;
    Section[] sections = new Section[50];

    public Student(String name, int grade){
        super(name);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getSections() {
        return sectionCount;
    }

    public void addSections(Section s) {
        this.sections[sectionCount] = s;
        sectionCount++;
    }

    public String toString(){
        String o = "";
        for(int i = 0;  i < sectionCount; i++) {
            if(i +1 == sectionCount){
                o += sections[i].getName();
            }else{
                o += sections[i].getName() + ", ";
            }
        }
        return getName() + " is in grade " + getGrade() + " and is enrolled in the following sections: " + o;
    }
}
