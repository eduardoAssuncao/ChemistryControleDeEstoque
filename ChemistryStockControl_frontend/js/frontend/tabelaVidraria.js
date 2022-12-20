// api url
const api_url_vidraria =
	"http://localhost:8080/api/v1/glasswares";

// Defining async function
async function getVidraria(url) {
	// Storing response
	const response = await fetch(url);
	
	// Storing data in form of JSON
	var data = await response.json();
    
	showVidro(data);
}
// Calling that async function
getVidraria(api_url_vidraria);

// Function to define innerHTML for HTML table
function showVidro(data) {
	let tab =
		`<thead>
        <tr">
            <th scope="col">Nome</th>
            <th scope="col">Unidades</th>
            <th scope="col">Capacidade</th>
            <th scope="col">Setor</th>
            <th scope="col"></th>
        </tr>
    </thead>`;
	
	// Loop to access all rows
	for (let r of data) {

		tab += `<tbody>
        <tr scope="row">
            <td><a href="#" class="name">${r.name}</a></td>
            <td>${r.quantity}</td>
            <td>${r.capacity}</td>
            <td>${r.sector}</td>
            <td><a href="#"class="more">Detalhes</a></td>
        </tr>
    </tbody>`;
	}
	// Setting innerHTML as tab variable
	document.getElementById("vidrarias").innerHTML = tab;
}
