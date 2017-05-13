import acm.graphics.*;

public class GPoeHouse extends GCompound
{
	public GPoeHouse( double houseBaseWidth, double houseBaseHeight, double hallRoofHeight,
				double leftTurretBaseWidth, double leftTurretBaseHeight, 
				double leftTurretRoofHeight,
				double rightTurretBaseWidth, double rightTurretBaseHeight, 
				double rightTurretRoofHeight,
				double doorBaseWidth, double doorBaseHeight, double doorRoofHeight,
				double leftWindowWidth, double leftWindowHeight,
				double rightWindowWidth, double rightWindowHeight, 
				double leftWindowDistanceFromWall, double leftWindowDistanceFromGround,
				double rightWindowDistanceFromWall, double rightWindowDistanceFromGround )
	{
		m_house = new GTower( houseBaseWidth, houseBaseHeight, hallRoofHeight);
		m_leftTurret = new GTower( leftTurretBaseWidth, leftTurretBaseHeight, leftTurretRoofHeight );
		m_rightTurret = new GTower( rightTurretBaseWidth, rightTurretBaseHeight, rightTurretRoofHeight );
		m_door = new GTower( doorBaseWidth, doorBaseHeight, doorRoofHeight );
		m_leftWindow = new GWindow( leftWindowWidth, leftWindowHeight, 1, 1 );
		m_rightWindow = new GWindow( rightWindowWidth, rightWindowHeight, 1, 1 );
	
		m_height = Math.max( Math.max( m_house.getHeight(), m_leftTurret.getHeight() ),
					m_rightTurret.getHeight() );

		m_width = Math.max( Math.max( m_house.getWidth(), m_leftTurret.getWidth() ),
					m_rightTurret.getWidth() );

		add( m_house, m_leftTurret.getWidth(), m_height-m_house.getHeight() );
		add( m_leftTurret, 0, m_height-m_leftTurret.getHeight() );
		add( m_rightTurret, m_leftTurret.getWidth() + m_house.getWidth(),
			m_height-m_rightTurret.getHeight() );
		add( m_door, m_leftTurret.getWidth()+m_house.getWidth()/2-m_door.getWidth()/2,
			m_height-m_door.getHeight() );
		add( m_leftWindow, m_house.getX()+leftWindowDistanceFromWall,
			m_height-leftWindowDistanceFromGround-m_leftWindow.getHeight() );
		add( m_rightWindow, m_rightTurret.getX()-m_rightWindow.getWidth()-rightWindowDistanceFromWall,
			m_height-rightWindowDistanceFromGround-m_rightWindow.getHeight() );
	}

	private GObject m_house;
	private GObject m_leftTurret;
	private GObject m_rightTurret;
	private GObject m_door;
	private GObject m_leftWindow;
	private GObject m_rightWindow;	
	private double m_height;
	private double m_width;
}
