public class AppleBox {
    private Apple[][] apples;

    public AppleBox(Apple[][] apples) {
        this.apples = apples;
    }

    /**
     * Returns the number of pies that can be made from the 2D array apples
     * if each pie requires poundsPerPie pounds of apples. If an apple is
     * rotten, it cannot be used in a pie, nor can any adjacent apple.
     * Preconditions: apples has at least two rows and at least two columns.
     *                No elements in apples are null.
     */
    public int numberOfPies(double poundsPerPie) 
    {
        /* to be implemented */
        double weight = 0;
        for(int row = 0; row < apples.length; row++){
            for(int col = 0; col < apples[0].length; col++){
                boolean canUse = true;
                if(apples[row][col].isRotten()){
                    canUse = false;
                }
                else if(row - 1 >= 0 && apples[row - 1][col].isRotten()){
                    canUse = false;
                }
                else if(row + 1 < apples.length && apples[row + 1][col].isRotten()){
                    canUse = false;
                }
                else if(col - 1 >= 0 && apples[row][col - 1].isRotten()){
                    canUse = false;
                }
                else if(col + 1 < apples[0].length && apples[row][col + 1].isRotten()){
                    canUse = false;
                }

                if(canUse){
                    weight += apples[row][col].getWeight();
                }               
            }            
        }
        return (int)(weight / poundsPerPie);
    }

    /*
     * There may be instance variables, constructors,
     * and methods that are not shown.
     */
}