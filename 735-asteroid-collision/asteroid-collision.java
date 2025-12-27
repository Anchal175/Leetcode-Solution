class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int ast : asteroids) {

            while (!stack.isEmpty() && stack.peek() > 0 && ast < 0) {

                if (stack.peek() < -ast) {
                    stack.pop();        // stack wala chhota → destroy
                } 
                else if (stack.peek() == -ast) {
                    stack.pop();        // dono equal → dono destroy
                    ast = 0;
                    break;
                } 
                else {
                    ast = 0;            // current chhota → destroy
                    break;
                }
            }

            if (ast != 0) {
                stack.push(ast);
            }
        }

        // stack → array
        int[] res = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }
        return res;
    }
}
