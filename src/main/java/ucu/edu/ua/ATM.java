package ucu.edu.ua;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ATM {
    private Section firstSection;
    public ATM(Integer... denominations){
//        this.firstSection = new Section(1000);
//        Section section500 = new Section(500);
//        Section section100 = new Section(100);
////        firstSection.process(amount);
//        firstSection.setNext(section500);
//        section500.setNext(section100);

        List<Integer> sortedDenoms = Arrays.asList(denominations);
        sortedDenoms.sort(Collections.reverseOrder());

        this.firstSection = new Section(sortedDenoms.get(0));
        Section current = firstSection;

        for (int i = 1; i < sortedDenoms.size(); i++) {
            Section next = new Section(sortedDenoms.get(i));
            current.setNext(next);
            current = next;
        }
    }
    public void process(int amount) {
//        if (amount % 100 != 0) {
//            throw new IllegalArgumentException("Amount must be divisible by 100");
//        }
        if (amount < 1){
            throw new IllegalArgumentException("We dont have coins");
        }
        firstSection.process(amount);
    }
}
