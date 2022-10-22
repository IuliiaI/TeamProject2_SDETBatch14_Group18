package Tasks;

public class Task2 {
    /*    We have to calculate the average of marks obtained in three subjects by student Tasks.A and by
     student Tasks.B. Create class 'Tasks.Marks' with an abstract method 'getPercentage' that will be returning
     the average percentage of marks. Provide implementation of abstract method in classes
     'Tasks.A' and 'Tasks.B'. The constructor of student Tasks.A takes the marks in three subjects as its parameters and
     the marks in four subjects as its parameters for student Tasks.B. Test your code    */
    public static void main(String[] args) {
        Marks[] marks={new A(75,70,80),new B(90,65,90,80)};
        for(Marks m:marks){
           System.out.println(m.getPercentage());
        }
        /*Tasks.A studentA = new Tasks.A(75, 70, 80);
        /double average1 = studentA.getPercentage();
        System.out.println(average1);*/
    }
}
abstract class Marks{
    double mathMark;
    double historyMark;
    double economicsMark;

    Marks(double mathMark,double historyMark,double economicsMark){
        this.mathMark=mathMark;
        this.historyMark=historyMark;
        this.economicsMark=economicsMark;
    }
    abstract double getPercentage();
}
class A extends Marks{

    A(double mathMark, double historyMark, double economicsMark) {
        super(mathMark, historyMark, economicsMark);
    }

    @Override
    double getPercentage() {
        return (mathMark+historyMark+economicsMark)/3;
    }
}
class B extends Marks{
    double codingMark;

    B(double mathMark, double historyMark, double economicsMark,double codingMark) {
        super(mathMark, historyMark, economicsMark);
        this.codingMark=codingMark;
    }

    @Override
    double getPercentage() {
        return (mathMark+historyMark+economicsMark+codingMark)/4;
    }
}