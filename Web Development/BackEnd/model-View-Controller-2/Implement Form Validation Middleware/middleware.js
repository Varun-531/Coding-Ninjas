// Please don't change the pre-written code
// Import the necessary modules here

export const formValidationMiddleware = (req, res, next) => {
  const { name, mobile } = req.body;
  const errors = {};

  if (name == null || name.length < 5) {
    errors.name = "Enter a valid name of length greater than 4";
  }

  if (mobile == null || mobile.length < 10) {
    errors.mobile = "Enter a valid mobile number of 10 digits";
  }

  if (Object.keys(errors).length > 0) {
    return res.status(401).json(errors);
  }

  next();
};
