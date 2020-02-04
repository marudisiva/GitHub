class Car
{
    run()
    {
console.log("this is car")
    }
}
class Maruti extends Car
{
    run()
    {
        super.run()
        console.log("this is maruti")
    }
}
class MarutiSuz extends Maruti
{
    run()
    {
        super.run()
        console.log("this is marutisuz")
    }
}
var m=new MarutiSuz();
m.run();
