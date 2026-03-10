import { useState } from "react";

function PrimeNumber() {
  const [num1, setNum1] = useState("");
  const [result, setResult] = useState("");

  function checkPrime() {
    const n = Number(num1);

    if (n <= 1) {
      setResult("Not Prime");
      return;
    }

    for (let i = 2; i * i <= n; i++) {
      if (n % i === 0) {
        setResult("Not Prime");
        return;
      }
    }

    setResult("Prime");
  }

  return (
    <div>
      <h2>Prime Number Checker</h2>

      <input
        type="number"
        value={num1}
        onChange={(e) => setNum1(e.target.value)}
        placeholder="Enter number"
      />

      <button onClick={checkPrime}>Check</button>

      <h3>{result}</h3>
    </div>
  );
}

export default PrimeNumber;