const userCardTemplate = document.querySelector("[data-user-template]")
const userCardContainer = document.querySelector("[data-user-cards-container]")
const searchInput = document.querySelector("[data-search]")

let materials = []

searchInput.addEventListener("input", e => {
    const value = e.target.value.toLowerCase()
    materials.forEach(material => {
        const isVisible = 
        material.name.toLowerCase().includes(value) ||
        material.codigo.toLowerCase().includes(value)
        material.element.classList.toggle("hide", !isVisible)
    })
    //console.log(value)
})

fetch("http://localhost:8080/api/v1/materials")
    .then(res => res.json())
    .then(data => {
        materials = data.map(material => {
            const card = userCardTemplate.content.cloneNode(true).children[0]
            const header = card.querySelector("[data-header]")
            const body = card.querySelector("[data-body]")
            header.textContent = material.name
            body.textContent = material.codigo
            userCardContainer.append(card)
            return {name: material.name, codigo: material.codigo, element: card }
            //console.log(material)
        })
    })