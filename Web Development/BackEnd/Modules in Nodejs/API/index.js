// Please do not change the prewritten code

const axios = require("axios");

const Solution = async () => {
  try {
    // Make an HTTP GET request to the API endpoint
    const response = await axios.get("https://api.codingninjas.com/api/v3/event_tags");

    // Retrieve the response data
    const responseData = response.data;

    // Print the response to the console
    console.log(responseData);
  } catch (error) {
    console.error("Error fetching data:", error.message);
  }
};

Solution();
module.exports = Solution;
