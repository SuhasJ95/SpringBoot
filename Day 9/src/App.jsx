import { useState } from "react";
import Image from "./component/image";
import NumberGuess from "./component/NumberGuess";
import Grading from "./component/grading";
import ListDisplay from "./component/ListDisplay";
import PrimeNumber from "./component/PrimeNumber";
import List from "./component/List";
import Lists from "./component/ListOfNumbers";
import PassFail from "./component/PassFail";

function App() {
  const [count, setCount] = useState(0);

  const incrementCounter = () => {
    setCount(count + 1);
  };

  const decrementCounter = () => {
    setCount(count - 1);
  };


  return (
    <>
      {/* <div>Total Count: {count}</div>
      <button onClick={incrementCounter}>Add+1</button>
      <button onClick={decrementCounter}>Sub-1</button>
      <div>
        <Image/>
      </div>
    <NumberGuess/>
    <Grading /> */}
    <ListDisplay/>
    <PrimeNumber/>
    <List/>
    <Lists/>
    <PassFail/>
    </>
    
  );
  
}

export default App;
