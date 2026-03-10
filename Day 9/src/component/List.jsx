import { useState } from "react";

function List() {
  const [numbers, setNumbers] = useState([1,7,57,76,89,57,33,22]);

  function isPrime(n) {
    if (n <= 1) return false;

    for (let i = 2; i * i <= n; i++) {
      if (n % i === 0) return false;
    }
    return true;
  }

  return (
    <div>
      <h2>Prime Check for List</h2>

      <ul>
        {numbers.map((num, index) => (
          <li key={index}>
            {num} → {isPrime(num) ? "Prime" : "Not Prime"}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default List;