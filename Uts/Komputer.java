package Uts;
class Komputer {
    protected String merk;
    protected int kecProsesor;
    protected int sizeMemory;
    protected String jnsProsesor;
    
    public Komputer() {
    }
    
    public Komputer(String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        this.merk = merk;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
        this.jnsProsesor = jnsProsesor;
    }
    
    public void tampilData() {
        System.out.println("Merk: " + merk);
        System.out.println("Kecepatan Prosesor: " + kecProsesor + " GHz");
        System.out.println("Size Memory: " + sizeMemory + " GB");
        System.out.println("Jenis Prosesor: " + jnsProsesor);
    }
}