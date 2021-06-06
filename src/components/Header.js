import React from 'react'
import logo from "../resources/logo.PNG"
import {AiOutlineUser} from "react-icons/ai";
const Header = ({isLoggedIn, username}) => {
    return (
        <div>
            <div className="topheaderdiv"><img src={logo} alt="logo"/></div>
            <div className="headerBar">
                {isLoggedIn ? <div>
                    <button className="headerbutton marginleft">test</button>
                    <p className="user">{username}</p><AiOutlineUser color="white" className="icon"/>
                
                </div>:true}
            </div>
            
        </div>
    )
}

export default Header
