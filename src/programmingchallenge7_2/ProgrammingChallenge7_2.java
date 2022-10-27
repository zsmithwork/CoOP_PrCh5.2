package programmingchallenge7_2;

public class ProgrammingChallenge7_2 {

    public static void main(String[] args) {
        Payroll empSheet = new Payroll();
        
        empSheet.setAll();

        int len = empSheet.getLength();
        int id;
        
        for (int i = 0; i < len; i++) {
            id = empSheet.getId(i);
            System.out.print("ID# : " + id);
            System.out.printf(" Wage : %.2f%n", empSheet.getWage(id));
        }
    }

}
