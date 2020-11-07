function Login() {
    var done=0;
    var usuername = document.getElementsByName('username')[0].value;
    usuario=username.toLowerCase();
    var password= document.getElementsByName('password')[0].value;
    seha=password.toLowerCase();

    
    if (usuario=="admin" && senha=="admin") {
      window.location="/p/admin.html";
      done=1;
    }
    if (done==0) { alert("INCORRECT DATA, TRY AGAIN"); }
  }
  <div id="all">
    <div id="login-box">
      <div id="login-header">
        Faça login no sistema
      </div>
      <div id="login-inputs">
        <input type="text" placeholder="Name" name="usuername">
        <br />
        <input type="password" placeholder="password" name="password">
      </div>
      <div id="enviar">
        <input type="button" onclick="Login()" class="botao" value="Login">
        <a href="#">FORGOT password?</a>
      </div>
    </div>
  </div>