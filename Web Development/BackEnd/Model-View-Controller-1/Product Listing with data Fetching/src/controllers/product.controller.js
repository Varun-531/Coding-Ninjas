// Import the necessary modules here
import ProductModel from "../models/product.model.js";

export default class ProductController {
  getProducts = (req, res) => {
    const productModel = new ProductModel();
    const products = productModel.fetchProducts();
    res.render("product", { products }); // Render the product.ejs template with the products data
  };
}
