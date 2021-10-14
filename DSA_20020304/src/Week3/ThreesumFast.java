import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.UF;
import edu.princeton.cs.algs4.*;
import edu.princeton.cs.algs4.In;


public class ThreesumFast {
    /**
     * Viết chương trình đọc từ standard input một chuỗi số nguyên
     * *và tìm tất cả các cặp số có tổng bằng 0 và in kết quả ra output chuẩn, mỗi cặp số trên 1 dòng.
     */
    public static void main(String[] args) {
        In in = new In("C:\\algs4-data\\4Kints.txt"); // tạo luồng đọc từ file C:\\Users\\ASUS\\Downloads\\algs4.jar
        int[] a = in.readAllInts();  // đọc toàn bộ file vào mảng a
        for (int i = 0; i < a.length; i++) {
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==0){
                System.out.println(a[i]+" "+a[j]);}
            }
        }
    }
}