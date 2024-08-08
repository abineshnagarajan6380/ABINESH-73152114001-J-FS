// script.js

document.addEventListener('DOMContentLoaded', () => {
    const saleForm = document.getElementById('sale-form');
    const itemNameInput = document.getElementById('item-name');
    const quantityInput = document.getElementById('quantity');
    const priceInput = document.getElementById('price');
    const salesList = document.getElementById('sales');

    saleForm.addEventListener('submit', (e) => {
        e.preventDefault();
        const itemName = itemNameInput.value.trim();
        const quantity = quantityInput.value.trim();
        const price = priceInput.value.trim();
        if (itemName && quantity && price) {
            addSale(itemName, quantity, parseFloat(price));
            itemNameInput.value = '';
            quantityInput.value = '';
            priceInput.value = '';
        }
    });

    function addSale(itemName, quantity, price) {
        const li = document.createElement('li');
        li.textContent = `Item: ${itemName}, Quantity: ${quantity}, Price: $${price.toFixed(2)}`;
        salesList.appendChild(li);
    }
});
