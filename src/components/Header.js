import React from 'react'
import logo from "../resources/logo.PNG"
import {AiOutlineUser} from "react-icons/ai";
const Header = ({isLoggedIn, username, logout,whichButtonPressed,handleNewPage}) => {
    return (
        <div>
            <div className="topheaderdiv"><img src={logo} alt="logo"/></div>
            <div className="headerBar">
                {isLoggedIn ? <div>
                    <button className="headerbutton marginleft">Home</button>
                    {whichButtonPressed === "My Tasks" ? <button className="headerbutton" style={{background:"#5e5c5c"}}>My Tasks</button>:<button className="headerbutton" value="My Tasks" onClick={handleNewPage}>My Tasks</button>}
                    {whichButtonPressed === "Create Task" ? <button className="headerbutton" style={{background:"#5e5c5c"}}>Create Task</button>: <button className="headerbutton" value ="Create Task" onClick={handleNewPage}>Create Task</button>}
                    {whichButtonPressed === "Approve Tasks" ?<button className="headerbutton"style={{background:"#5e5c5c"}}>Approve Tasks</button>:<button className="headerbutton" value ="Approve Tasks" onClick={handleNewPage}>Approve Tasks</button>}
                    {whichButtonPressed === "Active Tasks" ?<button className="headerbutton"style={{background:"#5e5c5c"}}>Active Tasks</button>:<button className="headerbutton" value ="Active Tasks" onClick={handleNewPage}>Active Tasks</button>}
                    {whichButtonPressed === "Denied Tasks" ?<button className="headerbutton"style={{background:"#5e5c5c"}}>Denied Tasks</button>:<button className="headerbutton" value ="Denied Tasks" onClick={handleNewPage}>Denied Tasks</button>}
                    {whichButtonPressed === "Done Tasks" ?<button className="headerbutton"style={{background:"#5e5c5c"}}>Done Tasks</button>:<button className="headerbutton" value ="Done Tasks" onClick={handleNewPage}>Done Tasks</button>}
                    {whichButtonPressed === "Others Tasks" ?<button className="headerbutton"style={{background:"#5e5c5c"}}>Others Tasks</button>:<button className="headerbutton" value ="Others Tasks" onClick={handleNewPage}>Others Tasks</button>}
                    {whichButtonPressed === "Team" ?<button className="headerbutton"style={{background:"#5e5c5c"}}>Team</button>:<button className="headerbutton" value ="Team" onClick={handleNewPage}>Team</button>}
                    {whichButtonPressed === "Register New User" ?<button className="headerbutton"style={{background:"#5e5c5c"}}>Register New User</button>:<button className="headerbutton" value ="Register New User" onClick={handleNewPage}>Register New User</button>}
                    <p className="user">{username}</p><AiOutlineUser color="white" className="icon"/>
                    <button className="logoutbutton" onClick={logout}>logout</button>
                
                </div>:true}
            </div>
            
        </div>
    )
}

export default Header
