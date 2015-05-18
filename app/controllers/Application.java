package controllers;

import models.Product;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {

        Product myProduct = new Product();
        myProduct.price = -20;

        return ok(index.render("Price: " + myProduct.price));
    }

}
