// index.js
import express from "express";
import session from "express-session"; // Import express-session
import cookieParser from "cookie-parser";
import {
  handleGame,
  handleLogin,
  handlePost,
  handleSignUp,
  renderLogin,
  renderSignUp,
} from "./user.controller.js";
import { generateRandomNumber } from "./middleware/generateRandomNumber.js";
import { auth } from "./middleware/auth.js"; // Assuming you have an auth middleware

const app = express();

// Implement the necessary Express Session here
app.use(
  session({
    secret: "your-secret-key", // Replace with your own secret key
    resave: false,
    saveUninitialized: true,
    cookie: { secure: false }, // Set secure to true if you're using HTTPS
  })
);

app.use(express.urlencoded({ extended: true }));
app.use(cookieParser());
app.use(express.urlencoded({ extended: false }));
app.set("view engine", "ejs");
app.set("views", "./views");

app.get("/", auth, generateRandomNumber, handleGame);
app.post("/guess", handlePost);

app.get("/login", renderLogin);
app.get("/signup", renderSignUp);

app.post("/login", handleLogin);
app.post("/signup", handleSignUp);

export default app;
