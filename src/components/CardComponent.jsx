const CardComponent = ({title, img, Agregar}) => {

  
    return(
      <div class="card-group">
  <div class="card">
    <img src={img} class="card-img-top" alt="..."/>
    <div class="card-body">
      <h5 class="card-title">{title}</h5>
      <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
      <button className="btn btn-primary" onClick={(event) => {Agregar(event, title)}}> Agregar al carrito</button>
    </div>
  </div>
  <div class="card">
    <img src={img} class="card-img-top" alt="..."/>
    <div class="card-body">
      <h5 class="card-title">{title}</h5>
      <p class="card-text">This card has supporting text below as a natural lead-in to additional content.</p>
      <button className="btn btn-primary" onClick={(event) => {Agregar(event, )}}> Agregar al carrito</button>
    </div>
  </div>
  <div class="card">
    <img src={img} class="card-img-top" alt="..."/>
    <div class="card-body">
      <h5 class="card-title">{title}</h5>
      <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This card has even longer content than the first to show that equal height action.</p>
      <button className="btn btn-primary" onClick={(event) => {Agregar(event, )}}> Agregar al carrito</button>
    </div>
  </div>
</div>
    )
}
export default CardComponent;