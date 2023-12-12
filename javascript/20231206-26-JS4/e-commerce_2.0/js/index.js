// Estos 4 array tendrian la misma cantidad siempre.
const linkArts = document.getElementsByName("link-articulo");
const nomrbreArt = document.getElementsByName("nombre-art");
const precioArt = document.getElementsByName("precio-art");
const imgenArt  = document.getElementsByName("img-art");

for (let i = 0; i < linkArts.length; i++) {
    linkArts[i].addEventListener("click",()=>{
        localStorage.removeItem("artLink");

        let art = {id:"art"+i, name: nomrbreArt[i].textContent, precio: precioArt[i].textContent,
            cantidad: 2, img: imgenArt[i].src};

        localStorage.setItem("artLink", JSON.stringify(art));
        console.log(art);
    });
}





