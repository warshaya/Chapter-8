import acm.graphics.*;

public class GWindow extends GCompound
{
	public GWindow( double width, double height, int rows, int columns )
	{
		for (int i=0; i<rows; i++)
		{
			for (int j=0; j<columns; j++)
			{
				add( new GRect( width, height ), i*width, j*height );
			}
		}
	}
}
