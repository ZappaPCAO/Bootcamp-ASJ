import { useState } from "react";
import { useEffect } from "react";

function Componente2 (){

    let [valor, setValor] = useState(1);

    const cambiarEstado = () => {setValor(valor++)};

    // Cada vez q se reenderiza el componente
    useEffect(() => {
        console.log("Reenderizando componente 2.");
    });

    useEffect(() => {
        console.log("Renderizando por primera vez el componente 2.");
    }, []);

    useEffect(() => {
        console.log("Cambio el valor.");
    }, [valor]);

    return (
        <div>
            <h3>Soy el componente 2</h3>
            <button onClick={cambiarEstado} className="btn btn-primary">
                click
            </button>
        </div>
    )
}

export default Componente2;