public class Problem2 {

    // Do not change signature (function name, parameters)
    // Ascending
    public static void bubbleSort(int[] data) {
        boolean isSorted = false;
        while(isSorted == false) {
            isSorted = true;
            for (int i = 0; i < data.length - 1; i++) {

                if (data[i] > data[i + 1]) {
                    isSorted = false;
                    int varSwitch = data[i + 1];
                    data[i + 1] = data[i];
                    data[i] = varSwitch;

                }

            }
        }

    }
}