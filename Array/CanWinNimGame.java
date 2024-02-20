class solution{
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.canWinNim(6));
    }
}
