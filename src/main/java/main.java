public class main {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", 892312312, 30000, 30);
        persArray[1] = new Person("Petrov Petr", "Programmer", "petrov@mailbox.com", 12345678, 30000, 32);
        persArray[2] = new Person("Sidorov Sidr", "Director", "sidorov@mailbox.com", 87654321, 100000, 45);
        persArray[3] = new Person("Smirnov Vasiliy", "Tester", "smirnov@mailbox.com", 55555555, 30000, 41);
        persArray[4] = new Person("Kuznetsov Dmitriy", "programmer", "kuznetsov@mailbox.com", 33445566, 30000, 25);
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() >40) {
                persArray[i].print();

            }
        }
    }
}
