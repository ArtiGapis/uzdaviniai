package lt.bt.Uzdaviniai.papildomi.PlanasC;

public class Person {

    private String name;
    private String lastName;
    private int birthYears;
    private int birthMonth;
    private int birthDay;

    String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }

    String getLastName() {
        return lastName;
    }
    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    int getBirthYears() {
        return birthYears;
    }
    void setBirthYears(int birthYears) {
        this.birthYears = birthYears;
    }

    int getBirthMonth() {
        return birthMonth;
    }
    void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    int getBirthDay() {
        return birthDay;
    }
    void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString(){
        return name+" "+lastName+" "+birthYears+"/"+birthMonth+"/"+birthDay;
    }

}
