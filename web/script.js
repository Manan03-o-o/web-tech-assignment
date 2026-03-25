/* script.js */

const form = document.getElementById('myForm');
const message = document.getElementById('message');

form.addEventListener('submit', function(e) {
    e.preventDefault(); // Prevent page reload

    const name = document.getElementById('name').value.trim();
    const email = document.getElementById('email').value.trim();

    // Simple validation
    if (name === '' || email === '') {
        message.style.color = 'red';
        message.textContent = 'Please fill all fields!';
    } 
    else if (!email.includes('@')) {
        message.style.color = 'red';
        message.textContent = 'Enter a valid email!';
    } 
    else {
        message.style.color = 'green';
        message.textContent = 'Form submitted successfully!';
        
        // Optional: clear form
        form.reset();
    }
});