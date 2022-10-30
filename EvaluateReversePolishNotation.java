class Solution {
    public int evalRPN(String[] tokens) {
        Set<String> operations = Set.of("+", "-", "*", "/");
        Stack<Integer> myStack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (!operations.contains(tokens[i])) {
                myStack.push(Integer.parseInt(tokens[i]));
            } else {
                switch (tokens[i]) {
                    case "+":
                        myStack.push(myStack.pop() + myStack.pop());
                        break;
                    case "-":
                        myStack.push(-myStack.pop() + myStack.pop());
                        break;
                    case "*":
                        myStack.push(myStack.pop() * myStack.pop());
                        break;
                    case "/":
                        int temp = myStack.pop();
                        myStack.push(myStack.pop() / temp);
                        break;
                }
            }
        }
        return myStack.peek();
    }
}