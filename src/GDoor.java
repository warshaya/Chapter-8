import acm.graphics.*;

public class GDoor extends GCompound
{
	private static final double INSET_OF_DOORKNOB = 1.3;	

	private GRect m_door;
	private GOval m_knob;

	public GDoor( double width, double height, double knobSize )
	{
		m_door = new GRect( width, height );
		add( m_door, 0, 0);
		
		m_knob = new GOval( knobSize, knobSize );
		add( m_knob, m_door.getWidth() - INSET_OF_DOORKNOB*m_knob.getWidth(),
				m_door.getHeight()/2 - m_knob.getHeight()/2 );
	}
}
