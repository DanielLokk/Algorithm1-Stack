class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Max size of Stack

    Stack() {
        top = -1;
    }

    boolean isEmpty() {
        return (top < 0);
    }

    boolean push(int x) {
        if (top >= (MAX - 1)) {
            return false;
        } else {
            a[++top] = x;
            System.out.println(x + " pushed in stack");
            return true;
        }
    }

    /* int pop() {
        if (top < 0) {
            return 0;
        } else {
            int x = a[top--];
            return x;
        }
    } */

    int pop() {
        return isEmpty() ? 0 : a[top--];
    }
    
    
    
 }
 