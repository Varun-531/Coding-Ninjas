// Please do not change the prewritten code

import http from "http";
import fs from "fs";

const server = http.createServer((req, res) => {
  //  Write your code here
  if(req.method == 'POST'){
    let body = '';
    req.on('data', (chunk)=>{
      body += chunk;
    })
    
    req.on('end', ()=>{
      const path = 'data.txt';
      fs.appendFileSync(path, body);
      const data = fs.readFileSync(path, {encoding: 'utf-8'})
      console.log(data);
      res.end("data received");
    })
  }else{
    res.end('Welcome to my server');
  }

  
});

export default server;
