package Uts;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Mac
        Mac mac = new Mac("MacBook Pro", 3, 16, "M1", "Lithium", "FileVault");
        System.out.println("Data Mac:");
        mac.tampilMac();
        
        // Membuat objek Windows
        Windows windows = new Windows("Asus", 4, 16, "Intel i5", "Li-ion", "Windows Hello");
        System.out.println("Data Windows:");
        windows.tampilWindows();
        
        // Membuat objek PC
        Pc pc = new Pc("Dell", 4, 32, "Intel i7", 27);
        System.out.println("Data PC:");
        pc.tampilPc();
        System.out.println("------------------------");
    }
}