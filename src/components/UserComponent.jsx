import { faPencilAlt, faTrash } from "@fortawesome/free-solid-svg-icons";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import ReactHTMLTableToExcel from 'react-html-table-to-excel';

const UserComponent= ({img}) => {
  
  

    
    return(
        <div> 
         <div className="btnexport">
          <ReactHTMLTableToExcel
            id="test-table-xls-button"
            className="btn btn-outline-success"
            table="table-to-xls-user"
            filename="User-List"
            sheet="tableUser"
            buttonText="Download List"/>
         </div>          
                       
<table id="table-to-xls-user" class="table table-warnig table-hover">

  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">User</th>
      <th scope="col">First</th>
      <th scope="col">Last</th>
      <th scope="col">Edit</th>
      <th scope="col">Delete</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>Mark</td>
      <td>Otto</td>
      <td>@mdo</td>
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
export default UserComponent;