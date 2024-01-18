window.onload = function() {
    document.querySelector('form').addEventListener('submit', function(event) {
        event.preventDefault();

        const name = document.getElementById('name').value;
        const pw = document.getElementById('pw').value;

        fetch('/user/login', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({ name: name, pw: pw })
        }).then(function(response) {
            if (response.ok) {
                return response.json();
            } else {
                throw new Error('로그인 실패');
            }
        }).then(function(data) {
            console.log(data);
            // 로그인 성공 후 처리
        }).catch(function(error) {
            console.error(error);
            // 로그인 실패 후 처리
        });
    });
};
