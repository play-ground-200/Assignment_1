public class Demo5{
    public static void main(String[] args) {
        int number1 = 978;
        int number2 = 3;
        int number3= 16;
        int number4 = 1484100;
        String reset = "\033[0m";
        System.out.printf("\033[31m%2$d%1$s-\033[32m%3$d%1$s-\033[33m%4$d%1$s-\033[34m%5$d%1$s", reset, number1, number2, number3, number4); 
    }
}