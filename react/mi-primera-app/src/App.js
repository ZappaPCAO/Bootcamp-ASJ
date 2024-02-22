import logo from './logo.svg';
import './App.css';
import Componente1 from './components/Componente1';
import React, { useState } from 'react';
import Dado from './components/Dado';
import Componente2 from './components/Componente2';

function App() {
  const [algo, setAlgo] = useState(false); // Usamos useState para manejar el estado de algo

  let message;
  
  if (algo) {
    message = <Componente1 texto="Prueba" color="blue" />; // No uses comillas para Componente1, es un componente de React
  }  

  return (
    <>
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          {/* <button onClick={() => setAlgo(!algo)}>Haceme click</button> 
          <div>{message}</div>
          <Dado/> */}
          <Componente2/>
        </header>        
      </div>      
    </>
  );
}

export default App;

