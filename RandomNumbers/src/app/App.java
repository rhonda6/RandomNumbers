/**
 * 
 */
package app;

import controllers.CassinoController;
import models.Cassino;
import views.CassinoView;

/**
 * @author Rafhael Honda da Silva
 * @author José Roberto Felix da Silva
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var cassino = new Cassino();
		var cassinoView = new CassinoView();
		
		var cassinoController = new CassinoController(cassino, cassinoView);
		cassinoController.initController();	

	}

}
