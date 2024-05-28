// src/models/user.model.js
// Please don't change the pre-written code
// Import the necessary modules here

export const users = [
  { id: 1, name: "vivek", email: "krvivi28@gmail.com", password: "vivek28@" },
];

export const registerUser = (user) => {
  user.id = users.length + 1;
  users.push(user);
};

export const authenticateUser = (reqUser) => {
  return users.some(
    (user) => user.email === reqUser.email && user.password === reqUser.password
  );
};
