class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();

        for (int ast : asteroids) {

            boolean destroyed = false;

            while (!stack.isEmpty() && stack.peek() > 0 && ast < 0) {

                if (stack.peek() < -ast) {
                    // Stack asteroid is smaller
                    stack.pop();
                }
                else if (stack.peek() == -ast) {
                    // Both are destroyed
                    stack.pop();
                    destroyed = true;
                    break;
                }
                else {
                    // Current asteroid is destroyed
                    destroyed = true;
                    break;
                }
            }

            if (!destroyed) {
                stack.push(ast);
            }
        }

        int[] result = new int[stack.size()];

        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
}