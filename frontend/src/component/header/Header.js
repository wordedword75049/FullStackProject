import React from 'react';
// eslint-disable-next-line no-unused-vars
import { Link } from 'react-router-dom';


const Header = () => {
    return (
        <header style={headerStyle}>
            <h1>TodoList</h1>
            <Link style={linkStyle} to="/">Home</Link> | <Link style={linkStyle} to="/about">About</Link>
        </header>
    )
};

const headerStyle = {
    background: "#333",
    color: '#fff',
    textAlign: 'center',
    padding: '10px'
};

// eslint-disable-next-line no-unused-vars
const linkStyle = {
    color: '#fff',
    textDecoration: 'none'
};

export default Header;