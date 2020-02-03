package ru.mikhail.app;

import java.util.ArrayList;

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 *
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 *
 *
 * Example:
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> Returns -3.
 * minStack.pop();
 * minStack.top();      --> Returns 0.
 * minStack.getMin();   --> Returns -2.
 */

public class Min_Stack_155 {

    ArrayList stack = new ArrayList();
    public Min_Stack_155(){

    }

    public void push(int x) {
        stack.add(x);
    }

    public void pop() {
        stack.remove(stack.size()-1);
    }

    public int top() {
        return (int) stack.get(stack.size()-1);
    }

    public int getMin() {
        int min = (int) stack.get(0);
        for (int i = 1; i < stack.size(); i++){
            if (min > (int) stack.get(i)){
                min = (int) stack.get(i);
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Min_Stack_155 object = new Min_Stack_155();
        object.push(-2);
        object.push(0);
        object.push(-3);
        System.out.println(object.getMin());
        object.pop();
        System.out.println(object.top());
        System.out.println(object.getMin());
    }
}
