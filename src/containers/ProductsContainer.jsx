import { buildQueries } from "@testing-library/dom";
import { useContext, useEffect, useState } from "react";
import  { useParams } from "react-router-dom";
import CardComponent from "../components/CardComponent";
import InfoBarComponent from "../components/InfoBar";
import { EcommerceContext } from "../context/EcommerceContext";
import NavComponent from "../components/NavComponent";
import ProductComponent from "../components/ProductsList";


const ProductsContainer = () => {
  const [searchProduct]= useState();
    const [carrito, setCarrito] = useState([])
    const [products, setProducts] = useState([]);
    const data = useContext(EcommerceContext);
    console.log(data);
    const {busqueda} = useParams();

    useEffect(async() => {
      let data = await fetch('http//localhost:8080/product/GetProducts')
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
          <a href={'/newproduct'} className="aTitulo">Create a new Product </a>
          <ProductComponent/>
            <div clasName="row">
                {products.map((element, index) =>{
                  
                    return( 
                     <div key={index}>
                      <CardComponent products={element.name} img={element.img} Agregar={Agregar}/>
                      
                      </div>
                    )
                })}
        
      </div>
      </div>
    )
}
export default ProductsContainer;