//tentativa baseada no vídeo do hermano
//$(document).ready(() => {

//     //salva usuários
//     const save = () => {
//         $('#enviar').on('click', function(){
//             const user = {
//                 name: $('#floatingName').val(),
//                 mat: $('#floatingMat').val(),
//                 email: $('#floatingInput').val(),
//                 password: $('#floatingPassword').val()
//             }

//             $.ajax({
//                 url: 'http//:localhost:8080/users',
//                 contentType: 'application/json',
//                 type: 'POST',
//                 data: JSON.stringify(user),
//                 dataType: 'json',
//                 success: () => {
//                     console.log('Usuário registrado');
//                 },
//                 error: function (e) {
//                     console.log("ERROR : ", e);
//                 }          
//             })
//         })
//     }

//     save();
// })

// tentativa 2
const form = document.querySelector("#form")
const inome = document.querySelector("#floatingName")
const imat = document.querySelector("#floatingMat")
const iemail = document.querySelector("#floatingInput")
const isenha = document.querySelector("#floatingPassword")

function save(){
    fetch("http://localhost:8080/api/v1/users",
        {
            headers: {
            "Accept": "application/json",
            "Content-Type": "application/json"
        },
        method: 'POST',
        body: JSON.stringify({
            matricula: imat.value,
            nome: inome.value,
            email: iemail.value,
            senha: isenha.value
        })
    })
    .then(function(res) {console.log(res)})
    .catch(function(res){ console.log(res)})
}

form.addEventListener('submit', function(event) {
    event.preventDefault();
    save();
})