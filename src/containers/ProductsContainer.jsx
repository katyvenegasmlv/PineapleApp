import { buildQueries } from "@testing-library/dom";
import { useContext, useEffect, useState } from "react";
import { useParams } from "react-router";
import CardComponent from "../components/CardComponent";
import InfoBarComponent from "../components/InfoBar";
import { EcommerceContext } from "../context/EcommerceContext";
import NavComponent from "../components/NavComponent";



const ProductsContainer = () => {
  const [searchProduct]= useState();
    const [carrito, setCarrito] = useState([])
    const [products, setProducts] = useState([]);
    const data = useContext(EcommerceContext);
    console.log(data);
    const {busqueda} = useParams();

    useEffect(() => {
      console.log(busqueda)
       
    return() => {
        console.log("Fin de componente");
    }
    });


    const Agregar= (event, products)=>{
      carrito.push(products);
      setCarrito([...carrito]);
    }
    const handleKeyUp= (e)=> {
      console.log(e.target.value);
      const productFilter= products.filter(element =>{ 
        if (element.title.toUpperCase().match(e.target.value.toUpperCase())){
          return true
        }
        return false;
        
      })
      setProducts(productFilter);
    }

    return(
        <div className="container">
          <NavComponent/>
          <InfoBarComponent carrito={carrito} handleKeyUp={handleKeyUp}/>
            <div clasName="row">
                {products.map((element, index) =>{
                  
                    return( 
                     <div key={index}>
                      <CardComponent title={element.name} img={element.img} Agregar={Agregar}/>
                      
                      </div>
                    )
                })}
        <CardComponent title={'Shoe'} img="https://viamo.vteximg.com.br/arquivos/ids/238162-1800-2300/VC07021CV009.jpg?v=637643096288200000" Agregar={Agregar}/>
        <CardComponent title={'Bag'} img="https://static.dafiti.com.ar/p/prune-6577-880085-1-zoom.jpg"  Agregar={Agregar}/>
      
      </div>
      </div>
    )
}
export default ProductsContainer;