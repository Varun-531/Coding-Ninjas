import path from "path";

// Implement the getProducts controller
export const getProducts = (req, res) => {
  const filePath = path.resolve("src", "views", "index.html");
  res.sendFile(filePath);
};
