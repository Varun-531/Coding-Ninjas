// Import the necessary module
import fs from "fs";

// Function to write a blog to a file
export const writeBlog = (filePath, content) => {
  try {
    // Append the content to the specified file synchronously
    fs.writeFileSync(filePath, content, { flag: "a" });
    console.log("Blog has been written to", filePath);
  } catch (err) {
    console.error("Error writing the blog:", err);
  }
};

// Function to publish the content of a blog file
export const publishBlog = (filePath) => {
  try {
    // Read the content of the file synchronously
    const content = fs.readFileSync(filePath, "utf8");
    return content;
  } catch (err) {
    console.error("Error publishing the blog:", err);
    return null;
  }
};
