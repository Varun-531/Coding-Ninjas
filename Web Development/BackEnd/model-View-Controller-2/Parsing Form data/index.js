// Import necessary modules
import express from "express";
import path from "path";
import expressEjsLayouts from "express-ejs-layouts";
import {
  renderBlogForm,
  renderBlogs,
  addBlog,
} from "./src/controllers/blog.controller.js";

const app = express();

app.set("view engine", "ejs");
app.set("views", path.resolve("src", "views"));
app.use(expressEjsLayouts);
app.use(express.urlencoded({ extended: true })); // Middleware to parse request body

// Route handler for rendering the blog form
app.get("/createblog", renderBlogForm);

// Route handler for displaying the list of blogs
app.get("/", renderBlogs);

// Route handler for adding a new blog
app.post("/addblog", addBlog);

export default app;
