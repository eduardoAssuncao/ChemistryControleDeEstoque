/* const userCardTemplate = document.querySelector("[data-user-template]")
const userCardContainer = document.querySelector("[data-user-cards-container]")
const searchInput = document.querySelector("[data-search]")

let materials = []

searchInput.addEventListener("input", e => {
    const value = e.target.value.toLowerCase()
    materials.forEach(material => {
        const isVisible = 
        material.name.toLowerCase().includes(value) 
        //|| material.codigo.toLowerCase().includes(value)
        material.element.classList.toggle("hide", !isVisible)
    })
    //console.log(value)
})

fetch("http://localhost:8080/api/v1/materials")
    .then(res => res.json())
    .then(data => {
        materials = data.map(material => {
            const card = userCardTemplate.content.cloneNode(true).children[0]
            const body = card.querySelector("[data-body-nome]")
            const bodyEstoque = card.querySelector("[data-body-estoque]")
            const bodyLocal = card.querySelector("[data-body-local]")

            body.textContent = material.name
            bodyEstoque.textContent = material.quantity
            bodyLocal.textContent = material.sector
            userCardContainer.append(card)

            return {
                name: material.name, 
                quantity: material.quantity,
                sector: material.sector,
                element: card }
            //console.log(material)
        })
    }) */

const formSolic = document.querySelector("#form-solic")
const bodySolic = document.querySelector("#body-table-solici")
const iNome = document.querySelector("#inputMat")
//const iFinal = document.querySelector("#")
const iQtd = document.querySelector("#input-quant-retirada")
//const iUnidade = document.querySelector("#")
const iRetirada = document.querySelector("#dataRetirada")
const iDevol = document.querySelector("#dataDevolucao")
const iJustificativa = document.querySelector("#text-solicit-just")
const iDest = document.querySelector("#text-solicit-residuos")
const itensSolic = []
function realizaSolic(){
        fetch("http://localhost:8080/api/v1/solicitations",
            {
                headers: {
                "Accept": "application/json",
                "Content-Type": "application/json"
            },
            method: "POST",
            body: JSON.stringify({
                nome: iNome.value,
                //finalidade: iFinal.value,
                quantidade: iQtd.value,
                retirada: iRetirada.value,
                devolucao: iDevol.value,
                justificativa: iJustificativa.value,
                destino: iDest.value
            })
        })
        .then(function(res) {console.log(res)})
        .catch(function(res){ console.log(res)})
    }
    
formSolic.addEventListener("submit", function(event) {
    event.preventDefault();
    realizaSolic();
});