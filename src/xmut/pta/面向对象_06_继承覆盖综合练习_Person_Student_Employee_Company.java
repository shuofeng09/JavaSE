package xmut.pta;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author 朔风
 * @date 2023-11-26 18:31
 */
public class 面向对象_06_继承覆盖综合练习_Person_Student_Employee_Company {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();
        List<Student> stuList = new ArrayList<Student>();
        List<Employee> empList = new ArrayList<Employee>();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] split = line.split("\\s+");
            if (split[0].equals("s"))
                personList.add(new Student(split[1], Integer.parseInt(split[2]), Boolean.parseBoolean(split[3]), split[4], split[5]));
            else if (split[0].equals("e")) {
                personList.add(new Employee(split[1], Integer.parseInt(split[2]), Boolean.parseBoolean(split[3]), Double.parseDouble(split[4]), new Company(split[5])));
            } else {
                personList.sort((o1, o2) -> {
                    if (o1.name.compareTo(o2.name) == 0)
                        return o1.age - o2.age;
                    else
                        return o1.name.compareTo(o2.name);
                });
                break;
            }
        }


        if ("exit".equals(sc.nextLine())) {
            return;
        }
        personList.forEach(System.out::println);

        for (Person person : personList) {
            boolean flag = true;
            if (person instanceof Student) {
                // 比较相同对象
                for (Student s : stuList) {
                    if (s.equals(person)) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    stuList.add((Student) person);
                }
            } else if (person instanceof Employee) {
                for (Employee e : empList) {
                    if (e.equals(person)) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    empList.add((Employee) person);
                }
            }
        }

        System.out.println("stuList");
        for (Student s : stuList)
            System.out.println(s.toString());
        System.out.println("empList");
        for (Employee e : empList)
            System.out.println(e.toString());


    }
}

class Person {
    String name;
    int age;
    boolean gender;

    public Person(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String toString() {
        return name + "-" + age + "-" + gender;
    }     // 返回"name-age-gender"格式的字符串

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && gender == person.gender && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }
}

class Student extends Person {

    String stuNo;
    String clazz;

    // 建议使用super复用Person类的相关有参构造函数
    public Student(String name, int age, boolean gender, String stuNo, String clazz) {
        super(name, age, gender);
        this.stuNo = stuNo;
        this.clazz = clazz;
    }

    public String toString() {
        return "Student:" + super.toString() + "-" + stuNo + "-" + clazz;
    }        // 返回 “Student:person的toString-stuNo-clazz”格式的字符串


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(stuNo, student.stuNo) && Objects.equals(clazz, student.clazz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stuNo, clazz);
    }
}

class Company {
    String name;

    public Company(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }       // 直接返回name


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(name, company.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

class Employee extends Person {
    Company company;
    double salary;

    // 建议使用super复用Person类的相关有参构造函数
    public Employee(String name, int age, boolean gender, double salary, Company company) {
        super(name, age, gender);
        this.salary = salary;
        this.company = company;
    }

    public String toString() {
        return "Employee:" + super.toString() + "-" + company + "-" + salary;
    }         // 返回"Employee:person的toString-company-salary"格式的字符串

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        DecimalFormat df = new DecimalFormat("#.#");
        String s1 = df.format(this.salary);
        String s2 = df.format(employee.salary);
        return s1.compareTo(s2) == 0 && Objects.equals(company, employee.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), company, salary);
    }
}

