public class engine {
    double power;
    int yearOfProduction;


    public engine(double power, int yearOfProduction){
        this.power = power;
        this.yearOfProduction = yearOfProduction;
    }

    public double getPower(){
        return this.power;
    }
    public int getYearOfProduction(){
        return this.yearOfProduction;
    }

    public boolean isEcological(){
        if(power>20000 && yearOfProduction>2000){
            return true;
        }else{
            return false;
        }
    }
}
