import { useState } from "react";
import axios from "axios";

function App() {

  const [num1, setNum1] = useState(0);
  const [num2, setNum2] = useState(0);
  const [result, setResult] = useState(null);

  const handleCalculate = (e) => {
    e.preventDefault();

    axios.post("http://localhost:8080/addition/add", {
      num1: parseInt(num1),
      num2: parseInt(num2)
    })
    .then((response) => {
      console.log(response.data.data); // ✅ full object
      setResult(response.data.data); // ✅ full object
    })
    .catch((error) => console.log(error));
  };

  return (
    <div style={{ padding: "20px" }}>
      <h2>Simple Calculator</h2>

      <form onSubmit={handleCalculate}>
        <input type="number" value={num1}
          onChange={(e) => setNum1(e.target.value)} />
        
        <input type="number" value={num2}
          onChange={(e) => setNum2(e.target.value)} />

        <button type="submit">Calculate</button>
      </form>

      {result && (
        <div>
          <h3>Result: {result.result}</h3>
          <p>
            {result.num1} + {result.num2} = <strong>{result.result}</strong>
          </p>
        </div>
      )}
    </div>
  );
}

export default App;