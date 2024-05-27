// src/controller/users.controller.js
import { userModel } from "../models/users.model";

export const userController = async (req, res) => {
  try {
    const users = await userModel();
    res.render("index", { users });
  } catch (error) {
    res.status(500).send("Error fetching user data");
  }
};
