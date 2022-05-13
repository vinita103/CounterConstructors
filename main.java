public class main {

    public static void main(String[] args) {

        Counter counter = new Counter(1);
      
        counter.value();
        counter.increase();
      
        System.out.println(counter);

        counter.decrease();

        System.out.println(counter);
        
    }
    
}
