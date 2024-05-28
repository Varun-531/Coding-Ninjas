// src/features/tweet/tweet.routes.js
import express from "express";
import { getTweets, createTweet } from "./tweet.controller.js";

const router = express.Router();

// Define the routes
router.get("/", getTweets);
router.post("/", createTweet);

export default router;
