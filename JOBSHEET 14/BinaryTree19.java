public class BinaryTree19 {
    Node19 root;

    public BinaryTree19() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }
    public void addRekursif(Mahasiswa19 data) {
        root = addRekursif(root, data);
    }

    private Node19 addRekursif(Node19 current, Mahasiswa19 data) {
        if (current == null) {
            return new Node19(data);
        }
        if (data.ipk < current.mahasiswa.ipk) {
            current.left = addRekursif(current.left, data);
        } else {
            current.right = addRekursif(current.right, data);
        }
        return current;
    }

    public void add(Mahasiswa19 mahasiswa) {
        Node19 newNode = new Node19(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node19 current = root;
            Node19 parent = null;
            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public boolean find(double ipk) {
        boolean result = false;
        Node19 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    public void traversePreOrder(Node19 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traverseInOrder(Node19 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    public void traversePostOrder(Node19 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    public Node19 getSuccessor(Node19 del) {
        Node19 successor = del.right;
        Node19 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    public void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        Node19 parent = root;
        Node19 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else  {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            // Tidak punya anak
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                    parent.left = null;
                    } else {
                    parent.right = null;
                    }
                } 
                    
                
            // Hanya punya anak kanan
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                     if (isLeftChild) {
                    parent.left = current.right;
                } else {
                    parent.right = current.right;
                }
            }
            }else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                    parent.left = current.left;
                } else {
                    parent.right = current.left;
                }
            }
            }
            // Punya 2 anak
            else {
                Node19 successor = getSuccessor(current);
                System.out.println("jika 2 anak, current = ");
                successor.mahasiswa.tampilInformasi();
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                    parent.left = successor;
                } else {
                    parent.right = successor;
                }
            }
                successor.left = current.left;
            }
        }
    }

    // Di dalam class BinaryTree19
public void cariMinIPK() {
    if (root == null) {
        System.out.println("Tree kosong.");
        return;
    }
    Node19 current = root;
    while (current.left != null) {
        current = current.left;
    }
    System.out.print("Data Mahasiswa dengan IPK terkecil: ");
    current.mahasiswa.tampilInformasi();
}

public void cariMaxIPK() {
    if (root == null) {
        System.out.println("Tree kosong.");
        return;
    }
    Node19 current = root;
    while (current.right != null) {
        current = current.right;
    }
    System.out.print("Data Mahasiswa dengan IPK terbesar: ");
    current.mahasiswa.tampilInformasi();
}
public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
    tampilMahasiswaIPKdiAtas(root, ipkBatas);
}

private void tampilMahasiswaIPKdiAtas(Node19 node, double ipkBatas) {
    if (node != null) {
        tampilMahasiswaIPKdiAtas(node.left, ipkBatas);
        if (node.mahasiswa.ipk > ipkBatas) {
            node.mahasiswa.tampilInformasi();
        }
        tampilMahasiswaIPKdiAtas(node.right, ipkBatas);
    }
}

}
