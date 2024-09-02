package TIllMay2024.Digvijay;


public class MonthCalender {
    public static void main(String[] args)
    {   int weeks = 4;
        int days = 7;
        int i = 1;

        while (i <= weeks) {
            System.out.println("Week: " + i);

            for (int j = 1; j <= days; ++j) {
                System.out.println("    Days: " + j);
            }
            ++i;
        }
    }
}
