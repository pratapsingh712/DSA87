package easyProblems;

public class NumberOfOnesBit {

    public static void main(String[] args) {

        System.out.println(hammingWeight(6));

    }

    public static int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i <= 31; i++) {
            if ((n & (1 << i)) != 0) {
                count++;
            }
        }

        return count;
    }
}

