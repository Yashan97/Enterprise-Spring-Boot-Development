
let txtProductName
    = document.getElementById("txt-product");

let txtProductDescription 
    = document.getElementById("txt-product-description");

let txtProductPrice 
    = document.getElementById("txt-product-price");


    let btnSaveProduct 
    = document.getElementById("btn-save-product");

function btnSaveProductClick(){ // create method for button
        //Gather text box values
        let requestBody = {
            // Create Json object and pased value
            "name":txtProductName.value,
            "description":txtProductDescription.value,
            "price":txtProductPrice.value

        };
        //POTS
        //  Connecting network request and json Object (intergating frontend and backend)
        fetch("http://localhost:8080/create-product",{
            method:"POST",
            body:JSON.stringify(requestBody),
            headers:{
                "Content-type":"application/json",
            }
        })
        .then(data =>data.json())
        .then(data=>{
            console.log("response receved");
            
        })
    }
    // call button 
    btnSaveProduct.addEventListener("click",btnSaveProductClick);