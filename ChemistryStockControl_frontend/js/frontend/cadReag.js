const formReagente = document.querySelector("#form")
const inome = document.querySelector("#nomeReagente")
const ival = document.querySelector("#validity")
const iqdtLeft = document.querySelector("#qtdLeft")
const isetor = document.querySelector("#setor")
const iestoque = document.querySelector("#quantity")
const iparticulars = document.querySelector("#particulars")
const iunidade = document.querySelector("#unidade")
//const icontrolado = document.querySelector("#controlado") -> valor boolean
//const icodigo = document.querySelector("#codigo")

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
            //controlled: icontrolado.value, ->Inserir se o reagente é controlado ou não
            //codigo: icodigo.value, ->Inserir codigo de reagente,
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
