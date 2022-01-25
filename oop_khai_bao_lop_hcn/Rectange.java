package oop_khai_bao_lop_hcn;

public class Rectange {
    private double width;
    private double height;
    private String color;

    public Rectange(){
        width=1;
        height=1;
    }

    public Rectange(double width, double height, String color){
        this.width=width;
        this.height=height;
        this.color=color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        this.color=this.color.toLowerCase();
        String x=String.valueOf(this.color.charAt(0)).toUpperCase() + color.substring(1);
        return x;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double findArea(){
        return getWidth()*getHeight();
    }

    public double findPerimeter(){
        return (getWidth()+getHeight())*2;
    }

    public void show(){
        System.out.println((int)findPerimeter() + " " + (int)findArea() + " " + getColor());
    }
}
