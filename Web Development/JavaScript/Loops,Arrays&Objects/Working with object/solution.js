// Complete the findClassTopper function
// Do not alter alter the starter code.

const studentMarks = {
  John: [85, 90, 92, 88, 87],
  Jane: [92, 95, 89, 91, 94],
  David: [78, 85, 90, 92, 84],
  Emily: [90, 88, 92, 87, 91],
  Michael: [86, 92, 90, 89, 94]
};

function findClassTopper(studentMarks) {
  // Implement your function here
  let name = "";
  let sum = 0;

  let sumJohn = 0;
  for (let i = 0; i < 5; i++) {
      sumJohn += studentMarks.John[i];
  }
  if (sum < sumJohn) {
      sum = sumJohn;
      name = "John";
  }

  let sumJane = 0;
  for (let i = 0; i < 5; i++) {
      sumJane += studentMarks.Jane[i];
  }
  if (sum < sumJane) {
      sum = sumJane;
      name = "Jane";
  }

  let sumDavid = 0;
  for (let i = 0; i < 5; i++) {
      sumDavid += studentMarks.David[i];
  }
  if (sum < sumDavid) {
      sum = sumDavid;
      name = "David";
  }

  let sumEmily = 0;
  for (let i = 0; i < 5; i++) {
      sumEmily += studentMarks.Emily[i];
  }
  if (sum < sumEmily) {
      sum = sumEmily;
      name = "Emily";
  }

  let sumMichael = 0;
  for (let i = 0; i < 5; i++) {
      sumMichael += studentMarks.Michael[i];
  }
  if (sum < sumMichael) {
      sum = sumMichael;
      name = "Michael";
  }

  return name;
}

console.log(findClassTopper(studentMarks));
// Output: "Jane"
