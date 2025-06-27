function loadProducts(){
    fetch("http://localhost:8080/get-new%20products")
    .then(res =>res.json())
    .then(res => {
        console.log(res);
        
    })
    
}

document.getElementById("btn-load-product")
    .addEventListener("click", loadProducts ) 
