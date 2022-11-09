package util;

import java.util.ArrayList;
// так как Facade скрывает сложность системы путём сведения всех возможных внешних вызовов к одному объекту,
//то сам класс Fibonachi может его заменить

public class Fibonachi {
    @Override
    public String toString() {
        return "util.Fibonachi{" +
                "fib=" + fib +
                '}';
    }

    private ArrayList<Long> fib;

    public Fibonachi(ArrayList<Long> fib) {
        this.fib = fib;
    }

    public Fibonachi() {
    }

    public ArrayList<Long> getFib() {
        return fib;
    }

    public void setFib(ArrayList<Long> fib) {
        this.fib = fib;
    }

    public ArrayList<Long> findFirstNNumbers(int n) {
        long[] arr = new long[n + 1];
        fib = new ArrayList<>();
        if (n <= 0) {
            System.out.println("N is not correct");
        } else if (n == 1) {
            fib.add(0L);
            fib.add(1L);
        } else if (n == 2) {
            fib.add(0L);
            fib.add(1L);
            fib.add(1L);
        } else {
            arr[1] = 1;
            arr[2] = 1;
            for (int i = 3; i < arr.length; ++i) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
            for (int i = 0; i <= n; i++) {
                fib.add(arr[i]);
            }
        }
        return fib;
    }

    public long findNFib(int n) {
        long[] arr = new long[n + 1];
        if (n <= 0) {
            System.out.println("N is not correct");
        } else if (n == 1) {
            arr[1] = 1;
        } else {
            arr[1] = 1;
            arr[2] = 1;
            for (int i = 3; i < arr.length; ++i) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
        }
        return arr[n];
    }
}
