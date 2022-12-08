// api url
const api_url =
	"http://localhost:8080/api/v1/reagents";

// Defining async function
async function getapi(url) {
	// Storing response
	const response = await fetch(url);
	
	// Storing data in form of JSON
	var data = await response.json();
    
	show(data);
}
// Calling that async function
getapi(api_url);

// Function to define innerHTML for HTML table
function show(data) {
	let tab =
		`<thead>
            <tr>
                <th scope="col">Código</th>
                <th scope="col">Controlado</th>
                <th scope="col">Nome</th>
                <th scope="col">Quantidade</th>
                <th scope="col">Estoque</th>
                <th scope="col">Validade</th>
                <th scope="col">Finalidade</th>
                <th scope="col">Localização</th>
            </tr>
        </thead>`;
	
	// Loop to access all rows
	for (let r of data) {
        controlled = r.controlled ? 'Sim' : 'Não';

		tab += `<tbody>
                    <tr scope="row">
                        <td>${r.codigo}</td>
                        <td>${controlled}</td>
                        <td><a href="#">${r.name}</a></td>
                        <td>${r.quantLeft}${r.unidade}</td>
                        <td>${r.quantity}</td>
                        <td>${r.validity}</td>
                        <td>${r.finalidade}</td>
                        <td>${r.sector}</td>
                        <td><a href="#" class="more">Detalhes</a></td>
                    </tr>
                </tbody>`;
	}
	// Setting innerHTML as tab variable
	document.getElementById("reagentes").innerHTML = tab;
}
