package ucu.edu.ua;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM(1000, 500, 200, 100, 50, 10, 5, 2, 1);
        atm.process(1510);
    }
}