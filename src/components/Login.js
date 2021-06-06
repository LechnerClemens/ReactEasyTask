import React, { useState, useEffect } from 'react';

const Login = ({user, submit, setPassword, setEmail, wrongUserOrPassword}) => {
    

    function handleEmailChange(e) {
        e.preventDefault();
        setEmail(e.target.value);
    }
    function handlePasswordChange(e) {
        e.preventDefault();
        setPassword(e.target.value);
    }

   
    
    return (
        <div className="Login">
            <h1 className="LoginText">Login</h1>
            <form className="form" onSubmit={submit}>
                <label className = "input" >Email</label>
                <input className = "input" type="email" onChange={handleEmailChange}/>
                <label className = "input">Password</label>
                <input className = "input" type="password" onChange={handlePasswordChange}/>
                <input className="pointer input btnSubmit" type="submit" value="Submit"/>
            </form>
            {wrongUserOrPassword ? <p className="margintop">Wrong Username or Password</p>:true}
        </div>
    )
}

export default Login
