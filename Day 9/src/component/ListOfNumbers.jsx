import { useState } from "react";

function Lists() {
  const nums = [2, 3, 4, 5, 54, 45, 3, 3, 33];
  const [results, setResults] = useState(null);

  const isPrime = (n) => {
    if (typeof n !== "number" || n < 2) return false;
    for (let i = 2; i <= Math.sqrt(n); i++) {
      if (n % i === 0) return false;
    }
    return true;
  };

  const checkPrime = () => {
    setResults(nums.map((num) => ({ value: num, prime: isPrime(num) })));
  };

  return (
    <div>
      <h2>Number Primality Check</h2>
      <button onClick={checkPrime}>Check Primes</button>

      {results && (
        <ul>
          {results.map((item, idx) => (
            <li key={idx}>
              {item.value}: {item.prime ? "Prime" : "Not prime"}
            </li>
          ))}
        </ul>
      )}
    </div>
  );
}

export default Lists;
