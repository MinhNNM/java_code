package oop_so_phuc;

import java.text.DecimalFormat;

public class So_phuc {
    private double a, b, c, d;
    DecimalFormat Format=new DecimalFormat("#.#");

    public So_phuc(){}

    public So_phuc(Double a, Double b, Double c, Double d){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
    }

    public String getC(){
        String x=Format.format((this.a+this.c)*this.a-(this.b+this.d)*this.b);
        String y=Format.format((this.a+this.c)*this.b+(this.b+this.d)*this.a);
        return x+" "+"+"+" "+y+"i";
    }

    public String getD(){
        Double x1=this.a+this.c, x2=this.b+this.d;
        String x=Format.format(x1*x1-x2*x2);
        String y=Format.format(2*x1*x2);
        return x+" "+"+"+" "+y+"i";
    }

    public String toString(){
        return getC()+", "+getD();
    }

}
