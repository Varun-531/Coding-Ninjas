// Import the necessary modules
const fs = require("fs");

const Solution = () => {
  // Write your code here
  // i) Create a file named "notes.txt" and write the phrase "The world has enough coders" to it
  fs.writeFileSync("notes.txt", "The world has enough coders");

  // ii) Retrieve the contents of notes.txt file and display them on the console
  const initialContent = fs.readFileSync("notes.txt", "utf-8");
  console.log("Initial content of notes.txt:", initialContent);

  // iii) Expand the existing content of "notes.txt" by appending the text "BE A CODING NINJA!"
  fs.appendFileSync("notes.txt", "\nBE A CODING NINJA!");

  // iv) Retrieve the updated contents of the "notes.txt" file and display them on the console
  const updatedContent = fs.readFileSync("notes.txt", "utf-8");
  console.log("Updated content of notes.txt:", updatedContent);
};

Solution();
module.exports = Solution;
