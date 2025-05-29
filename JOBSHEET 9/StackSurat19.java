public class StackSurat19 {
    Surat19[] stack;
    int top;
    int size;

    public StackSurat19(int size) {
        this.size = size;
        stack = new Surat19[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat19 s) {
        if (!isFull()) {
            stack[++top] = s;
        } else {
            System.out.println("Tumpukan surat penuh");
        }
    }

    public Surat19 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Tidak ada surat untuk diproses");
            return null;
        }
    }

    public Surat19 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Tumpukan kosong");
            return null;
        }
    }

    public boolean cariSurat(String nama) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                return true;
            }
        }
        return false;
    }
}
