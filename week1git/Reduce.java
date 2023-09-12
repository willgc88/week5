public class Reduce {
    public static int main(int n) {
        int x = n;
        int count = 0;
        while (x != 0){
            if (x % 2 == 0){
                x = x / 2;
            }else{
                x = x - 1;
            }
            count++;
        }
        return count;
    }
}
