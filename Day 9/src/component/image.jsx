import { useState } from "react";

function Image() {
    const [count,setCount] = useState(true);

    const switchFunction = () => {
        setCount(!count);
    }; 
    
    return (
        <>
        <div>
            {count && <div>Truer</div>}
            {!count && <div>False</div>}
            <button onClick={switchFunction}>Update</button>
        </div>
        </>
    );
}

export default Image;