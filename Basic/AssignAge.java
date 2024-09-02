package TIllMay2024.Array;

// program to assign different age values to the different variables

public class AssignAge {
    public static void main(String[] args){
        // declare integer array to contain age values for different person
        int[] age = {5,10,15,20,25,30,35,40};
        String[] str = {"aman", "arun", "ajit", "ram", "sham", "gor", "villa", "bon"};

        // for loop for printing all the assigned ages to the respective names
        for (int i=0; i< age.length; i++){
            System.out.println(str[i]+"'s age is "+age[i]);
        }
    }
}
