package Uts;
class Laptop extends Komputer {
    protected String jnsBatrei;
    
    public Laptop() {
    }
    
    public Laptop(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.jnsBatrei = jnsBatrei;
    }
    
    public void tampilLaptop() {
        super.tampilData();
        System.out.println("Jenis Batrei: " + jnsBatrei);
    }
}