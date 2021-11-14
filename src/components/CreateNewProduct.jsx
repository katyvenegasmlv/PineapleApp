const NewProductComponent= ({img}) => {
  
  

    
    return(
<form class="row g-3 needs-validation">
  <div class="col-md-5">
    <label for="validationServer01" class="form-label">Product</label>
    <input type="text" class="form-control" id="validationServer01" placeholder="Pineaple" required/>

  </div>
  <div class="col-md-5">
    <label for="validationServer02" class="form-label">Category</label>
    <input type="text" class="form-control" id="validationServer02" placeholder="Fruit" required/>
  </div>
  <div class="col-md-10">
    <label for="validationServer03" class="form-label">Description</label>
    <input type="text" class="form-control" id="validationServer03" placeholder="Citric" aria-describedby="validationServer03Feedback" required/>
 
  </div>
  <div class="col-md-3">
    <label for="validationServer04" class="form-label">Quantity</label>
    <input type="number" class="form-select" id="validationServer04" placeholder="38" aria-describedby="validationServer04Feedback" required>
    </input>
    </div>

    <div class="col-md-2">
    <label class="form-label">Unit Price</label>
    <input type="number" class="form-select" id="validationServer04" placeholder="87" aria-describedby="validationServer04Feedback" required>
    </input>
    </div>
    <div class="col-md-5">
    <label for="validationServer05" class="form-label">Picture</label>
    <input type="file" class="form-control" id="validationServer05" aria-describedby="validationServer05Feedback" required/>
  </div>

  <div class="col-12">
    <button class="btn btn-outline-success" type="submit">Create</button>
  </div>
</form>
    )
}
export default NewProductComponent;