const formReagente = document.querySelector("#form")
const inome = document.querySelector("#nomeReagente")
const imarca = document.querySelector("#brand")
const ival = document.querySelector("#validity")
const iqdtLeft = document.querySelector("#qtdLeft")
const isetor = document.querySelector("#setor")
const iestoque = document.querySelector("#quantity")
const iparticulars = document.querySelector("#particulars")
//const iunidade = document.querySelector("#unidade")

function saveReagente(){
    fetch("http://localhost:8080/api/v1/reagents",
        {
            headers: {
            "Accept": "application/json",
            "Content-Type": "application/json"
        },
        method: "POST",
        body: JSON.stringify({
            name: inome.value,
            brand: imarca.value,
            particulars: iparticulars.value,
            validity: ival.value,
            quantity: iqdtLeft.value,
            quantLeft: iestoque.value
            //sector: isetor.options[isetor.selectedIndex].value,
            //unidade: iunidade.value, -> pegar informação da unidade (ml, g) e adicinar essa informação no backend
            //estoque: iestoque.value
        })
    })
    .then(function(res) {console.log(res)})
    .catch(function(res){ console.log(res)})
}

formReagente.addEventListener("submit", function(event) {
    event.preventDefault();
    saveReagente();
});
