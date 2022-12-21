const api_vidraria =
	"http://localhost:8080/api/v1/glasswares";
getapiVid(api_vidraria);
function getapiVid(url) {
	fetch(url)
    .then(res => res.json())
    .then((out) => {
        showVid(out);
    }).catch(err => console.error(err));
}
function showVid(data_vid) {
	document.getElementById("qtdVidraria").innerHTML = `${data_vid.length}`;
}