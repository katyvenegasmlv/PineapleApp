const SingComponent= ({img}) => {
  
  

    
    return(
<form class="row g-3">
  <div class="col-md-5">
    <label for="validationServer01" class="form-label">User</label>
    <input type="email" class="form-control is-valid" id="validationServer01" placeholder="ejemplo@gmail.com" required/>
    <div class="valid-feedback">
      Looks good!
    </div>
  </div>
  <div class="col-md-5">
    <label for="validationServer02" class="form-label">Password</label>
    <input type="password" class="form-control is-valid" id="validationServer02" placeholder="Contraseña420." required/>
    <div class="valid-feedback">
      Looks good!
    </div>
  </div>
  <div class="col-md-5">
    <label for="validationServer03" class="form-label">FirstName</label>
    <input type="text" class="form-control is-invalid" id="validationServer03" placeholder="Maria" aria-describedby="validationServer03Feedback" required/>
    <div id="validationServer03Feedback" class="invalid-feedback">
      Please provide a valid FirstName.
    </div>
  </div>
  <div class="col-md-5">
    <label for="validationServer04" class="form-label">LastName</label>
    <input type="text" class="form-select is-invalid" id="validationServer04" placeholder="Lopez" aria-describedby="validationServer04Feedback" required>
    </input>
    <div id="validationServer04Feedback" class="invalid-feedback">
    Please provide a valid LaststName.
    </div>
  </div>
  <div class="col-12">
    <div class="form-check">
      <div>
        <a  href={'/login'}>Ya tenes cuenta?</a>
      </div>
    </div>
  </div>
  <div class="col-12">
    <button class="btn btn-outline-success" type="submit">Singin</button>
  </div>
</form>
    )
}
export default SingComponent;