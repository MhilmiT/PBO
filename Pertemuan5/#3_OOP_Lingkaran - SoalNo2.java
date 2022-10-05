package TugasOOP;

public class Lingkaran implements BangunDatar {

    private double phi = 3.1415;

    Lingkaran(){

    }

    @Override
    public  double luas (int sisi1, int sisi2){
        return 0;
    }

    public double luas(int r){
        return ( phi * r * r);
    }
}

