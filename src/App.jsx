import {BrowserRouter, Switch, Route} from 'react-router-dom';
import './App.css';
import InfoLogin from './containers/login';
import InfoSingin from './containers/singin';
import HomeContainer from './containers/HomeContainer';
import ProductsContainer from './containers/ProductsContainer';
import { EcommerceProvider } from './context/EcommerceContext';
import UserCont from './containers/UserContainer';






const App= () => {
  return (
    <div className="App">
      <BrowserRouter>
      <EcommerceProvider>
      <Switch>
        <Route exact path="/productos">
          <ProductsContainer/>
        </Route>
        <Route path="/productos/:busqueda">
          <ProductsContainer/>
        </Route>
        <Route path="/login">
          <InfoLogin/>
        </Route>
        <Route path="/singin">
          <InfoSingin/>
        </Route>
        <Route exact path="/">
          <HomeContainer/>
        </Route>
        <Route path="/home">
          <HomeContainer/>
        </Route>
        <Route path="/user">
          <UserCont/>
        </Route>
      </Switch>
      
      </EcommerceProvider>
      </BrowserRouter>
    </div>
  );
}

export default App;
