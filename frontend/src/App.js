import React, { Component } from 'react';
import './App.css';
import Home from './Home';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import ClientList from './ClientList';
import ClientEdit from "./ClientEdit";

class App extends Component {
  render() {
    return (
        <Router>
          <React.StrictMode>
            <Switch>
              <Route exact path='/'  component={Home}/>
              <Route exact path='/clients'  component={ClientList}/>
              <Route path='/clients/:id' component={ClientEdit}/>
            </Switch>
          </React.StrictMode>
        </Router>
    )
  }
}

export default App;
