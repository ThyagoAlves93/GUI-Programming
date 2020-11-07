public static void main( String[] args )
{
	final Regression_142403_swing siv = new Regression_142403_swing( );

	JFrame jf = new JFrame( );
	jf.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
	jf.addComponentListener( siv );

	Container co = jf.getContentPane( );
	co.setLayout( new BorderLayout( ) );
	co.add( siv, BorderLayout.CENTER );

	Dimension dScreen = Toolkit.getDefaultToolkit( ).getScreenSize( );
	Dimension dApp = new Dimension( 600, 400 );
	jf.setSize( dApp );
	jf.setLocation(
			( dScreen.width - dApp.width ) / 2,
			( dScreen.height - dApp.height ) / 2 );

	jf.setTitle( siv.getClass( ).getName( ) + " [device=" //$NON-NLS-1$
			+ siv.idr.getClass( ).getName( ) + "]" );//$NON-NLS-1$

	ControlPanel cp = siv.new ControlPanel( siv );
	co.add( cp, BorderLayout.SOUTH );

	siv.idr.setProperty( IDeviceRenderer.UPDATE_NOTIFIER, siv );

	jf.addWindowListener( new WindowAdapter( ) {

		public void windowClosing( WindowEvent e )
		{
			siv.idr.dispose( );
		}

	} );

	jf.setVisible( true );
}