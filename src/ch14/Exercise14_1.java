package ch14;

class Exercise14_1 {

    public static void main(String[] args) {
        System.out.println(max(10, 20));

        IntBinaryOperator f1 = (a, b) -> a > b ? a : b;
        System.out.println(f1.applyAsInt(10, 20));

        printVar("IceMan4U", 23);
        BiConsumer<String, Integer> f2 = (String name, Integer i) -> System.out.println(name + "=" + i);
        f2.accept("IceMan4U", 23);

        System.out.println(square(4));
        IntUnaryOperator f3 = x -> x * x;
        System.out.println(f3.applyAsInt(4));

        System.out.println(roll());
        IntSupplier f4 = () -> (int) (Math.random() * 6);
        System.out.println(f4.getAsInt());

        System.out.println(sumArr(new int[] { 1, 2, 3, 4 }));
        ToIntFunction<int[]> f5 = arr -> {
            int sum = 0;
            for (int i : arr)
                sum += i;
            return sum;
        };
        System.out.println(f5.applyAsInt(new int[] { 1, 2, 3, 4 }));

        System.out.println(Arrays.toString(emptyArr()));
        Supplier<int[]> f6 = () -> new int[] {};
        System.out.println(Arrays.toString(f6.get()));

    }

    static int max(int a, int b) {
        return a > b ? a : b;
    }

    static void printVar(String name, int i) {
        System.out.println(name + "=" + i);
    }

    static int square(int x) {
        return x * x;
    }

    static int roll() {
        return (int) (Math.random() * 6);
    }

    static int sumArr(int[] arr) {
        int sum = 0;
        for (int i : arr)
            sum += i;
        return sum;
    }

    static int[] emptyArr() {
        return new int[] {};
    }

}
