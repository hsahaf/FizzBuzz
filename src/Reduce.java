public class Reduce {
    public static void main(String[] args) {
        int num = 100;
        int count;
        count = 0;
        while (num != 0){
            boolean evenNum =  num % 2 == 0;
            if (evenNum) {
                num = num/2;
                count++;
            } else {
                num = num - 1;
                count++;

            }


        }
    }
}
