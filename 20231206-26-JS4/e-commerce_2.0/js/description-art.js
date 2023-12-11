const nomrbreArt = document.getElementById("nombre-art");
const precioArt = document.getElementById("precio-art");
const imgenArt  = document.getElementById("img-art");
const btnAddCart = document.getElementById("add-cart");

const storedArt = JSON.parse(localStorage.getItem('artLink'))
console.log(storedArt);
nomrbreArt.innerHTML = storedArt.name;
precioArt.innerHTML = storedArt.precio;
imgenArt.src = storedArt.img;

btnAddCart.addEventListener("click", ()=>{
    let cantidad = +document.getElementById("cant-art").value;
    let cantidadCart = 0;

    if((!isNaN(cantidad) && cantidad <= 0) || // Si ingreso un numero menor a 0.
        (storedArt.cantidad === 0)){        // Si no hay stock.
        return;
    }

    storedArt.cantidad = cantidad;
     
    let cart = JSON.parse(localStorage.getItem("cart")) || [];

    if(cart === null){
        cart = storedArt;
    }

    cart.push(storedArt);
    localStorage.setItem("cart", JSON.stringify(cart));

    cargarCarrito();

    Swal.fire({
        position: "top-end",
        icon: "success",
        title: "Articulo cargado correctamente!",
        showConfirmButton: false,
        timer: 1500
    });

});

const comprar = document.getElementById("btn-comprar");

comprar.addEventListener("click", () => {
    Swal.fire({
        title: "Exito",
        text: "Usted realizo la compra con exito!",
        icon: "success"
    });

    localStorage.removeItem("cart");
    const cart = document.getElementById("cart-body");
    const total = document.getElementsByName("total-cart");

    cart.innerHTML = ``;
    total[0].innerHTML = `Total: `
});

cargarCarrito();