const formReagente = document.querySelector("#form")
const inome = document.querySelector("#nomeReagente")
const icodigo = document.querySelector('#codigo')
const ival = document.querySelector("#validity")
const iqdtLeft = document.querySelector("#qtdLeft")
//const isetor = document.querySelector("#inputSetor")
const iestoque = document.querySelector("#quantity")
const iparticulars = document.querySelector("#particulars")
const iunidade = document.querySelector("#unidade")
//const icontrolado = document.querySelector("#controlado")

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
            particulars: iparticulars.value,
            validity: ival.value,
            quantity: iqdtLeft.value,
            quantLeft: iestoque.value,
            //controlled: icontrolado.value,
            codigo: icodigo.value,
            //sector: isetor.options[isetor.selectedIndex].value,
            unidade: iunidade.value
        })
    })
    .then(function(res) {console.log(res)})
    .catch(function(res){ console.log(res)})
}

formReagente.addEventListener("submit", function(event) {
    event.preventDefault();
    saveReagente();
});
