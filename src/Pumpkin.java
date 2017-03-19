import acm.graphics.*;

public class Pumpkin extends GCompound
{	
	private Nose m_nose;
	private Stem m_stem;
	private Eyes m_eyes;
	private Mouth m_mouth;
	private Body m_body;
	
	public Pumpkin()
	{

	}

	add(m_body);
	add(m_stem);
	add(m_eyes);
	add(m_mouth);
	add(m_nose);
	
}
