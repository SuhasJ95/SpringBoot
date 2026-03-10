import { useState } from "react";

function NumberGuess() {

  const [number, setNumber] = useState(3);
  const [guess, setGuess] = useState("");
  const [result, setResult] = useState("");

  const GuessNumberequal = () => {

    if (number === parseInt(guess)) { 
      setResult("CORRECT");
    } else {
      setResult("WRONG");
    }
  };

  return (
    <div>
      <input
        type="number"
        value={guess}
        onChange={(e) => setGuess(e.target.value)} 
      />

      <button onClick={GuessNumberequal}>Update</button> 

      <h3>{result}</h3>
    </div>
  );
}

export default NumberGuess;