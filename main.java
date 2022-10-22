import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/*
class Dorama{
    String name;
    int series;
    float rating;
    int year;
    public Dorama(String name, int series, float rating, int year) {
        this.name = name;
        this.series = series;
        this.rating = rating;
        this.year = year;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "Dorama " +
                "name: '" + name + '\'' +
                ", series: " + series +
                ", rating: " + rating +
                ", year: " + year;
    }
}

public class main{
    public static void main(String[] args) {
        ArrayList<Dorama> doramaArrayList = new ArrayList<>();

        Dorama dorama1 = new Dorama("Blind", 16, 945/100, 2022);
        Dorama dorama2 = new Dorama("Blind", 16, 945/100, 2022);
        Dorama dorama3 = new Dorama("Blind", 16, 945/100, 2022);

        doramaArrayList.add((dorama1));
        doramaArrayList.add((dorama2));
        doramaArrayList.add((dorama3));
        System.out.println(doramaArrayList);

        for (Dorama d: doramaArrayList) {
            System.out.println(d);
        }
    }
}
*/


//Problem 1
/*
class Student{
    int id;
    String surname;
    String firstname;
    String patronymic;
    String dateOfBirth;
    String address;
    String phone;
    String faculty;
    int course;
    String group;



    public Student(int id, String surname, String firstname, String patronymic, String dateOfBirth, String address, String phone, String faculty, int course, String group) {
        this.id = id;
        this.surname = surname;
        this.firstname = firstname;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName(){
        return surname;
    }
    public void setName(String name){
        this.surname = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString(){
        return "Student " +
                "id: " + id +
                ", surname: " + surname +
                ", firstname: " + firstname +
                ", patronymic: " + patronymic +
                ", date of birth: " + dateOfBirth +
                ", address: " + address +
                ", phone: " + phone +
                ", faculty: " + faculty +
                ", course: " + course +
                ", group: " + group;
    }
}

public class main{
    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = new ArrayList<>();

        Student student1 = new Student(24,"tolegen", "arbu", "", "27.12.2004", "netu", "87766666666", "slytherin", 3, "E" );

        studentArrayList.add((student1));
        System.out.println(studentArrayList);

        for (Student d: studentArrayList) {
            System.out.println(d);
        }
    }
}
*/

//Problem 2
/*
class customer {
    int id;
    String surname;
    String firstname;
    String patronymic;
    String address;
    int creditCardNumber;
    int bankAccountNumber;



    public customer (int id, String surname, String firstname, String patronymic, String address, int creditCardNumber, int bankAccountNumber) {
        this.id = id;
        this.surname = surname;
        this.firstname = firstname;
        this.patronymic = patronymic;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName(){
        return surname;
    }
    public void setName(String name){
        this.surname = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public String toString(){
        return "Student " +
                "id: " + id +
                ", surname: " + surname +
                ", firstname: " + firstname +
                ", patronymic: " + patronymic +
                ", address: " + address +
                ", credit card number: " + creditCardNumber +
                ", bank account number: " + bankAccountNumber ;
    }
}

public class main{
    public static void main(String[] args) {
        ArrayList<customer> customerArrayList = new ArrayList<>();

        customer customer1 = new customer(34,"Tolegen", "Aruzhan", "", "Apattaeva 41",  440041579, 12345);
        customer customer2 = new customer(16,"Rashid", "Zhuldyzai", "", "Konaeva 13", 440041661, 13456);
        customer customer3 = new customer(12,"Zhambylkyzy", "Dina", "", "Pushkina 154", 404301666, 21345);
        customer customer4 = new customer(13,"Zhumashova", "Aizhan", "", "Pushkina 154", 404301444, 32145);
        customer customer5 = new customer(66,"Shim", "Assem", "", "Elibaeva 26A", 440043666, 66133);

        customerArrayList.add((customer1));
        customerArrayList.add((customer2));
        customerArrayList.add((customer3));
        customerArrayList.add((customer4));
        customerArrayList.add((customer5));


        System.out.println("a)");
        Collections.sort(customerArrayList, new SortBySurname());
        for (customer d: customerArrayList) {
            System.out.println(d);
        }


        System.out.println("b)");
        int first = 400000000;
        int second = 440041579;
        ArrayList<customer> range_customers = new ArrayList<>();
        for(customer l: customerArrayList){
            if(l.getCreditCardNumber()>=first && l.getCreditCardNumber()<=second){
                range_customers.add(l);
            }
        }

        for(customer l:range_customers){
            System.out.println(l);
        }
    }
}

class SortBySurname implements Comparator<customer>{
    @Override
    public int compare(customer c1, customer c2)  {
        return c1.getName().compareTo((c2.getName()));
    }
}
*/

//Problem 3
/*
class patient{
    int id;
    String surname;
    String firstname;
    String patronymic;
    String address;
    String phone;
    int medical_card_number;
    String diagnosis;



    public patient (int id, String surname, String firstname, String patronymic, String address, String phone, int medical_card_number, String diagnosis) {
        this.id = id;
        this.surname = surname;
        this.firstname = firstname;
        this.patronymic = patronymic;
        this.address = address;
        this.phone = phone;
        this.medical_card_number = medical_card_number;
        this.diagnosis = diagnosis;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName(){
        return surname;
    }
    public void setName(String name){
        this.surname = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getMedical_card_number() {
        return medical_card_number;
    }

    public void setMedical_card_number(int medical_card_number) {
        this.medical_card_number = medical_card_number;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString(){
        return "Patient " +
                "id: " + id +
                ", surname: " + surname +
                ", firstname: " + firstname +
                ", patronymic: " + patronymic +
                ", address: " + address +
                ", phone: " + phone +
                ", medical card number: " + medical_card_number +
                ", diagnosis: " + diagnosis;
    }
}

public class main{
    public static void main(String[] args) {

        ArrayList<patient> patientArrayList = new ArrayList<>();

        patient patient1 = new patient(34,"Tolegen", "Aruzhan", "", "Apattaeva 41",  "87776665544", 12345, "HSAN");
        patient patient2 = new patient(16,"Rashid", "Zhuldyzai", "", "Konaeva 13", "87771112233", 13456, "tuberculosis");
        patient patient3 = new patient(12,"Zhambylkyzy", "Dina", "", "Pushkina 154", "87779990099", 21345 , "thalassemia");
        patient patient4 = new patient(13,"Zhumashova", "Aizhan", "", "Pushkina 154", "87774445566", 32145, "asthma");
        patient patient5 = new patient(66,"Shim", "Assem", "", "Elibaeva 26A", "87776661313", 66133, "HSAN");

        patientArrayList.add((patient1));
        patientArrayList.add((patient2));
        patientArrayList.add((patient3));
        patientArrayList.add((patient4));
        patientArrayList.add((patient5));

        for (patient p: patientArrayList){
            if (p.diagnosis.equals("HSAN")){
                System.out.println(p);
            }
        }

        //b)
        int first = 15000;
        int second = 30000;
        ArrayList<patient> range_patients = new ArrayList<>();
        for(patient l: patientArrayList){
            if(l.getMedical_card_number()>=first && l.getMedical_card_number()<=second){
                range_patients.add(l);
            }
        }

    }
}
*/

//Problem 4
/*
class abiturient{
    int id;
    String surname;
    String firstname;
    String patronymic;
    String address;
    String phone;
    int mark;

    public abiturient(int id, String surname, String firstname, String patronymic, String address, String phone, int mark) {
        this.id = id;
        this.surname = surname;
        this.firstname = firstname;
        this.patronymic = patronymic;
        this.address = address;
        this.phone = phone;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Abiturient " +
                "id: " + id +
                ", surname: " + surname +
                ", firstname: " + firstname +
                ", patronymic: " + patronymic +
                ", address: " + address +
                ", phone: " + phone +
                ", mark: " + mark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return firstname;
    }

    public void setName(String name) {
        this.firstname = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String Patronymic) {
        this.patronymic = Patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getMarks() {
        return mark;
    }

    public void setMarks(int mark) {
        this.mark = mark;
    }
}

public class main {
    public static void main(String[] args) {
        abiturient abiturient1 = new abiturient(34,"Tolegen", "Aruzhan", "", "Apattaeva 41",  "87776665544", 89);
        abiturient abiturient2 = new abiturient(16,"Rashıd","Zhuldyzai","","Kjnayeva 13","87776665544",90);
        abiturient abiturient3 = new abiturient(13,"Zhambylkyzy","Dina","","Pushkina 154","87779990022",85);
        abiturient abiturient4 = new abiturient(24,"Zhumashova","Aizhan","","Pushkina 154","87776665554",95);
        abiturient abiturient5 = new abiturient(8,"Shim","Assem","","Elibaeva 26A","87776661313",95);

        ArrayList<abiturient> applicantArrayList = new ArrayList<>();
        applicantArrayList.add(abiturient1);
        applicantArrayList.add(abiturient2);
        applicantArrayList.add(abiturient3);
        applicantArrayList.add(abiturient4);
        applicantArrayList.add(abiturient5);

        ArrayList<abiturient> neudovletvorennye_marks = new ArrayList<>();
        for(abiturient m: applicantArrayList){
            if(m.getMarks()<70){
                neudovletvorennye_marks.add(m);
            }
        }

        System.out.println("неудовлетворенные оценки: ");
        for (abiturient d:neudovletvorennye_marks) {
            System.out.println(d);
        }

        int mark = 90;
        ArrayList<abiturient> above_the_given = new ArrayList<>();
        for(abiturient d:applicantArrayList){
            if(d.getMarks()>mark){
                above_the_given.add(d);
            }
        }
        System.out.println("баллов выше заданного: ");
        for(abiturient f:above_the_given){
            System.out.println(f);
        }

        int n = 2;
        Collections.sort(applicantArrayList,new SortByMarks());
        ArrayList<abiturient> the_best = new ArrayList<>();

        System.out.println("самые высокие баллы");
        for(int i = 0; i < n; i++){
            the_best.add(applicantArrayList.get(i));
        }
        System.out.println(the_best);

//        for(abiturient f:applicantArrayList){
//            if(f.getMarks()>70){
//                System.out.println(f);
//            }
//        }

    }
}
class SortByMarks implements Comparator<abiturient> {
    @Override
    public int compare(abiturient a1, abiturient a2) {
        if(a1.getMarks() == a2.getMarks()){
            return 0;
        }else if(a1.getMarks()>a2.getMarks()){
            return -1;
        }else{
        return 1;
        }
    }
}
*/

//Problem 5
/*
class book{
    int id;
    String name;
    String author;
    String publisher;
    int year;
    int pages;
    int price;
    String typeOfBinding;

    public book (int id, String name, String author, String publisher, int year, int pages, int price, String typeOfBinding){
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.pages = pages;
        this.price = price;
        this.typeOfBinding = typeOfBinding;
    }

    @Override
    public String toString() {
        return "Book " +
                "id: " + id +
                ", name: " + name +
                ", author: " + author +
                ", publisher: " + publisher +
                ", address: " + publisher +
                ", year: " + year +
                ", pages: " + pages +
                ", price: " + price +
                ", type of binding: " + typeOfBinding;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTypeOfBinding() {
        return typeOfBinding;
    }

    public void setTypeOfBinding(String typeOfBinding) {
        this.typeOfBinding = typeOfBinding;
    }
}

public class main {
    public static void main(String [] args){
        ArrayList<book> bookArrayList = new ArrayList<>();
        book book1 = new book(1, "Dumb Witness", "Agatha Christie", "London",  1996, 378, 1390, "Coptic stitch binding");
        book book2 = new book(2, "Кафе на краю земли", "Джон П. Стрелеки", "Лондон",  2003, 363, 2160, "Коптский стежок");
        book book3 = new book(3, "Десять негритят", "Агата Кристи ", "Лондон",  1939, 256, 1890, "разное");
        book book4 = new book(4, "В тихом омуте", "Пола Хокинс", "Лондон",  2017, 398, 2990, "разное");

        bookArrayList.add(book1);
        bookArrayList.add(book2);
        bookArrayList.add(book3);
        bookArrayList.add(book4);


        for (book b : bookArrayList){
            if(b.getAuthor().equals("Agatha Christie")){
                System.out.println(b.name + " is Agatha Christie's book");
            }
        }

        for (book b : bookArrayList){
            if(b.getPublisher().equals("Лондон")){
                System.out.println(b.name + " is London publishing book");
            }
        }

        for (book b : bookArrayList){
            if (b.getYear() > 1990){
                System.out.println(b.name + " " + b.getYear());
            }
        }
    }
}

 */

//Problem 6
/*
class house{
    int id;
    int apartment;
    int area;
    int floor;
    int rooms;
    String street;
    String building;
    int lifetime;

    public house (int id, int apartment, int area, int floor, int rooms, String street, String building, int lifetime){
        this.id = id;
        this.apartment = apartment;
        this.area = area;
        this.floor = floor;
        this.rooms = rooms;
        this.street = street;
        this.building = building;
        this.lifetime = lifetime;
    }

    @Override
    public String toString() {
        return "House " +
                "id: " + id +
                ", apartment number: " + apartment +
                ", area: " + area +
                ", floor: " + floor +
                ", number of rooms: " + rooms +
                ", street: " + street +
                ", building type: " + building +
                ", lifetime: " + lifetime ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public int getLifetime() {
        return lifetime;
    }

    public void setLifetime(int lifetime) {
        this.lifetime = lifetime;
    }
}

public class main {
    public static void main(String [] args){

        ArrayList<house> houseArrayList = new ArrayList<>();

        house house1 = new house(1, 13, 50, 3, 7, "Abai", "brick", 15);
        house house2 = new house(2, 66, 75, 2,  5, "Elibaeva", "brick", 25);
        house house3 = new house(3, 4, 100, 1,  4, "Pushkin", "brick", 30);


        houseArrayList.add(house1);
        houseArrayList.add(house2);
        houseArrayList.add(house3);


        for (house h : houseArrayList){
            if (h.getRooms() == 5){
                System.out.println("apartment " + h.apartment + " has " + h.getRooms() + " rooms");
            }
        }

        for (house h : houseArrayList){
            if (h.getRooms() == 7){
                if (h.getFloor() > 1 && h.getFloor() < 5){
                    System.out.println(h);
                }
            }
        }

        for (house h : houseArrayList){
            if (h.area > 70){
                System.out.println("apartment" +  h.apartment + " area: " + h.area + "m^2");
            }
        }
    }
}
*/

//Problem 7
/*
class Phone {
    int id;
    String surname;
    String firstname;
    String patronymic;
    String address;
    int credit_card_num;
    int debit;
    int credit;
    int time;

    public Phone(int id, String surname, String name, String patronymic, String address, int credit_card_num, int debit, int credit, int time) {
        this.id = id;
        this.surname = surname;
        this.firstname = name;
        this.patronymic = patronymic;
        this.address = address;
        this.credit_card_num = credit_card_num;
        this.debit = debit;
        this.credit = credit;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Phone " +
                "id: " + id +
                ", surname: " + surname +
                ", firstname: " + firstname +
                ", patronymic: " + patronymic +
                ", address: " + address +
                ", credit card number: " + credit_card_num +
                ", debit: " + debit +
                ", credit: " + credit +
                ", time: " + time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCredit_card_num() {
        return credit_card_num;
    }

    public void setCredit_card_num(int credit_card_num) {
        this.credit_card_num = credit_card_num;
    }

    public int getDebit() {
        return debit;
    }

    public void setDebit(int debit) {
        this.debit = debit;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}

    public class main{
    public static void main(String[] args) {

        Phone phone1 = new Phone(1,"Tolegen","Aru","", "Apataeva 47",44004321,13,1,8);
        Phone phone2 = new Phone(2,"Rashıd","Zhuldyzai","","Konaeva 13",44034301,3,8,22);
        Phone phone3 = new Phone(3,"Zhambylkyzy","Dına","","Pushkina 154",44014301,9,9,13);
        Phone phone4 = new Phone(4,"Zhumashova","Aizhan","","Pushkina 154",44504301,5,3,3);
        Phone phone5 = new Phone(5,"Shim","Assem","","Elibaeva 26A",44004304,7,1,5);
        ArrayList<Phone> phoneArrayList = new ArrayList<>();

        phoneArrayList.add(phone1);
        phoneArrayList.add(phone2);
        phoneArrayList.add(phone3);
        phoneArrayList.add(phone4);
        phoneArrayList.add(phone5);


        int givenTime = 15;
        ArrayList<Phone> limitTime = new ArrayList<>();
        for(Phone s:phoneArrayList){
            if(s.getTime()>givenTime){
                limitTime.add(s);
            }
        }
        System.out.println(limitTime);


        //b) не получилось


        Collections.sort(phoneArrayList,new SortByName());
    }
}
class SortByName implements Comparator<Phone> {

    @Override
    public int compare(Phone first, Phone second) {
        return first.getFirstname().compareTo(second.getFirstname());
    }
}*/

//Problem 8
/*
class Car {
    int id;
    String brand;
    String model;
    int yearOfIssue;
    String color;
    int price;
    String regNum;

    public Car(int id, String brand, String model, int yearOfIssue, String color, int price, String regNum) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.color = color;
        this.price = price;
        this.regNum = regNum;
    }

    @Override
    public String toString() {
        return "Car " +
                "id: " + id +
                ", brand: " + brand +
                ", model: " + model +
                ", year of issue: " + yearOfIssue +
                ", color: " + color +
                ", price: " + price +
                ", regNum: " + regNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

}
    public class main {
    public static void main(String [] args){
        ArrayList<Car> carArrayList = new ArrayList<>();
        Car car1 = new Car(1, "Hyundai", "i20", 2008, "grey", 5000000, "666");
        Car car2 = new Car(2, "Bugatti", "veyron", 2015, "black", 1500000000, "000");
        Car car3 = new Car(3, "Toyota", "86", 2013, "whitw",  7000000, "223");

        carArrayList.add(car1);
        carArrayList.add(car2);
        carArrayList.add(car3);

        for (Car s : carArrayList){
            if (s.brand.equals("Hyundai")){
                System.out.println(s);
            }
        }

        for (Car s : carArrayList){
            if (s.brand.equals("Toyota") && s.yearOfIssue < 2010){
                System.out.println(s);
            }
        }

        for (Car s : carArrayList){
            if (s.yearOfIssue == 2013 && s.price > 5000000){
                System.out.println(s);
            }
        }
    }
}
*/

//Problem 9
/*
class product{
    int id;
    String name;
    int UPC;
    String manufacturer;
    int price;
    int shelfLife;
    int quantity;

    public product(int id, String name, int UPC, String manufacturer, int price, int shelfLife, int quantity){
        this.id = id;
        this.UPC = UPC;
        this.manufacturer = manufacturer;
        this.name = name;
        this.price = price;
        this.shelfLife = shelfLife;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product, " +
                "id: " + id +
                ", name: " + name +
                ", UPC: " + UPC +
                ", price: " + price + "tg " +
                ", shelf life: " + shelfLife + " month " +
                ", quantity: " + quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUPC() {
        return UPC;
    }

    public void setUPC(int UPC) {
        this.UPC = UPC;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

public class main {
    public static void main(String [] args){
        ArrayList<product> trainsArrayList = new ArrayList<>();
        product product1 = new product(1 , "ramen", 123, "hanguk", 500, 12, 200);
        product product2 = new product(1 , "kitkat", 666, "nestle", 300, 24, 300);
        product product3 = new product(1 , "aitea", 870, "zhigalma", 280, 6, 150);

        trainsArrayList.add(product1);
        trainsArrayList.add(product2);
        trainsArrayList.add(product3);

        //a)
        for (product p : trainsArrayList){
            if (p.name.equals("ramen")){
                System.out.println(p);
            }
        }

        //b)
        for (product p : trainsArrayList){
            if (p.name.equals("ramen")){
                if (p.price < 700){
                    System.out.println(p);
                }
            }
        }

        //c)
        for (product p : trainsArrayList){
            if (p.shelfLife > 12){
                    System.out.println(p);
            }
        }
    }
}
*/

//Problem 10
/*
class Train{
    String destination;
    int trainNumber;
    String departureTime;
    int numberOfSeats;

    public Train(String destination, int trainNumber, String departureTime, int numberOfSeats){
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Train, " +
                "destination: " + destination +
                ", train number: " + trainNumber +
                ", departure time: " + departureTime +
                ", number of seats: " + numberOfSeats;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}

public class main {
    public static void main(String [] args){
        ArrayList<Train> trainsArrayList = new ArrayList<>();
        Train train1 = new Train("South Korea", 13, "21:50", 66);
        Train train2 = new Train("Japan", 4, "10:45", 13);
        Train train3 = new Train("Poland", 8, "00:00", 56);

        trainsArrayList.add(train1);
        trainsArrayList.add(train2);
        trainsArrayList.add(train3);

//a)
        for (Train t : trainsArrayList){
            if (t.destination.equals("South Korea")){
                System.out.println(t);
            }
        }

        //b)
        for (Train t : trainsArrayList){
            if (t.destination.equals("South Korea")){
                if (t.departureTime.equals("21:50")){
                    System.out.println(t);
                }
            }
        }

        //c)
        for (Train t : trainsArrayList){
            if (t.destination.equals("Japan")){
                if (t.numberOfSeats == 13){
                    System.out.println(t);
                }
            }
        }
    }
}
*/
