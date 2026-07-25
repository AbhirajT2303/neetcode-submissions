class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> min;

    public MinStack() {
        stack = new Stack<>();
        min = new Stack<>();    
    }
    
    public void push(int value) {
        stack.push(value);
        if(min.isEmpty()){
            min.push(value);
        }else{
            min.push(Math.min(min.peek(),value));
        }
    }
    
    public void pop() {
        stack.pop();
        min.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
