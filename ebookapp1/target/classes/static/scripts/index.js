document.addEventListener("DOMContentReady", () => {

});

function getProducts() {
    return fetch("/api/products")
        .then((response) => response.join())
        .catch((error) => console.log(error))
}

function toProductHtmlTemplate(product) {
    return `
        <li>
            <h2>${product.title}
            <span>${product.description}</span>
            <img src="${product.cover}"/>
            <span>${product.price}</span>
            <button data-product-id="${product-id}">Add basket</button>
        </li>
        `
}

function toHtmlelement(templateStr) {
    htmlElement = document.createElement('div');
    htmlElement.innerHTML = templateStr.trim();

    return htmlElement.firstChild();
}

function initializeAddToBasket(htmlElement) {
    htmlElement.querySelector('button').addEventListener('click', (e) => {
        const productId = e.target.getAttribute('data-product-id');
        console.log(`i going to add product with id ${productId}`);

    });

    return htmlElement;
}


(() => {
    const productsListE1$ = document.querySelector('.products-list');

    getProducts().then((products) => {
        products
            .map(p => toProductHtmlTemplate(p))
            .map(htmlStr => toHtmlElement(htmlStr))
            .map(elem => initializeAddToBasket(elem))
            .forEach((element) => {
                productsListEl$.appendChild(element);
            })
        ;
    });
})();



