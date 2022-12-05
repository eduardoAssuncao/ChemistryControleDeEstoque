const form = document.querySelector("#form")
const inome = document.querySelector("#floatingName")
const imat = document.querySelector("#floatingMat")
const iemail = document.querySelector("#floatingInput")
const isenha = document.querySelector("#floatingPassword")
const isetor = document.querySelector("#setor")

function saveUser(){
    fetch("http://localhost:8080/api/v1/users",
        {
            headers: {
            "Accept": "application/json",
            "Content-Type": "application/json"
        },
        method: "POST",
        body: JSON.stringify({
            name: inome.value,
            matricula: imat.value,
            email: iemail.value,
            senha: isenha.value,
            setor: isetor.value
        })
    })
    .then(function(res) {console.log(res)})
    .catch(function(res){ console.log(res)})
}

form.addEventListener("submit", function(event) {
    event.preventDefault();
    saveUser();
});
