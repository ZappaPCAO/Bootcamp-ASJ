const actChiste = document.getElementById("actualizar-chiste");
const chiste = document.getElementById("chistes-chuck");

actChiste.addEventListener("click",()=>{
    fetch("https://api.chucknorris.io/jokes/random")
    .then((response) => response.json())
    .then((json) => {
        console.log(json)
        chiste.innerHTML = `${json.value}`;
    })
    .catch((error) => console.log("Ocurrió un error: " + error))
});