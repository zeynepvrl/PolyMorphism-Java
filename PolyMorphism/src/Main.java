class Hayvan{
    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    public String konus(){
        return "Hayvan konuşuyor.";
    }
}

class kedi extends Hayvan{
    public kedi(String isim){       //extends durumunda sadece constructer'ı doğrudan alamazsın superclasstan
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+" miyavlıyor";
    }
}

class Kopek extends Hayvan{
    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+" Havlıyor..";
    }
}

class At extends Hayvan{
    public At(String isim){
        super(isim);
    }

    @Override
    public String konus(){
        return getIsim()+" Kişniyoor";
    }
}

public class Main {

    public static void konustur(Hayvan hayvan){
        System.out.println(hayvan.konus());
    }


    public static void main(String[] args) {
        Hayvan hayvan1=new kedi("Mırmır");
        System.out.println(hayvan1.konus()); //konus methodunu kedi sınıfınnda override etmeseydik hayvan methodundakini çalıştırırdı

        //YA DA

        konustur(hayvan1);
        konustur(new kedi("Tekir"));
        konustur(new Kopek(("Karabaş")));
        konustur(new At("Batur"));

    }


}