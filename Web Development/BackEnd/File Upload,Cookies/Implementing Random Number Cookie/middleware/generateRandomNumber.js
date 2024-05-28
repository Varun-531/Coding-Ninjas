// middleware/generateRandomNumber.js
// Import the necessary modules here

export const generateRandomNumber = (req, res, next) => {
  const randomNumber = Math.floor(Math.random() * 10) + 1;

  // Set the randomNumber as a cookie with a 1-day expiration.
  res.cookie("randomNumber", randomNumber, {
    maxAge: 24 * 60 * 60 * 1000, // 1 day
  });

  // Set attemptsLeft cookie
  res.cookie("attemptsLeft", 5, {
    maxAge: 24 * 60 * 60 * 1000, // 1 day
  });

  next();
};
