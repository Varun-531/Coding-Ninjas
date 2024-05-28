// src/controllers/user.controller.js
import { registerUser, authenticateUser } from "../models/user.model.js";

export default class UserController {
  getRegister = (req, res, next) => {
    res.render("user-register");
  };

  getLogin = (req, res, next) => {
    res.render("user-login");
  };

  addUser = (req, res) => {
    const { name, email, password } = req.body;
    registerUser({ name, email, password });
    res.redirect("/login");
  };

  loginUser = (req, res) => {
    const { email, password } = req.body;
    const isAuth = authenticateUser({ email, password });
    if (isAuth) {
      res.json({ success: "true", message: "login successful" });
    } else {
      res.json({ success: "false", message: "login failed" });
    }
  };
}
