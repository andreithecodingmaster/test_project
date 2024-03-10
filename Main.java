public class Main {
    public static void main(String[] args) {
        int [] array = {1, 22, 3, 4, 5, 6, 7, 8};
        int target = 30;

        for(int i = 0; i < array.length; i++) {
            for(int j = 1 + i; j < array.length; j++) {
                if(array[i] < target) {
                    if(array[j] == (target - array[i])) {
                        System.out.println(i + " " + j);
                    }
                }
            }
        }
    }
}
