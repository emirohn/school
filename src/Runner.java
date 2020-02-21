public class Runner {
    public static void main(String[] args){
        School bhs = new School("Berkeley High");
        Section math = new Section("Math");
        Section biology = new Section("Biology");
        Section cs = new Section("Computer Science");
        Teacher albinson = new Teacher("Albinson", "Computer Science");
        Teacher austera = new Teacher("Austera", "Math");
        Teacher mueller = new Teacher("Mueller", "Biology");
        Student emi = new Student("Emi", 11);
        Student natasha = new Student("Natasha", 11);
        Student sydney = new Student("Sydney", 11);
        Student anna = new Student("Anna", 11);
        Student eliot = new Student("Eliot", 11);
        Student naomi = new Student("Naomi", 11);

        bhs.addSections(biology);
        bhs.addSections(math);
        bhs.addSections(cs);

        biology.setTeacher(mueller);
        math.setTeacher(austera);
        cs.setTeacher(albinson);

        mueller.addSections(biology);
        austera.addSections(math);
        albinson.addSections(cs);

        biology.addStudent(emi);
        biology.addStudent(natasha);
        biology.addStudent(sydney);
        biology.addStudent(eliot);
        math.addStudent(anna);
        math.addStudent(emi);
        math.addStudent(sydney);
        cs.addStudent(naomi);
        cs.addStudent(eliot);
        cs.addStudent(emi);


        emi.addSections(biology);
        emi.addSections(math);
        emi.addSections(cs);
        natasha.addSections(biology);
        sydney.addSections(biology);
        sydney.addSections(math);
        anna.addSections(math);
        naomi.addSections(cs);
        eliot.addSections(cs);
        eliot.addSections(biology);

        System.out.println(bhs.toString());
        System.out.println(math.toString());
        System.out.println(biology.toString());
        System.out.println(cs.toString());
        System.out.println(albinson.toString());
        System.out.println(austera.toString());
        System.out.println(mueller.toString());
        System.out.println(emi.toString());
        System.out.println(natasha.toString());
        System.out.println(sydney.toString());
        System.out.println(anna.toString());
        System.out.println(eliot.toString());
        System.out.println(naomi.toString());
    }
}
