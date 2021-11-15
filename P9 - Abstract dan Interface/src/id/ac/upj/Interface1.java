package id.ac.upj;

interface MakhlukHidup {
    public void bernapas();
    public void bernama(String nama);
}
interface Mamalia {
    public void habitat();

}
class Paus implements Mamalia , MakhlukHidup {
    @Override
    public void bernafas() {
        System.out.println("Bernafas dengan paru-paru");
    }

    @Override
    public void habitat(){
        System.out.println("Habitat di Laut");
    }
}
public class Interface1 {
    public static void main(String[] args) {
        Paus Paus = new Paus();
        Paus.bernama("Paus");
        Paus.bernafas();
        Paus.habitat();

    }
}
