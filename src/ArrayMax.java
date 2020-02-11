public class ArrayMax {

       public static void main(String[] args) {
            int[] array = {1,2,34,3,7,3,90,33,54};
            int max = max(array);
            System.out.println(max);
        }

        public static int max(int[] array) {
            int max = array[0];
            for(int i = 0; i < array.length; i ++){
                if(array[i] > max){
                    max = array[i];
                }
            }

            return max;
        }
    }

