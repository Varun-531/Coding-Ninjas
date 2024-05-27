// Import the necessary modules here
import { products } from "../assets/products.js";

export default class ProductModel {
  fetchProducts = () => {
    return products; // Return the products array imported from the products.js file
  };
}
