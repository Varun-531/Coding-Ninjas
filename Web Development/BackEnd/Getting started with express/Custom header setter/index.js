const express = require("express");
const server = express();

// Set custom header on response object
const setCustomHeader = (res, headerName, headerValue) => {
  // Set the custom header on the response object
  res.setHeader(headerName, headerValue);
  // Log a success message with the header name and value
  console.log(
    `${headerName} with value ${headerValue} has been set successfully!`
  );
};

// Route that uses the setCustomHeader function
server.get("/", (req, res) => {
  setCustomHeader(res, "Content-Type", "application/json");
  res.send(`get method called!`);
});

module.exports = { setCustomHeader, server };
