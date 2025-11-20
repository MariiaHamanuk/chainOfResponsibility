package ucu.edu.ua;

public class Task2 {
    public static void main(String[] args) {
        Signature<Integer> s1 = new Signature<>(System.out::println);
        Signature<Integer> s2 = new Signature<>(x -> System.out.println(x * x));
        Signature<Integer> s3 = new Signature<>(x -> System.out.println(x * x * x));

        Group<Integer> nestedGroup = new Group<>();
        nestedGroup.addTask(s1).addTask(s2);

        Group<Integer> group = new Group<>();
        group.addTask(nestedGroup).addTask(s3);

        group.apply(10);

        System.out.println("Main UUID " + group.groupUuid);
        System.out.println("Nested UUID " + nestedGroup.groupUuid);

        System.out.println("1 " + s1.getHeader("groupId"));
        System.out.println("2 " + s2.getHeader("groupId"));
        System.out.println("3 " + s3.getHeader("groupId"));
    }
}

