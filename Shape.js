class Shape
{
    con(a)
    {
        this.area=a;
    }
}
    class Circle extends Shape
    {
        display(radius){
        this.area=3.14*radius*radius;
        console.log(this.area)
    }
}
    class Rectangle extends Shape
    {
        display(length,width){
        this.area=length*width;
        console.log(this.area)
        }
    }
    var a=new Circle();
    var b=new Rectangle();
   a.display(3);
   b.display(4,5);
