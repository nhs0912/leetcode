
public class Sort {
    Integer[] numberArr = null;

    private void print(Integer[] arr) {
        for (Integer num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private Integer[] executeSelectSort(Integer[] list) {

        for (int i = 0; i < list.length; i++) {
            int selectNumber = list[i];
            int minNumberIndex = i;

            // want to find a min number and min number index
            for (int j = i; j < list.length; j++) {
                if (selectNumber > list[j]) {
                    selectNumber = list[j];
                    minNumberIndex = j;
                }
            }
            //change min number and selectNumber
            list[minNumberIndex] = list[i];
            list[i] = selectNumber;
        }
        return list;
    }


    private void Execute() {
        numberArr = new Integer[]{9, 3, 78, 123, 56, 26, 84};

        Integer[] result = executeSelectSort(numberArr);
        print(result);
    }

    public static void main(String[] args) {
        new Sort().Execute();
    }
}
