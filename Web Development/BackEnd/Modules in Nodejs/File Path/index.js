// pathResolver.js

const path = require("path");

const getAbsolutePath = (relativePath) => {
  // Resolve the absolute path by joining the __dirname and the relative path
  const absolutePath = path.resolve(__dirname, '..', relativePath);
  return absolutePath;
};

module.exports = { getAbsolutePath };
