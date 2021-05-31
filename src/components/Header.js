import React from 'react'
import logo from "../resources/logo.PNG"
const Header = () => {
    return (
        <div>
            <img src={logo} alt="logo"/>
            <div className="headerBar"></div>
        </div>
    )
}

export default Header
