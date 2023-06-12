import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import '../styles/login.css';
import axios from 'axios';
import sam2 from "../Assests/login.png"
import Navbar from './Navbar';

const Login = () => {
  const [loginData, setLoginData] = useState({
    username: '',
    password: '',
  });

  const [showPassword, setShowPassword] = useState(false);

  const navigate = useNavigate();

  const handleLoginChange = (e) => {
    setLoginData({ ...loginData, [e.target.name]: e.target.value });
  };

  const handleLogin = (e) => {
    e.preventDefault();
    navigate('/h');
    axios
      .post(`http://localhost:8080/api/books/login`, loginData)
      .then((response) => {
        console.log(response.data);
              })
      .catch((error) => {
         // Log the error response from the server
        // Display an appropriate error message to the user
        
        
      });
  };

  const toggleShowPassword = () => {
    setShowPassword(!showPassword);
  };

  return (
    <>
    <Navbar/>
      <div className="background-image">
        <img src={sam2} alt="Background" />
      </div>
      <div className="login-container">
        <div className="login-box">
          <form>
            <div className="user-box">
              <input
                type="text"
                name="username"
                required
                placeholder="Username"
                value={loginData.username}
                onChange={handleLoginChange}
              />
              <label>Username</label>
            </div>
            <div className="user-box">
              <input
                type={showPassword ? 'text' : 'password'}
                name="password"
                required
                placeholder="Password"
                value={loginData.password}
                onChange={handleLoginChange}
              />
              <label>Password</label>
            </div>
            <div className="show-password-container">
              <input
                type="checkbox"
                id="showPassword"
                checked={showPassword}
                onChange={toggleShowPassword}
              />
              <label htmlFor="showPassword">Show Password</label>
            </div>
            <center>
              <button className='login_button' onClick={handleLogin}>
                SUBMIT
              </button>
            </center>
          </form>
        </div>
      </div>
    </>
  );
};

export default Login;
