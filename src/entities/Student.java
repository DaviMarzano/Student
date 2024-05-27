package entities;

public class Student {
    public String name;
    public double note1;
    public double note2;
    public double note3;
    public double missingPoints;

    public double TotalGrade() {
        return this.note1 + this.note2 + this.note3;
    }

    public String PassFailed() {
        if (TotalGrade() > 60) {
            return "Pass";
        } else missingPoints = 60 - TotalGrade();
        return "FAILED" + " MISSING " + missingPoints + "POINTS";
    }
}
