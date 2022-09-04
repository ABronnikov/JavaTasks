package oop.arrayfunction;

public class ArrayFunctionallyService {

    public ArrayDetail getArrayByCriteria(int[] numbers) {
        ArrayDetail arrayDetail = new ArrayDetail();
        arrayDetail.setFirstElement(numbers[0]);
        arrayDetail.setLastElement(numbers[numbers.length - 1]);
        int sum = 0;
        for (int i = 1; i < numbers.length - 1; i++) {
            sum += numbers[i];
        }
        arrayDetail.setSumBetweenFirstAndLast(sum);
        return arrayDetail;
    }

    public int getSumNumbersBetweenIndex(int[] numbers, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
