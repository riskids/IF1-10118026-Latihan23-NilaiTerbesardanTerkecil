/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118026.latihan23.nilaiterbesardanterkecil;
import java.util.Scanner;
/**
 *
 * 
* @author
 * NAMA			: Riski Dwi Sabariyanto
 * KELAS		: IF-1
 * NIM			: 10118026
 * Deskripsi Program	: menampilkan nilai dari terbesar ke terkecil
 */
public class IF110118026Latihan23NilaiTerbesardanTerkecil {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		System.out.println("[#]====== Program Nilai Terbesar dan Terkecil Nilai Mahasiswa ======[#]");
		System.out.print("Masukkan Nama Petugas : ");
		Scanner scanner = new Scanner(System.in);
		String namaPetugas = scanner.next();
		System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
                
		int banyakMHS = scanner.nextInt();
		int[] nilaiMHS = new int[banyakMHS];
                
		System.out.print("Masukkan Nilai Mahasiswa Ke-" + 1 + " = " );
		nilaiMHS[0] = scanner.nextInt();
                
		int nilaiTerbesar = nilaiMHS[0], nilaiTerkecil = nilaiMHS[0];
                
		for( int i = 1; i < banyakMHS; i++){
			System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i+1) + " = " );
			nilaiMHS[i] =  scanner.nextInt();
			if(nilaiMHS[i] > nilaiTerbesar)
				nilaiTerbesar = nilaiMHS[i];
			if(nilaiMHS[i] < nilaiTerkecil)
				nilaiTerkecil = nilaiMHS[i];
		}
                
		System.out.println("Nilai Terbesar adalah " + nilaiTerbesar);
		System.out.println("Nilai Terkecil adalah " + nilaiTerkecil);
	}
	
}
