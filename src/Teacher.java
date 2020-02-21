public class Teacher extends Person{

    private String subject;
    private int sectionCount;
    Section[] sections = new Section[50];

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Section[] getSections() {
        return sections;
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
        return getName() + " teaches the following sections: " + o;
    }
}
