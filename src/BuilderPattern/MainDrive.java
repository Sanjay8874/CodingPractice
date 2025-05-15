package BuilderPattern;

public class MainDrive {

    public static void main(String[] args) {

        User user = new User.Builder().setName("Sanjay").setAddress("Jaunpur").setEmail("san@gmail.com").setId("12")
                .setPhone("3434533").build();
        System.out.println(user);


        User user1 = new User.Builder().setAddress("Jaunpur").setEmail("san@gmail.com").setId("12")
                .setPhone("3434533").build();
        System.out.println(user1);


    }

}
