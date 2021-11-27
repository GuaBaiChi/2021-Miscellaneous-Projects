import java.util.Random;

/*
 * Class implementation of the Number Guessing Game
 */
public class NumberGame {
    
    /*
     * Member Variables 
     */
    private int targetNumber;
    private int guesses;
    private Random rng;  
    
    /*
     * NumberGame constructor
     */
    public NumberGame() {
        this.rng = new Random();
        this.Reset();
    }
    
    /*
     * Reset random number and guess count
     */
    public void Reset() {
        this.targetNumber = this.rng.nextInt(100) + 1;
        this.guesses = 0;
    }
    
    /*
     * Description:
     *   Allow user to guess what the random number is
     * 
     * Returns:
     *   -1  if the number is lower than the guess
     *   1      if the number is higher than the guess
     *   0      if the number equals the guess
     */
    public int Guess(int guess) {
        int result = 0;
        this.guesses++;
        
        if (guess < this.targetNumber) {
            result = 1;
        }
        else if (guess > this.targetNumber) {
            result = -1;
        }
        else {
            System.out.println("Correct");
            System.out.println("Total Guesses: " + this.guesses);
            this.Reset();
        }
        
        return result;
    }
}
