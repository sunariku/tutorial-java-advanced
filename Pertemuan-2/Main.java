public class Main {
  public static void main(String[] args) {
    Mahasiswa tono = new Mahasiswa();
    MahasiswaInternasional adi = new MahasiswaInternasional();

    tono.login();

    adi.login(); // Adi mengakses method login melalui class mahasiswa internasional (turunan)
    adi.cekNilaiHelp();
  }
}