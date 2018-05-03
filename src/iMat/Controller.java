package iMat;

import javafx.fxml.Initializable;
import se.chalmers.cse.dat216.project.CartEvent;
import se.chalmers.cse.dat216.project.Product;
import se.chalmers.cse.dat216.project.ShoppingCartListener;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable, ShoppingCartListener {

    private Model model = Model.getInstance();
    StartPage startPage;

    // Account pane actions
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        startPage.fillMap();
    }

    // Shope pane methods
    @Override
    public void shoppingCartChanged(CartEvent evt) {
        // TODO
    }

    private void updateProducts(){
        startPage.updateProductList();
    }



}
