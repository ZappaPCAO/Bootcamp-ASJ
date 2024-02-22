import React from "react";

import { useState } from "react"

function Dado() {

        const [resultado, setResultado] = useState(null);
        const lanzarDado = () => {           
          setResultado(Math.floor(Math.random() * 6) + 1);
        };

        let imagen;
        switch(resultado){
            case 1:
                imagen = 'https://th.bing.com/th/id/OIP.63VuaBZCa0qDkGBPGNni9gAAAA?rs=1&pid=ImgDetMain'
                break;
            case 2:
                imagen = 'https://cdn.pixabay.com/photo/2014/04/03/11/56/dice-312627__480.png'
                break;
            case 3:
                imagen = 'https://cdn.pixabay.com/photo/2014/04/03/11/56/dice-312624__480.png'
                break;
            case 4:
                imagen = 'https://th.bing.com/th/id/OIP.6FDpYrZ6pIMsa0JydbFAYAHaHa?w=768&h=768&rs=1&pid=ImgDetMain'
                break;
            case 5:
                imagen= 'https://i.pinimg.com/originals/7a/7a/77/7a7a77e7c2e42828177550e14c9a345b.png'
                break;
            case 6:
                imagen = 'https://creazilla-store.fra1.digitaloceanspaces.com/cliparts/3153988/dice-clipart-sm.png'
                break;
            default:
                imagen = 'https://2.bp.blogspot.com/-ENW7V7iPCkk/WqBQAPKXzOI/AAAAAAAAaZk/iOJyH6s3Dog2_lHkarG8i1FpnVYQJaY_gCLcBGAs/s1600/yatzy-no-ads_icon.png'
                break;
        }

    return(
        <>
            <div>
                <button className="btn" onClick={lanzarDado}>Lanzar Dado</button>
                {resultado && <p>El resultado del lanzamiento es: {resultado}</p>}
                <img  src={imagen} alt="imagen dado"/>
            </div>
        </>
    )
}

export default Dado;