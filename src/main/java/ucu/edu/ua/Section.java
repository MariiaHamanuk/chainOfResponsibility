package ucu.edu.ua;

public class Section {
    private int denomination;
    private Section next;
    public Section(int denomination){
        this.denomination = denomination;
    }
    public void setNext(Section next){
        this.next = next;
    }
    public void process(int amount){
        int quantity = amount/denomination;
        if (quantity!=0){
            System.out.println(denomination + " " + quantity);
        }
        int leftover = amount % denomination;
        if (leftover > 0 ){
            if (next != null){
                next.process(leftover);

            }else {
                throw new IllegalArgumentException("there is no");
            }

        }
    }
}
