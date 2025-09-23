// Espera a que el DOM (Document Object Model) esté completamente cargado
document.addEventListener('DOMContentLoaded', () => {

    // Selecciona el elemento HTML con el ID 't800-card'
    const terminatorCard = document.getElementById('t800-card');
    
    // Define un array de colores futuristas para alternar
    const colors = ['#00ff00', '#ff00ff', '#00ffff'];
    let currentColorIndex = 0;

    // Agrega un "escuchador de evento" para cuando se haga clic en la tarjeta
    terminatorCard.addEventListener('click', () => {
        // Cambia al siguiente color en la lista
        currentColorIndex = (currentColorIndex + 1) % colors.length;
        const newColor = colors[currentColorIndex];

        // Aplica el nuevo color al borde y a la sombra de la caja
        terminatorCard.style.borderColor = newColor;
        terminatorCard.style.boxShadow = `0 0 20px ${newColor}`;
    });

});