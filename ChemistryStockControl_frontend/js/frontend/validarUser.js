const imatricula = document.querySelector('#floatingInput');
const isenha = document.querySelector('#floatingPassword');

const api_url = "http://localhost:8080/api/v1/users";

let matricula = [];
let nome = [];
let email = [];
let senha = [];

function validar(data) {
    
    for (let r of data) {
        let i = 0;
        matricula = r.matricula;
        nome = r.name;
        email = r.email;
        senha = r.senha;
        if(imatricula.value == r.matricula && isenha.value == r.senha){
            console.log("Logando");
            window.location.href="/ChemistryStockControl_frontend/html/adm/index.html";

        }else{
            console.log("Deu tudo errado");
        }
        i++;
    }
}

form.addEventListener("submit", function(event) {
    event.preventDefault();
    async function getapi(url) {
        const response = await fetch(url);
    
        var data = await response.json();
        //info = data;
        //console.log(data);
        validar(data);
    }
    getapi("http://localhost:8080/api/v1/users")
});