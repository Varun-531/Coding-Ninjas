// src/controllers/product.controller.js
import ProductModel from "../models/product.model";

export default class ProductController {
  getProducts = (req, res) => {
    const productModel = new ProductModel();
    const products = productModel.fetchProducts();

    // Customizing response headers
    res.setHeader("Content-Type", "application/json");
    res.setHeader("X-Custom-Header", "product-data");

    res.status(200).json(products);
  };
}
