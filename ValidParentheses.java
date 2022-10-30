class Solution {
    public boolean isValid(String s) {
        Stack<Character> myStack = new Stack<>();
        for (char i : s.toCharArray()) {
            if (i == ')' && !myStack.isEmpty() && myStack.peek() == '(') {
                myStack.pop();
            } else if (i == '}' && !myStack.isEmpty() && myStack.peek() == '{') {
                myStack.pop();
            } else if (i == ']' && !myStack.isEmpty() && myStack.peek() == '[') {
                myStack.pop();
            } else {
                myStack.push(i);
            }
        }
        return myStack.isEmpty();
    }
}