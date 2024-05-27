// src/models/product.models.js
import { products } from "../assets/products";

export default class ProductModel {
  fetchProducts = () => {
    // Return the products array
    return products;
  };
}
