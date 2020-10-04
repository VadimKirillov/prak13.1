package sample;

class StudentTest {
    Student [] students = {
            new Student("Иванов",18,241),
            new Student("Кузнецов",23, 123),
            new Student("Воробьёв",19,154),
            new Student("Петров",21,278)
    };

    public void sort(){
        int k;
        Student a;

        for (int i = 0; i < students.length - 1; i++) {
            k = i;
            for (int j = i+1; j < students.length; j++)
                if (!students[j].compareTo(students[k]))//упорядоченность
                    k = j;
             //замена в сортировке
            a = students[k];
            students[k] = students[i];
            students[i] = a;
        }

        for (Student student : students){
            System.out.println(student.toString());
        }
    }
}
class Student {
    private String name;
    private int age;
    private int ID;

    public Student(String name, int age, int ID) {
        this.name = name;
        this.age = age;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name = '" + name + '\'' +
                ", age = " + age +
                ", iDNumber = " + ID +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public boolean compareTo(Student student){
        if (student.getID() < ID)
            return true;

        else
            return false;

    }

}
