// src/controllers/user.controller.js
import { registerUser, authenticateUser } from "../models/user.model.js";

export default class UserController {
  getSecure = (req, res) => {
    res.render("secure-page");
  };

  getRegister = (req, res) => {
    res.render("user-register");
  };

  addUser = (req, res) => {
    const { name, email, password } = req.body;
    registerUser({ name, email, password });
    res.redirect("/user-login");
  };

  getLogin = (req, res) => {
    res.render("user-login");
  };

  loginUser = (req, res) => {
    const { email, password } = req.body;
    const isAuth = authenticateUser({ email, password });
    if (isAuth) {
      req.session.userEmail = email;
      res.redirect("/");
    } else {
      res.render("msgPage", { message: "Invalid Credentials!!" });
    }
  };

  userLogout = (req, res) => {
    req.session.destroy((err) => {
      if (err) {
        return res.redirect("/");
      }
      res.clearCookie("connect.sid");
      res.redirect("/user-login");
    });
  };
}
