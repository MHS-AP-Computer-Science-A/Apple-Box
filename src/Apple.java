public class Apple
{
    private double weight;
    private boolean rotten;

   public Apple(double weight, boolean rotten) {
        this.weight = weight;
        this.rotten = rotten;
    }

   /** 
    *  Returns the weight of the apple, in pounds
    */
   public double getWeight()
   { return weight; }

   /** 
    *  Returns true if the apple is rotten and returns false otherwise
    */
   public boolean isRotten()
   { return rotten; }


}