import events from "events";

class FitnessTracker extends events.EventEmitter {
  constructor() {
    super();
    this.progress = 0;
    this.goal = 1000;
  }

  addExercise(exercise) {
    // Update progress
    this.progress += exercise.caloriesBurned;

    // Check if goal is reached
    if (this.progress >= this.goal) {
      // Emit goalReached event
      this.emit("goalReached");

      // Send congratulatory message
      console.log("Congratulations! You have reached your fitness goal");
    }
  }
}

const tracker = new FitnessTracker();

const Solution = () => {
  tracker.addExercise({ name: "Running", caloriesBurned: 500 });
  tracker.addExercise({ name: "Weightlifting", caloriesBurned: 600 });
};

Solution();

export { FitnessTracker, Solution };
