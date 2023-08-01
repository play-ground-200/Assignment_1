public class Demo4{
    public static void main(String[] args) {
        int day = 28;
        int month = 12;
        int year = 2023;
        int hour = 23;
        int minute = 59;
        int second = 59;
        String reset = "\033[0m";

        System.out.printf("\033[31m%2$d%1$s/\033[32m%3$d%1$s/\033[33m%4$d%1$s \033[34m%5$d%1$s:\033[35m%6$d%1$s:\033[31m%7$d", reset, day, month, year, hour, minute, second);
    }
}