const form = document.querySelector("#form")
const inome = document.querySelector("#floatingName")
const imat = document.querySelector("#floatingMat")
const itipo = document.getElementsByName('type')
const iemail = document.querySelector("#floatingInput")
const isenha = document.querySelector("#floatingPassword")
//const isetor = document.querySelector("#setor")

function saveUserTeacher(){
    fetch("http://localhost:8080/api/v1/teachers",
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
            senha: isenha.value
            //setor: isetor.value
        })
    })
    .then(function(res) {console.log(res)})
    .catch(function(res){ console.log(res)})
}
function saveUserReseacher(){
    fetch("http://localhost:8080/api/v1/researcher",
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
        senha: isenha.value
        //setor: isetor.value
    })
})
.then(function(res) {console.log(res)})
.catch(function(res){ console.log(res)})
}

form.addEventListener("submit", function(event) {
    event.preventDefault();
    if (itipo[0].checked) saveUserTeacher();
    else if (itipo[1].checked) saveUserReseacher();
});
