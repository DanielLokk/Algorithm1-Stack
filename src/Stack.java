class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Max size of Stack

    Stack() {
        top = -1;
    }

    public boolean isEmpty() {
        return (top < 0);
    }

    public boolean push(int x) {
        if (top >= (MAX - 1)) {
            return false;
        } else {
            a[++top] = x;
            System.out.println(x + " pushed in stack");
            return true;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Underflow program terminated");
            System.exit(1);
        }

        System.out.println("Removing " + peek());

        return a[top--];
    }
    
    int peek() {
        return a[++top];
    }
}