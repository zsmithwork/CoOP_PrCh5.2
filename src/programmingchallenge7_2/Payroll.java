package programmingchallenge7_2;
import javax.swing.JOptionPane;

public class Payroll {
    private int[] employeeId = new int[]{5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
    private int[] hours;
    private double[] payRate;
    private double[] wages;
    private final int NUM = 7;
    private int empHour;
    private double empPay;
    private String cinStr;


    public Payroll() {
        hours = new int[NUM];
        payRate = new double[NUM];
        wages = new double[NUM];
    }
    public void setAll() {
        for(int i = 0; i < employeeId.length; i++) {
            cinStr = JOptionPane.showInputDialog("Input hours worked by employee " + employeeId[i] + ":");
            empHour = Integer.parseInt(cinStr);
            while (empHour < 0) {
                JOptionPane.showMessageDialog(null, "Invalid input, please use nonnegative numbers only");
                cinStr = JOptionPane.showInputDialog("Input hours worked by employee " + employeeId[i] + ":");
                empHour = Integer.parseInt(cinStr);
            }
            hours[i] = empHour;
            cinStr = JOptionPane.showInputDialog("Input pay rate for employee " + employeeId[i] + ":");
            empPay = Double.parseDouble(cinStr);
            while (empPay < 6.00) {
                JOptionPane.showMessageDialog(null, "Invalid input, please use numbers above 6.00 only");
                cinStr = JOptionPane.showInputDialog("Input pay rate for employee " + employeeId[i] + ":");
                empPay = Double.parseDouble(cinStr);
            }
            payRate[i] = empPay;
            wages[i] = empHour * empPay;
        }
    }
    public void setEmp(int id) {
        int i = 0;
        while (id != employeeId[i] && i < employeeId.length) {
            i++;
        }
        if (id != employeeId[i]) {
            JOptionPane.showMessageDialog(null, "ID not found");
            return;
        }
        cinStr = JOptionPane.showInputDialog("Input hours worked by employee " + employeeId[i] + ":");
        empHour = Integer.parseInt(cinStr);
        while (empHour < 0) {
            JOptionPane.showMessageDialog(null, "Invalid input, please use nonnegative numbers only");
            cinStr = JOptionPane.showInputDialog("Input hours worked by employee " + employeeId[i] + ":");
            empHour = Integer.parseInt(cinStr);
        }
        hours[i] = empHour;
        cinStr = JOptionPane.showInputDialog("Input pay rate for employee " + employeeId[i] + ":");
        empPay = Double.parseDouble(cinStr);
        while (empPay < 6.00) {
            JOptionPane.showMessageDialog(null, "Invalid input, please use numbers above 6.00 only");
            cinStr = JOptionPane.showInputDialog("Input pay rate for employee " + employeeId[i] + ":");
            empPay = Double.parseDouble(cinStr);
        }
        payRate[i] = empPay;
        wages[i] = empHour * empPay;
    }
    public void setHours(int id, int hr) {
        int i = 0;
        while (id != employeeId[i] && i < employeeId.length) {
            i++;
        }
        if (id == employeeId[i])
            hours[i] = hr;
        else {
            JOptionPane.showMessageDialog(null, "ID not found");
            return;
        }
        return;
    }
    public void setPay(int id, int pay) {
        int i = 0;
        while (id != employeeId[i] && i < employeeId.length) {
            i++;
        }
        if (id == employeeId[i])
            payRate[i] = pay;
        else {
            JOptionPane.showMessageDialog(null, "ID not found");
            return;
        }
        return;
    }
    public void setWage (int id) {
        int i = 0;
        while (id != employeeId[i] && i < employeeId.length) {
            i++;
        }
        if (id == employeeId[i])
            wages[i] = hours[i] * payRate[i];
        else {
            JOptionPane.showMessageDialog(null, "ID not found");
            wages[i] = 0.0;
        }
    }
    public int getLength () {
        return employeeId.length;
    }
    public int getId (int i) {
        if (i <= employeeId.length)
            return employeeId[i];
        else
            return 0;
    }
    public int getHours(int id) {
        int i = 0;
        while (id != employeeId[i] && i < employeeId.length) {
            i++;
        }
        if (id == employeeId[i])
            return hours[i];
        else {
            JOptionPane.showMessageDialog(null, "ID not found");
            return 0;
        }
    }
    public double getPay(int id) {
        int i = 0;
        while (id != employeeId[i] && i < employeeId.length) {
            i++;
        }
        if (id == employeeId[i])
            return payRate[i];
        else {
            JOptionPane.showMessageDialog(null, "ID not found");
            return 0.0;
        }
    }
    public double getWage(int id) {
        int i = 0;
        while (id != employeeId[i] && i < employeeId.length) {
            i++;
        }
        if (id == employeeId[i])
            return (hours[i] * payRate[i]);
        else {
            JOptionPane.showMessageDialog(null, "ID not found");
            return 0.0;
        }
    }
}
