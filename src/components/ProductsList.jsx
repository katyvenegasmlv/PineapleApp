import { faPencilAlt, faTrash } from "@fortawesome/free-solid-svg-icons";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import ReactHTMLTableToExcel from 'react-html-table-to-excel';

const ProductComponent = ({title, img, Agregar}) => {

  
    return(
        <div >
          <div className="btnexport">
<ReactHTMLTableToExcel
                    id="test-table-xls-button"
                    className="btn btn-outline-success"
                    table="table-to-xls"
                    filename="Product-List"
                    sheet="tableproducts"
                    buttonText="Download List"/>
          </div>          
               
<table id="table-to-xls" class="table table-warnig table-hover">

  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Product</th>
      <th scope="col">Category</th>
      <th scope="col">Description</th>
      <th scope="col">Quantity</th>
      <th scope="col">Unit Price</th>
      <th scope="col">Picture</th>
      <th scope="col">Edit</th>
      <th scope="col">Delete</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>{title}</td>
      <td>Otto</td>
      <td>@mdo</td>
      <td>Mark</td>
      <td>Otto</td>
      <td>{img}</td>
      <td><a id="modificar"  name="modificar" href="ModificarDatos?=ID"   ><FontAwesomeIcon icon={faPencilAlt} /></a></td>
      <td><a id="eliminar" name="eliminar" href="EliminarDatos?ID="><FontAwesomeIcon icon={faTrash} /> </a></td>
    </tr>
    <tr>
      <th scope="row">2</th>
      <td>Jacob</td>
      <td>Thornton</td>
      <td>@fat</td>
    </tr>

  </tbody>
 
</table>
        </div>
    )
}
export default ProductComponent;