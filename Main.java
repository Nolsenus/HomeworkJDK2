public class Main {
    public static void main(String[] args) {
        Pair<Integer> ints = new Pair<>(1, 2);
        System.out.println(concatPair(ints));
        Pair<String> strings = new Pair<>("first", "second");
        System.out.println(concatPair(strings));
    }

    public static <T> String concatPair(Pair<T> pair) {
        return pair.getFirst().toString() + pair.getSecond().toString();
    }
}
