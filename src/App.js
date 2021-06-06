import React, { useState, useEffect } from 'react';

import Login from "./components/Login"
import Header from "./components/Header"
import './App.css';
import axios from 'axios';

function App() {
  const[loginUser, setLoginUser] = useState({});
  const[email, setEmail] = useState("");
  const[password, setPassword] = useState("");
  const[isLoggedIn, setisLoggedIn] = useState(false);
  const[isWrongUserOrPassword, setisWrongUserOrPassword] = useState(false);
  const[isSubmitted, setisSubmitted] = useState(false);

  useEffect(()=>{
    checkLogin();
  },[loginUser, isSubmitted])


  function handleSubmit(e) {
    e.preventDefault();
    axios.get(`http://localhost:8082/users/login?email=${email}&password=${password}`)
    .then(res => {
      setLoginUser(res.data); 
    })
    setisSubmitted(true);
  }
  function checkLogin(){
    if(loginUser["email"] === email && loginUser["password"] === password)
    {
      setisLoggedIn(true);
    }
    else if(isSubmitted)
    {
      setisWrongUserOrPassword(true);
    }  
  }


  return (
    <div className="App">
      <Header isLoggedIn={isLoggedIn} username={loginUser["firstname"]}/>
      {isLoggedIn === false ? <Login setEmail={setEmail} setPassword={setPassword} submit={handleSubmit} wrongUserOrPassword={isWrongUserOrPassword}/> : true}
    </div>
  );
}

export default App;
