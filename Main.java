

				import java.awt.event.*;
				import java.awt.*;
				import javax.swing.*;
				
				
				public class Main extends Component implements ActionListener {
					
					JTextField animationTextFied;
					
					JButton startButton;
					JButton pauseButton;
					JButton stopButton;
					
					JPanel superPanel;
					
					JPanel controlPane;
					JFrame window;
					
					
					int yLocation;
					Timer t;
					
					@Override
					public void paint(Graphics gg){
						
											super.paint(gg);
					
		
								Graphics2D g = (Graphics2D) gg;
										
										   g.fillRect( 0,0,1300,1000 );
										   //this.setBackground( Color.BLACK );
										   
										   g.setColor( Color.WHITE );
										   g.setFont( new Font("Lucida console",Font.PLAIN,40) );										   
										   g.drawString( animationTextFied.getText() , 30, yLocation );
					
						
						
					}
					
					
					public Main(){
						
				// Initialization
				
				
						animationTextFied = new JTextField(20);
				
						startButton = new JButton("Start");
							startButton.addActionListener(this);
							
						pauseButton = new JButton("Pause");
							pauseButton.addActionListener(this);
						
						stopButton  = new JButton("Stop");
							stopButton.addActionListener(this);
						
						controlPane = new JPanel( new FlowLayout() );
						superPanel = new JPanel( new BorderLayout() );
						window = new JFrame("Moview Ending");
				
				
				// 		Adding components
						controlPane.add( startButton );
						controlPane.add( pauseButton );
						controlPane.add( stopButton  );
						
						superPanel.add( animationTextFied,BorderLayout.NORTH );
						superPanel.add(this,BorderLayout.CENTER);
						superPanel.add( controlPane,BorderLayout.SOUTH );
						
						window.add(superPanel);
						
						
						window.setSize(500,500);
						window.setLocation( 200,200 );
						window.setVisible( true );
						
						
						window.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
						
							  t = new Timer(33,this);
							  t.start();
						
						
					}
					
					
					public static void main(String[] args){
						
						Main m = new Main();
						
					}
			

					@Override
					public void actionPerformed(ActionEvent event ){
						
					
								yLocation--;
								
								if(yLocation<=0){
									
									yLocation = 800;
									
								}
								
								paint( getGraphics() );
								

						}
			
				}		
