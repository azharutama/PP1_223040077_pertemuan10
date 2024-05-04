public class strukturStack {

  //latihan 2

  private int[] array; // Array untuk menyimpan elemen-elemen dalam stack.
  private int capacity; // Kapasitas maksimum stack.
  private int TOP; // Indeks untuk menunjukkan posisi atas stack.
  private int temp; // Variabel sementara untuk menyimpan data yang di-pop.
  public final int MIN = -1; // Konstanta untuk menandai bahwa stack kosong.

  // Constructor untuk inisialisasi stack dengan kapasitas tertentu.
  public strukturStack(int capacity) {
    array = new int[capacity];
    this.capacity = capacity;
    TOP = MIN; // Set TOP ke nilai minimum untuk menandakan stack kosong.
  }


  //latihan 1

  // Function untuk menambahkan elemen ke dalam stack (push).
  public void push(int data) {
    if (isFull()) {
      System.out.println("Stack full");
    } else {
      TOP++;
      array[TOP] = data;
    }
  }



  

  
//Latihan 3
  // Function untuk memeriksa apakah stack kosong.
  public boolean isEmpty() {
    return (TOP == MIN);
  }

  //Tugas

    // Function untuk menghapus dan mengembalikan elemen teratas dari stack (pop).
    public int pop() {
      if (isEmpty()) {
        System.out.println("Stack kosong");
      } else {
        temp = array[TOP];
        TOP = TOP - 1;
      }
      return temp;
    }

  // Function untuk memeriksa apakah stack penuh.
  public boolean isFull() {
    return (TOP == capacity - 1);
  }

  // Function untuk mengembalikan jumlah elemen dalam stack.
  public int size() {
    return TOP + 1;
  }

  // Function untuk menampilkan elemen-elemen dalam stack dari atas ke bawah.
  public void displayElement() {
    if (isEmpty()) {
      System.out.println("Stack kosong");
    } else {
      for (int i = TOP; i >= 0; i--) {
        System.out.print(array[i] + " ");
      }
      System.out.println();
    }
  }

  // Function untuk mengembalikan elemen teratas dari stack tanpa menghapusnya.
  public int Top() {
    if (isEmpty()) {
      return -1; // Mengembalikan nilai -1 jika stack kosong.
    } else {
      return array[TOP];
    }
  }
}
