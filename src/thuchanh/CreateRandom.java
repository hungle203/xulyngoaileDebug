package thuchanh;

import java.util.Random;

public class CreateRandom {
    public Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sách của mảng");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt();
            System.out.println(arr[i] + "");
        }
        return arr;
    }
}
