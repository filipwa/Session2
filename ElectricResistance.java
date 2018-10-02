public class ElectricResistance {

    public static void main(String[] args) {
        ElectricResistance er = new ElectricResistance(5,10);
        System.out.println(er.convertOhm(Prefix.M));
    }

    double voltAmpere;
    double ohm;

    private enum Prefix {
        k, m, M
    }

    ElectricResistance(double voltAmpere, double ohm){
        this.voltAmpere = voltAmpere;
        this.ohm = ohm;
    }

    double convertOhm(Prefix prefix){
        if(prefix == Prefix.k){
          return this.ohm * 1000;
        }else if(prefix == Prefix.m){
           return this.ohm / 1000;
        }else if(prefix == Prefix.M){
            return this.ohm * 1000000;
        }else{
            return this.ohm;
        }
    }

    void interchangeOhm(ElectricResistance e){
        double temp = e.ohm;
        e.ohm = this.ohm;
        this.ohm = temp;
    }

    public boolean equals(ElectricResistance e){
        if(e.ohm == this.ohm && e.voltAmpere == this.voltAmpere){
            return true;
        }else{
            return false;
        }
    }

}
