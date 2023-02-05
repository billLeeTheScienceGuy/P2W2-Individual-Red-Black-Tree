
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class FlightPathFrontend extends Application implements IFlightPathFrontend {
	Scanner scanner;
	IFlightPathBackend backend;
	String input;
	ICity origin;
	ICity destination;
	int state = 0;
	//static Stage stage;

	/**
	 * Constructor
	 * 
	 * @param backend contains list of items and necessary methods
	 */
	public FlightPathFrontend(IFlightPathBackend backend) {
		scanner = new Scanner(System.in);
		this.backend = backend;
	}

//	/**
//	 * setup initial screen (state 0) using html.
//	 */
//	@Override
//	public void start() {
//		backgroundImage();
//	}

	private static void backgroundImage(Stage stage) {
		// Creating an image
		InputStream bg;
		GridPane gp = new GridPane();
		try {
			try {

		try {
			Group root = new Group();

			// Creating a scene object
			Scene scene = new Scene(root);
					bg = new URL("https://pages.cs.wisc.edu/~billl/background2.jpg").openStream();

					Image imageBackground = new Image(bg);
					// Setting the image view
					ImageView IVBackground = new ImageView(imageBackground);

					// Setting the position of the image

					// setting the fit height and width of the image view
					IVBackground.setFitHeight(670);
					IVBackground.setFitWidth(715);
					IVBackground.setX(0);
					IVBackground.setY(0);
					// Setting the preserve ratio of the image view
					IVBackground.setPreserveRatio(true);

					InputStream is;
					is = new URL("https://pages.cs.wisc.edu/~billl/State0.jpg").openStream();

					Image imageState0 = new Image(is);
					// Setting the image view
					ImageView IVState0 = new ImageView(imageState0);

					// Setting the position of the image

					// setting the fit height and width of the image view
					IVState0.setFitHeight(627);
					IVState0.setFitWidth(87);
					IVState0.setX(43);
					IVState0.setY(314);
					// Setting the preserve ratio of the image view
					IVState0.setPreserveRatio(true);

					// Creating a Group object
//					Group root = new Group();
//
//					// Creating a scene object
//					Scene scene = new Scene(root);
					
					HBox box = new HBox();
					
					box.getChildren().add(IVState0);

			// Adding scene to the stage
			stage.setScene(scene);

			// Displaying the contents of the stage
			stage.show();
//				} catch (FileNotFoundException e) {
//					e.printStackTrace();
//				}
//			} catch (MalformedURLException e) {
//				e.printStackTrace();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		// Loading image from URL
		// Image image = new Image(new FileInputStream("url for the image));

	}

//	/**
//	 * converts x and y coordinates from backend code to a representable GUI form.
//	 */
//	private int xConvert(ICity cities) {
//		return 0;
//	}
//
//	private int yConvert(ICity cities) {
//		return 0;
//	}
//
//	public void createButtons(List<ICity> cities[]) {
//		// set up the stage
//		BorderPane borderPane = new BorderPane();
//		Stage stage = new Stage();
//		Scene scene = new Scene(borderPane, 863, 707);
//
//		// set up the exit button on the right bottom of the screen.
//		Button exitButton = new Button("Exit");
//		exitButton.setOnAction(event -> {
//			Platform.exit();
//		});
//		borderPane.setBottom(exitButton);
//		BorderPane.setAlignment(exitButton, Pos.BOTTOM_RIGHT);
//
//		Pane pane = new Pane();
//		borderPane.setCenter(pane);
//		BorderPane.setAlignment(pane, Pos.CENTER);
//
//		// create the city buttons
//		Button but[] = new Button[20];
//		for (int i = 0; i < 19; i++) {
//
//			Button cityBut = new Button();
//			cityBut.setLayoutX(xConvert(backend.getCities.get(i)));
//			cityBut.setLayoutY(yConvert(backend.getCities.get(i)));
//			cityBut.setText(backend.getCities.get(i).getName());
//			but[i] = cityBut;
//			cityBut.setOnAction(e -> {
//				if (cityBut.getText().equals(cityBut.getText())) {
//					if (this.stage == 0) {
//						this.origin = (ICity) cities[i];
//						createBucky(origin);
//						this.stage = 1;
//					}
//					if (this.stage == 1) {
//						this.destination = (ICity) cities[i];
//						createPathOptions(this.origin, this.destination);
//					}
//				}
//			});
//			but[i] = cityBut;
//		}
//		pane.getChildren().addAll(but);
//		stage.setScene(scene);
//		stage.show();
//	}
//
//	/**
//	 * Graphical representation of Bucky appears when the user selects the initial
//	 * city. (State 1).
//	 * 
//	 * @param origin
//	 */
//	public void createBucky(ICity origin) {
//		BufferedImage image = null;
//		try {
//			URL url = new URL("https://pages.cs.wisc.edu/~billl/becky3.jpg");
//			image = ImageIO.read(url);
//
//			JFrame frame = new JFrame();
//			frame.setSize(45, 100);
//			frame.setLocation(xConvert(origin), yConvert(origin));
//			JLabel label = new JLabel(new ImageIcon(image));
//			frame.add(label);
//			frame.setVisible(true);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//	/**
//	 * creates the path selection buttons. (State 2).
//	 */
//	public void createPathOptions(ICity origin, ICity destination) {
//		backend.setOrigin(origin);
//		backend.setDestination(destination);
//		highlightPaths(backend.getPaths());
//		pathOpBut();
//	}
//
//	private void highlightPaths(List<ICity> cities[]) {
//
//	}
//
//	private void pathOpBut() {
//
//	}
//
//	public void createPaths(ICity origin, ICity destination) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void moveBucky() {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void changeString() {
//		// TODO Auto-generated method stub
//
//	}

	public static void main(String[] args) {
		Application.launch();
	}

	@Override
	public void createButtons(List<ICity> cities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void createBucky(ICity origin) {
		// TODO Auto-generated method stub

	}

	@Override
	public void createPathOptions(ICity origin, ICity destination) {
		// TODO Auto-generated method stub

	}

	@Override
	public void createPaths(List<ICity> cities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void moveBucky() {
		// TODO Auto-generated method stub

	}

	@Override
	public void changeString() {
		// TODO Auto-generated method stub

	}

	/**
	 * setup initial screen (state 0) using html.
	 */

	@Override
	public void start(final Stage stage) {
		// TODO Auto-generated method stub
		// backgroundImage(arg0);
		InputStream bg;
		GridPane gp = new GridPane();
//	try {
//		try {

		// try {
		stage.setTitle("CS400: The Key");
		Group root = new Group();

		// Creating a scene object
		Scene scene = new Scene(root);
//				bg = new URL("https://pages.cs.wisc.edu/~billl/background2.jpg").openStream();
//
//				Image imageBackground = new Image(bg);
//				// Setting the image view
//				ImageView IVBackground = new ImageView(imageBackground);
//
//				// Setting the position of the image
//
//				// setting the fit height and width of the image view
//				IVBackground.setFitHeight(670);
//				IVBackground.setFitWidth(715);
//				IVBackground.setX(0);
//				IVBackground.setY(0);
//				// Setting the preserve ratio of the image view
//				IVBackground.setPreserveRatio(true);
//
//				InputStream is;
//				is = new URL("https://pages.cs.wisc.edu/~billl/State0.jpg").openStream();
//
//				Image imageState0 = new Image(is);
//				// Setting the image view
//				ImageView IVState0 = new ImageView(imageState0);
//
//				// Setting the position of the image
//
//				// setting the fit height and width of the image view
//				IVState0.setFitHeight(627);
//				IVState0.setFitWidth(87);
//				IVState0.setX(43);
//				IVState0.setY(314);
//				// Setting the preserve ratio of the image view
//				IVState0.setPreserveRatio(true);
//
//				// Creating a Group object
////				Group root = new Group();
////
////				// Creating a scene object
////				Scene scene = new Scene(root);
//				
//				HBox box = new HBox();
//				
//				box.getChildren().add(IVState0);

		// Adding scene to the stage
		stage.setScene(scene);

		// Displaying the contents of the stage
		stage.show();
//			} catch (FileNotFoundException e) {
//				e.printStackTrace();
//			}
//		} catch (MalformedURLException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		} catch (NullPointerException e) {
//			e.printStackTrace();
//		}
		// Loading image from URL
		// Image image = new Image(new FileInputStream("url for the image));

	}

}
