import java.text.DecimalFormat;
public class Rectangle { //make public for CS A

    //instance variables
    private double width;
    private double height;
    private double area;
    private double permiter;
    //default constructor (make public for CS A)

    public Rectangle() {
        width = 1.0;
        height = 1.0;
    }

    //overloaded constructor (with parameters)
    public Rectangle(double w, double h) {


    width =1.0;
    height=1.0;
    if(w>0){
        width=
    }
}
    public Rectangle(double width){
        this.width = width;//allows for this instance of the object to change
    }
    //accessors
    public double getPermiter(){
        return permiter;
    }
    /**
     * @de
     * @param nw
     */


    //mutators
    public void setWidth(double nw){
        width = nw;
    }

    /**
     * modifies the height of the rectangle
     * @param nh
     */
    public void setHeight(double nh){
        height = nh;
    }

    //other methods

    /**
     * calculatates the area of the rectangle
     * @return area of the rectangle
     */
    public void calcArea(){
        return height*width;
    }
    public void calcPerm(){
        return (width*2)+(height*2);
    }


    //toString method

}