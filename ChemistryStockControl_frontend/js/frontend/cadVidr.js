const formVidraria = document.querySelector("#form")
const inome = document.querySelector("#nome")
const icapacidade = document.querySelector("#capacidade")
const isetor = document.querySelector("#inputSetor") --
const idescricao = document.querySelector("#descricao")
const iquantidade = document.querySelector("#quantidade")
function saveVidraria(){
    fetch("http://localhost:8080/api/v1/glasswares",
        {
            headers: {
            "Accept": "application/json",
            "Content-Type": "application/json"
        },
        method: "POST",
        body: JSON.stringify({
            name: inome.value,
            capacity: icapacidade.value,
            quantity: iquantidade.value,
            particulars: idescricao.value,
            sector: isetor.value
        })
    })
    .then(function(res) {console.log(res)})
    .catch(function(res){console.log(res)})
}

formVidraria.addEventListener("submit", function(event){
    event.preventDefault();
    saveVidraria();
})