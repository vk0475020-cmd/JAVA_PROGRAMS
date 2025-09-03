class UserMainCode {
    public int factorial(int input1) {
        int t = 1;   // initialize result as 1

        for (int i = input1; i > 1; i--) {
            t = t * i;   // multiply step by step
        }

        return t;
    }
}
