// src/controller/productController.js
import ProductModel from "../models/ProductModel.js";

const productModel = new ProductModel();

export default class productController {
  index = (req, res) => {
    res.render("index", { products: productModel.getAllProducts() });
  };

  search = (req, res) => {
    const { name } = req.body;
    const results = productModel.searchResult(name);
    res.render("searchResults", { results });
  };
}
