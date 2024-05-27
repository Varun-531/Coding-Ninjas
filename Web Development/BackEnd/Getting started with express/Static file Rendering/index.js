const express = require("express");
const server = express();

const renderStatic = () => {
  // Serve static files from the public directory
  server.use(express.static("public"));

  // Route for serving index.html
  server.get("/index.html", (req, res) => {
    res.sendFile(__dirname + "/public/index.html");
  });
};

server.get("/", (req, res) => {
  res.send("get method called!");
});

// Call renderStatic to set up static file serving
renderStatic();

module.exports = { renderStatic, server };
