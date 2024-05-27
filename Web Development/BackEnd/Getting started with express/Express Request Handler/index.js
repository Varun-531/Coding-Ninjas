const express = require("express");
const server = express();

// Handle GET request
server.get("/", (req, res) => {
  res.send("get");
});

// Handle POST request
server.post("/", (req, res) => {
  res.send("post");
});

// Handle PUT request
server.put("/", (req, res) => {
  res.send("put");
});

// Handle DELETE request
server.delete("/", (req, res) => {
  res.send("delete");
});

module.exports = server;
