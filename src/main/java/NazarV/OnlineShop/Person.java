package NazarV.OnlineShop;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String personId;
    private String name;
    private String surname;
    private LocalDate birthDay;
    private String phoneNumber;
    private boolean isAdult;

    public Person(String personId, String name, String surname, LocalDate birthDay) {
        this.personId = personId;
        this.name = name;
        this.surname = surname;
        this.birthDay = birthDay;
        this.isAdult = checkOlds();
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }

    public int getAge() {
        Period age = Period.between(birthDay, LocalDate.now());
        return age.getYears();
    }

    public boolean checkOlds() {
        if (getAge() < 18) return false;
        return true;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId='" + personId + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDay=" + birthDay +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", isAdult=" + isAdult +
                '}';
    }
}
