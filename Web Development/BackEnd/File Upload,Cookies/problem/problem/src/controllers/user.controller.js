export default class UserController {
  getRegister = (req, res, next) => {
    res.render("user-register");
  };

  getLogin = (req, res, next) => {
    res.render("user-login");
  };

  addUser = (req, res) => {
    const { name, email, password } = req.body;
    const newUser = { id: users.length + 1, name, email, password };
    registerUser(newUser);
    res.redirect("/login");
  };

  loginUser = (req, res) => {
    const { email, password } = req.body;
    const isAuthenticated = authenticateUser({ email, password });
    if (isAuthenticated) {
      res.json({ success: "true", message: "login successful" });
    } else {
      res.json({ success: "false", message: "login failed" });
    }
  };
}
