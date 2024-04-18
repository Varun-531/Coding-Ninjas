// Please don't change the pre-written code
// Import the necessary modules here
import nodemailer from 'nodemailer';
import readline from 'readline';

const Solution = () => {
  // Write your code here
  async function sendMail(){
    const transporter = nodemailer.createTransport({
      service: 'gmail',
      auth:{
        user:'codingninjas2k16@gmail.com',
        pass:'slwvvlczduktvhdj'
      }
    })

  const mailOprtions = {
    from: 'codingninjas2k16@gmail.com',
    to:'nishant@codingninjas.com',
    subject:"Coding Ninjas",
    text:"The world has enough coders; be a coding ninja!"
  }

  try{
    const result = await transporter.sendMail(mailOprtions);
    console.log("Email send Successfully");
  }
  catch(err){
    console.log("Email send Failed");
  }
  }

  sendMail();
};

export default Solution;
