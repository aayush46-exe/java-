class Member {
    String name;

    Member(String name) {
        this.name = name;
    }

    public void borrowingLimit() {
        System.out.println("General Borrowing Limit");
    }
}

class StudentMember extends Member {

    StudentMember(String name) {
        super(name);
    }

    @Override
    public void borrowingLimit() {
        System.out.println(name + " (Student) can borrow 3 books.");
    }
}

class TeacherMember extends Member {

    TeacherMember(String name) {
        super(name);
    }

    @Override
    public void borrowingLimit() {
        System.out.println(name + " (Teacher) can borrow 10 books.");
    }
}

public class Main {
    public static void main(String[] args) {
        Member s = new StudentMember("Aayush");
        Member t = new TeacherMember("Raj");

        s.borrowingLimit();
        t.borrowingLimit();
    }
}