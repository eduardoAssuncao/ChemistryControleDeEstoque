const formReagente = document.querySelector("#form")
const inome = document.querySelector("#nomeReagente")
const imarca = document.querySelector("#brand")
const ival = document.querySelector("#validity")
const iqdtLeft = document.querySelector("#qtdLeft")
const isetor = document.querySelector("#setor")
const iestoque = document.querySelector("#quantity")

function saveReagente(){
    fetch("http://localhost:8080/api/v1/materials",
        {
            headers: {
            "Accept": "application/json",
            "Content-Type": "application/json"
        },
        method: "POST",
        body: JSON.stringify({
            name: inome.value,
            marca: imarca.value,
            validade: ival.value,
            qtdLeft: iqdtLeft.value,
            setor: isetor.value,
            estoque: iestoque.value
        })
    })
    .then(function(res) {console.log(res)})
    .catch(function(res){ console.log(res)})
}

formReagente.addEventListener("submit", function(event) {
    event.preventDefault();
    saveReagente();
});
