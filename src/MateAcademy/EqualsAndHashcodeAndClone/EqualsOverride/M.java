package MateAcademy.EqualsAndHashcodeAndClone.EqualsOverride;

public class M {
    public static void main(String[] args) {
        User user = new User("Bob", 23, 12345);
        User user1 = new User("Bob", 23, 12345);
        User user2 = new User("Alice", 22, 2222);

        // first case
        System.out.println("First case : ");
        System.out.println(user.equals(user1));
        System.out.println(user.hashCode());
        System.out.println(user1.hashCode());

        // second case


        // Third case
        System.out.println("Third case : ");
        System.out.println(user2.equals(user1));
        System.out.println(user2.hashCode());
        System.out.println(user1.hashCode());

    }
}
