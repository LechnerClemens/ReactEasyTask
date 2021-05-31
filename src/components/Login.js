

const Login = () => {
    return (
        <div className="Login">
            <h1 className="LoginText">Login</h1>
            <form className="form">
                <label className = "input">Email</label>
                <input className = "input" type="email"/>
                <label className = "input">Password</label>
                <input className = "input" type="password"/>
                <input className="pointer input btnSubmit" type="submit" value="Submit" onClick/>
            </form>
        </div>
    )
}

export default Login
