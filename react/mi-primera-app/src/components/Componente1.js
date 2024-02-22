function Componente1({texto, color}){
    return (
    <>
        <h1>Hola chicos, como estan?</h1>
        <em style={{color:color}}>{texto}</em>
    </>
)}

export default Componente1;

export function condition(algo){
    algo = true;
}