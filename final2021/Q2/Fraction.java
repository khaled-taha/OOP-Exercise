
package final2021.Q2;

public class Fraction {
    private int num;
    private int den;

    public Fraction(int num, int den) {
        this.setNum(num);
        this.setDen(den);
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        if(den != 0) this.den = den;
    }
    
    public Fraction addFraction(Fraction frc){
        if(frc == null) return null;
        int num = this.num * frc.den + this.den * frc.num;
        int den = this.den * frc.den;
        return new Fraction(num, den);
    }
    
    public Fraction DivFraction(Fraction frc){
        if(frc == null) return null;
        int num = this.num * frc.den;
        int den = this.den * frc.num;
        return new Fraction(num, den);
    }
    
    @Override
    public String toString() {
        if (den == 1) return num + "";
        else          return num + "/" + den;
    }
    
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 2);
        Fraction f3 = f1.addFraction(f2);
        Fraction f4 = f2.DivFraction(f2);
        
        System.out.println(f3);
        System.out.println(f4);
        
    }
    
}
