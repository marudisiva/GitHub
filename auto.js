'use strict' 
class Auto { 
   run(){
       
       console.log("speed is 120")
   }
  
} 
class Msuzuki extends Auto { 
  run(){
super.run()
console.log("suzuki speed is 70")

  } 

}
   class Suzuki800 extends Msuzuki { 
          run(){
               super.run()
}
   }
var o = new Suzuki800(); 
o.run(40)
