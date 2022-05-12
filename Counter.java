// Creating a Counter Class

public class Counter {
    
     private int startValue;  
     
    //  A constructor that sets the start value of the counter to "startValue".


     public Counter (int startValue){
         
       this.startValue = startValue;

     }

    //  A constructor that sets the start value of the counter to 0.

       public Counter () {

        this.startValue = 0;

     }

    //  a method called "value" that returns the current value of the counter as an int.

     public int value (){

        return startValue;

     }

    //  a method called 'increase' that increases the value by 1 and does not return anything.

     public void increase(){

       startValue++;
     }

    //  a method called 'decrease' that decreases the value by 1 and does not return anything.

   public void decrease (){

  
    startValue--;
}

// increases the value of the counter by the value of increaseBy. If the value of increaseBy is negative, the counter's value does not change.

public void increase(int increaseBy) {
  if (increaseBy < 0) {
      return;
  } else {
              startValue += increaseBy;
  }
}

// decreases the value of the counter by the value of decreaseBy. If the value of decreaseBy is negative, the counter's value does not change.

public void decrease(int decreaseBy) {
  if (decreaseBy < 0) {
      return;
  } else {
              startValue -= decreaseBy;
  }
}

@Override
public String toString() {
  return "Counter is currently set to: " + value();
}
}




