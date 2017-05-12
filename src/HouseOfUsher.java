/*
* I looked upon the scene before me... upon the bleak walls - upon the vacant
* eye-like windows... with an utter desparation of the soul...
*								-Poe
*/

import acm.program.*;
import acm.graphics.*;

public class HouseOfUsher extends GraphicsProgram
{
	private GObject m_houseOfUsher;	
	
	public void run()
	{
		m_houseOfUsher = new GPoeHouse();
		add( m_houseOfUsher, getWidth()/2 - m_houseOfUsher.getWidth()/2,
					getHeight() - m_houseOfUsher.getHeight() );	
	}
}
