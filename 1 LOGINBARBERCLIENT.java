function Login() {
    var done=0;
    var usuername = document.getElementsByName('username')[0].value;
    usuario=username.toLowerCase();
    var phone= document.getElementsByName('phone number')[0].value;
    seha=phone.toLowerCase();
    var email = document.getElementsByName('email address')[0].value;
    usuario=username.toLowerCase();
    var password= document.getElementsByName('password')[0].value;
    seha=password.toLowerCase();
    
    if (username=="admin" && password=="admin") {
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
        <input type="text" placeholder="Name" name="username">
        <br/>
        <input type="phone" placeholder="phone number" name="phone">
        </div>
        <input type="email" placeholder="email address" name="email">
        </div>
        <input type="password" placeholder="password" name="password">
      </div>
      <div id="enviar">
        <input type="button" onclick="Login()" class="botao" value="Login">
        <a href="#">send</a>
      </div>
    </div>
  </div>