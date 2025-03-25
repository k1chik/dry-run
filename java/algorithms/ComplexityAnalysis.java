public class ComplexityAnalysis {
    public static void main(String[] args) {
        int[] arr = generateRandomArray(1000000); // 1 million elements

        long start = System.nanoTime();
        int max1 = findMaxLinear(arr);
                long end = System.nanoTime();
                System.out.println("Linear Search Max: " + max1 + " | Time: " + (end - start) + " ns");
        
                start = System.nanoTime();
                int max2 = findMaxDivideAndConquer(arr, 0, arr.length - 1);
                                end = System.nanoTime();
                                System.out.println("Divide & Conquer Max: " + max2 + " | Time: " + (end - start) + " ns");           
            }
        
            // Generates an array of random integers
    public static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 1000000000);
        }
        return arr;
    }


    private static int findMaxDivideAndConquer(int[] arr, int left, int right) {
        /*
         * split array into two parts
         * check if both parts are same size
         * 
        */
        
        if(left == right){
            return arr[left];
        }
            
        int mid = left + (right - left)/2;
        left = findMaxDivideAndConquer(arr, left, mid);
        right = findMaxDivideAndConquer(arr, mid + 1, right);
        return Math.max(left, right);
    }

            private static int findMaxLinear(int[] arr) {
                int max = arr[0];

                for(int i = arr[1]; i < arr.length; i++){
                    if(i > max){
                        max = arr[i];
                    }
                }
                return max;
            }

    }


