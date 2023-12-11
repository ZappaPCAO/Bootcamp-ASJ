const rowHard = document.getElementById("row-hard")
const message = document.getElementById("colorDisplay")
const newColors = document.getElementById("reset")
const diffButtons = Array.from(document.getElementsByName("dificultad"))
const squareArray = Array.from(document.getElementsByClassName("square"))

let longitud = 6; // Valor inicial del array. Modo HARD

function hexToRgb(hex) {
    var result = /^#?([a-f\d]{2})([a-f\d]{2})([a-f\d]{2})$/i.exec(hex);
    return result ? `background-color: rgb(${parseInt(result[1], 16)},${parseInt(result[2], 16)},${parseInt(result[3], 16)})` : null;
}

let initArrayColors = (longitud) =>{
    let arrayColors = [];
    let randomIndex = Math.floor(Math.random()*longitud);
    for(let i = 0; i<longitud; i++){
        randomColor = hexToRgb(Math.floor(Math.random()*16777215).toString(16)); //se entiende       
        let newColor = {
            randomColor,
            flag: false
        }
        arrayColors.push(newColor)
    }
    arrayColors[randomIndex].flag = true
    console.log(arrayColors)
    return arrayColors
}

for (const button of diffButtons) {
    button.addEventListener("click", ()=>{
        for(let i = 0; i<diffButtons.length; i++){
            if(diffButtons[i].classList == "selected"){
                diffButtons[i].classList.remove("selected")
            }
        }
        button.classList = "selected"
        rowHard.classList = button.id == "easy" ? "d-none" : "row d-block"
        rowHard.classList == "d-none" ? longitud = 3 : longitud = 6;
        console.log(longitud)        
        setColors();
    })
}

function setColors(){
    let newArr = []
    newArr = initArrayColors(longitud);

    let elegido = newArr.find((square)=> square.flag == true)

    for (let i = 0; i<longitud; i++){
        squareArray[i].style = newArr[i].randomColor;

        squareArray[i].addEventListener("click", ()=>{
            console.log(elegido);
            alert(elegido == newArr[i] ? "Correct" : "Incorrecto");
        })
    }

    message.innerHTML = `${(elegido.randomColor).slice((elegido.randomColor).lastIndexOf(" "))}`;

    console.log(elegido)
}

newColors.addEventListener("click",setColors);

setColors()

