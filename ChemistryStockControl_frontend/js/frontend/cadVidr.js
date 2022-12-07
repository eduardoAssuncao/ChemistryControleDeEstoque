const formVidraria = document.querySelector("#form")
//const icodigo = document.querySelector("#cod")
const inome = document.querySelector("#nome")
const icapacidade = document.querySelector("#capacidade")
//const isetor = document.querySelector("#inputSetor") --
const idescricao = document.querySelector("#descricao")
//const imarca = document.querySelector("#marca")
//const iquantidade = document.querySelector("#quantidade")
function saveVidraria(){
    fetch("http://localhost:8080/api/v1/glasswares",
        {
            headers: {
            "Accept": "application/json",
            "Content-Type": "application/json"
        },
        method: "POST",
        body: JSON.stringify({
            //codigo: icodigo.value, -> verificar necessidade. Se tiver que ter isso aqui, também deveríamos colocar em reagentes - remover
            name: inome.value,
            capacity: icapacidade.value,
            //brand: imarca.value, -> adicionar infomação na página HTML - remover
            //quantity: iquantidade.value, -> adicionar informação na página HTML - Inserir
            particulars: idescricao.value
            //sector: isetor.value -- Inserir
        })
    })
    .then(function(res) {console.log(res)})
    .catch(function(res){console.log(res)})
}

formVidraria.addEventListener("submit", function(event){
    event.preventDefault();
    saveVidraria();
})