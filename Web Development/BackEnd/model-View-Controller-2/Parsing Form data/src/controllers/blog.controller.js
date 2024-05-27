// Import necessary modules
import { blogs } from "../models/blog.model";

export const renderBlogForm = (req, res) => {
  res.render("addblogForm", { errors: null, success: false });
};

export const renderBlogs = (req, res) => {
  res.render("blogs", { blogs });
};

export const addBlog = (req, res) => {
  const { title, description, img } = req.body;
  const errors = [];

  // Validate form data
  if (!title || title.trim().length === 0) {
    errors.push("The title field should not be empty.");
  }
  if (title.length < 3) {
    errors.push("The title field should contain at least 3 characters.");
  }
  if (!description || description.trim().length === 0) {
    errors.push("The description field should not be empty.");
  }
  if (description.length < 10) {
    errors.push("The description field should contain at least 10 characters.");
  }
  const urlPattern = new RegExp(
    "^(https?:\\/\\/)?" + // protocol
      "((([a-zA-Z0-9$_.+!*'(),;&=:~-]|%[0-9a-fA-F]{2})+(:([a-zA-Z0-9$_.+!*'(),;&=:~-]|%[0-9a-fA-F]{2})+)?@)?([a-zA-Z0-9][a-zA-Z0-9-]*[a-zA-Z0-9]\\.)+[a-zA-Z]{2,6})" + // domain
      "(\\:\\d{2,5})?" + // port
      "(\\/([a-zA-Z0-9$_.+!*'(),;&=:-]|%[0-9a-fA-F]{2})*)*" + // path
      "(\\?([a-zA-Z0-9$_.+!*'(),;&=:-]|%[0-9a-fA-F]{2})*)?" + // query string
      "(\\#([a-zA-Z0-9$_.+!*'(),;&=:-]|%[0-9a-fA-F]{2})*)?$" // fragment locator
  );
  if (!img || !urlPattern.test(img)) {
    errors.push("The image URL provided should be a valid URL.");
  }

  if (errors.length > 0) {
    res.status(400).render("addblogForm", { errors, success: false });
  } else {
    blogs.push({ title, description, img });
    res.status(201).render("blogs", { blogs });
  }
};
