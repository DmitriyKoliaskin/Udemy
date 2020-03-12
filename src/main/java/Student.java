public class Student {

    private int studentTicket, yearOfStudy;
    private String name, surName;
    private double averageM, averageE, averageI;

    public Student(String name, String surName, int studentTicket, int yearOfStudy, double averageM, double averageE, double averageI) {
        this.name = name;
        this.surName = surName;
        this.studentTicket = studentTicket;
        this.yearOfStudy = yearOfStudy;
        this.averageM = averageM;
        this.averageE = averageE;
        this.averageI = averageI;
    }

    public double averagePoint() {
        return (this.averageM + this.averageE + this.averageI) / 3;
    }

    public int getStudentTicket() {
        return studentTicket;
    }

    public void setStudentTicket(int studentTicket) {
        this.studentTicket = studentTicket;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public double getAverageM() {
        return averageM;
    }

    public void setAverageM(double averageM) {
        this.averageM = averageM;
    }

    public double getAverageE() {
        return averageE;
    }

    public void setAverageE(double averageE) {
        this.averageE = averageE;
    }

    public double getAverageI() {
        return averageI;
    }

    public void setAverageI(double averageI) {
        this.averageI = averageI;
    }
}
