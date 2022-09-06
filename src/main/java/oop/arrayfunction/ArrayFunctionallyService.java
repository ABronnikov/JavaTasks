package oop.arrayfunction;

public class ArrayFunctionallyService {

    public ArrayDetail getArrayByCriteria(int[] numbers) {
        ArrayDetail arrayDetail = new ArrayDetail();
        arrayDetail.setFirstElement(numbers[0]);
        arrayDetail.setLastElement(numbers[numbers.length - 1]);
        arrayDetail.setSumBetweenFirstAndLast(getSumNumbersBetweenIndex(numbers, 1, numbers.length - 2));
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
