class SmallestInfiniteSet {

    private int current;
    private TreeSet<Integer> set;

    public SmallestInfiniteSet() {
        current = 1;
        set = new TreeSet<>();
    }

    public int popSmallest() {
        if (!set.isEmpty()) {
            return set.pollFirst();
        }
        return current++;
    }

    public void addBack(int num) {
        if (num < current) {
            set.add(num);
        }
    }
}
