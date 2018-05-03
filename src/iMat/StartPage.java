package iMat;

import javafx.fxml.FXML;

import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import se.chalmers.cse.dat216.project.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StartPage {

    private Controller parentcontroller;
    Model model = Model.getInstance();
    private Map<String, ItemThumbnail> productListItemMap = new HashMap<String, ItemThumbnail>();

    @FXML
    private GridPane gridPane;
    @FXML
    private ImageView menuButton;
    @FXML
    private ImageView brandImageView;



    private void fillMap() {
        List<Product> productList = model.getProducts();

        for (int i = 0; i < productList.size(); i++){
            Product product = productList.get(i);

            ItemThumbnail itemThumbnail = new ItemThumbnail(product, parentcontroller);
            productListItemMap.put(product.getName(), itemThumbnail);

        }
    }

    public void updateProductList(){
        gridPane.getChildren().clear();
        List<Product> products = model.getProducts();

        for(int i = 0; i < products.size(); i++){
            // TODO fixa raden nedan
            // gridPane.getChildren().add(productListItemMap.get(products.get(i).getName()));
        }
    }

}
