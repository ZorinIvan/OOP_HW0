package homework0;

/**
 * A simple object that has a volume.
 */
public class Ball {
	private double volume_;
    /**
     * @requires volume > 0
     * @modifies this
     * @effects Creates and initializes new Ball object with the specified
     *  		volume.
     */
    public Ball(double volume) {
		// TODO: Add your code here
    	if (volume > 0)
    	{
    		volume_ = volume;
    	}
    	else System.err.println("Volume must be a positive number.");
    }


	/**
	 * @requires volume > 0
	 * @modifies this
	 * @effects Sets the volume of the Ball.
	 */
	public void setVolume(double volume) {
		// TODO: Add your code here
    	if (volume > 0)
    	{
    		volume_ = volume;
    	}
    	else System.err.println("Volume must be a positive number.");
	}


    /**
     * @return the volume of the Ball.
     */
    public double getVolume() {
		// TODO: Add your code here
		return this.volume_;
    }
}