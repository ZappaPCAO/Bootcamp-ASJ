function eliminarCarrito() {
    localStorage.removeItem("cart");

    document.getElementById("cart-body").innerHTML = "";
}
  
function obtenerPrecioTotal(array) {
    return array.reduce((total, elemento) => total + parseFloat(elemento.precio), 0);
}

function eliminarDelCarrito(idArt) {
    let carrito = JSON.parse(localStorage.getItem("cart")) || [];

    let articulo = carrito.find((art) => art.id === idArt);
  
    let index = carrito.findIndex((element) => element.id === articulo.id);
  
    carrito.splice(index, 1);
    
    localStorage.setItem("cart", JSON.stringify(carrito));

    cargarCarrito(carrito);
}

function cargarCarrito(){
    let cart = JSON.parse(localStorage.getItem("cart")) || [];
    
    if(cart === null){
        return;
    }

    let formatoArg = new Intl.NumberFormat('es-ES', { style: 'currency', currency: 'ARS' });

    const cartBody = document.getElementById("cart-body");
    const cartTotal = document.getElementsByName("total-cart"); // id dado por boostrap.

    cartBody.innerHTML = "";

    let arts = document.createElement("div");
    arts.className = "container";
    arts.id = "container-cart"

    arts.innerHTML += `
            <div class="row justify-content-between align-items-center">
                <div class="col-6">
                    <h5>Nombre</h5>                    
                </div>
                <div class="col-6">                
                    <h5>Precio</h5>
                </div>
            </div>`;

    for (const articulo of cart) {
        arts.innerHTML += `
            <div class="row justify-content-between align-items-start">                
                <div class="col-5">
                    <p>${articulo.name}</p>
                    <p>cantidad: ${articulo.cantidad}</p>                    
                </div>
                <div class="col-5">                
                    <p>${formatoArg.format(articulo.precio)}</p>
                    <p>Subtotal: ${parseFloat(articulo.precio)*parseFloat(articulo.cantidad)}</p>
                </div>
                <div class="col-2">
                <button title="Eliminar" id="eliminar-${articulo.id}" class="btn btn-dark"><i class="fi fi-sr-trash"></i></button>
                </div>
            </div>
        `;
    }

    cartTotal[0].innerHTML += formatoArg.format(obtenerPrecioTotal(cart));

    cartBody.appendChild(arts);

    for (const articulo of cart) {
        const botonEliminar = document.getElementById(`eliminar-${articulo.id}`);

        botonEliminar.addEventListener("click", ()=>{
            eliminarDelCarrito(articulo.id);
        });
    }
}