import { useState } from "react";

function Grading() {

    const [number,setnumber] = useState("");   
    const [result, setResult] = useState("Enter the marks to check the grade");

    const checkGrade = () => {

        if (number == 100) {
            setResult(" A + Grade!");
        } else if (number >= 80) {
            setResult(" A Grade!");
        } else if (number >= 60) {
            setResult(" B Grade!");
        } else if (number >= 50) {
            setResult(" C Grade!");
        } else if(number>=40){
            setResult(" D Grade!");
        }
        else
        setResult("F Grade!")

    };

    return(
        <div>

            <input
                type="number"
                onChange={(e) => setnumber(e.target.value)}
            />

            <button onClick={checkGrade}>
                Check Grade
            </button>

            <h3>{result}</h3>
        </div>
    );
}
export default Grading;