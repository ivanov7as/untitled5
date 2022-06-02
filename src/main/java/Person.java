public class Person {
    public String name;
    public String post;
    public String mail;
    public int number;
    public int salary;
    public int age;

    public int getAge() {
        return age;
    }

    public Person(String name, String post, String mail, int number, int salary, int age) {
        this.name = name;
        this.post = post;
        this.mail = mail;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    public void print() {
        System.out.println("Имя: " + name + "  " + " Должность: " + post + "  " + " e-mail: " + mail + "  " +
                " Тел.: " + number + "  " + " ЗП: " + salary + "  " + " Возраст: " + age);

    }
}
