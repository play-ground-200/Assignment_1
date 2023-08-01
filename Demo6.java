public class Demo6{
    public static void main(String[] args) {
        
        System.out.printf("\033[41m[   5\033[42m0%%  ]\033[0m\n");

        String name1 = "Alice";
        String name2 = "Bob";

        int age1 = 24;
        int age2 = 30;
        String yello = "\033[33m";
        String reset = "\033[0m";

        System.out.printf("%s+---------------+-----+%s\n", yello, reset);
        System.out.printf("%1$s|\033[34;1m%3$-15s%2$s%1$s|\033[34;1m%4$-5s%2$s%1$s|%2$s\n",yello, reset, "Name", "Age");
        System.out.printf("%s+---------------+-----+%s\n", yello, reset);
        System.out.printf("%1$s|%2$s%3$-15s%1$s|\033[35m%4$ -5d%2$s%1$s|%2$s\n",yello, reset, name1, age1);
        System.out.printf("%1$s|%2$s%3$-15s%1$s|\033[35m%4$ -5d%2$s%1$s|%2$s\n",yello, reset, name2, age2);
        System.out.printf("%s+---------------+-----+%s\n", yello, reset);
    }
} 