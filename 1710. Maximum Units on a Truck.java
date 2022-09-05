class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int output = 0;
        Integer[] max = new Integer[boxTypes.length];
        for (int i = 0; i < boxTypes.length; i++)
            max[i] = boxTypes[i][1];

        Arrays.sort(max, Collections.reverseOrder());

        int counter = 0;
        int sumOfBoxes = 0;
        for (int i = 0; i < boxTypes.length; i++) {
            sumOfBoxes += boxTypes[i][0];
        }

        if (sumOfBoxes <= truckSize) {
            for (int i = 0; i < boxTypes.length; i++)
                output += (boxTypes[i][0] * boxTypes[i][1]);
            return output;
        }
        for (int i = 0; i < boxTypes.length; i++) {
            if (max[counter] == boxTypes[i][1]) {
                if (boxTypes[i][0] >= truckSize) {
                    output += (boxTypes[i][1] * truckSize);
                    truckSize = boxTypes[i][0] - truckSize;
                    return output;
                } else {
                    if (boxTypes[i][0] != 0) {
                        truckSize = truckSize - boxTypes[i][0];
                        output += (boxTypes[i][1] * boxTypes[i][0]);
                        boxTypes[i][0] = 0;
                        i = -1;
                        counter++;
                    }
                }
            }
        }
        return output;
    }
}
