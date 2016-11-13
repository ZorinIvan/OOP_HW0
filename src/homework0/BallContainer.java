package homework0;

import java.util.ArrayList;

/**
 * A container that can be used to contain Balls. A given Ball may only
 * appear in a BallContainer once.
 */
public class BallContainer {

	private ArrayList<Ball> ballList_ ;
    /**
     * @effects Creates a new BallContainer.
     */
    public BallContainer() {
		ballList_ = new ArrayList<>();
		
    }


    /**
     * @modifies this
     * @effects Adds ball to the container.
     * @return true if ball was successfully added to the container,
     * 		   i.e. ball is not already in the container; false otherwise.
     */
    public boolean add(Ball ball) {
		if(this.contains(ball))
		{
			return false;
		}
		if(ballList_.add(ball))
		{
			return true;
		}
		return false;
		
    }


    /**
     * @modifies this
     * @effects Removes ball from the container.
     * @return true if ball was successfully removed from the container,
     * 		   i.e. ball is actually in the container; false otherwise.
     */
    public boolean remove(Ball ball) {
		if(this.contains(ball))
		{
			if(ballList_.remove(ball))
			{
				return true;
			}
			return false;
		}
		else 
		{
			return false;
		}
		
    }


    /**
     * @return the volume of the contents of the container, i.e. the
     * 		   total volume of all Balls in the container.
     */
    public double getVolume() {
		double sum=0;
		for(int i=0; i<ballList_.size(); i++)
		{
			sum+=ballList_.get(i).getVolume();
		}
		return sum;
    }


    /**
     * @return the number of Balls in the container.
     */
    public int size() {
    	return ballList_.size();
    }


    /**
     * @modifies this
     * @effects Empties the container, i.e. removes all its contents.
     */
    public void clear() {
		ballList_.clear();
		
    }


    /**
     * @return true if this container contains ball; false, otherwise.
     */
    public boolean contains(Ball ball) {
		for(int i=0; i<ballList_.size(); i++)
		{
			if(ballList_.get(i).getVolume()==ball.getVolume())
			{
				return true;
			}
		}
		return false;
    }

}
