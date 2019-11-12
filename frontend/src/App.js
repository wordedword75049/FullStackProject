import React from 'react';
// eslint-disable-next-line no-unused-vars
import logo from './logo.svg';
import './App.css';
// eslint-disable-next-line no-unused-vars
import Header from "./component/header/Header";
// eslint-disable-next-line no-unused-vars
import {Router} from "react-router-dom";
// eslint-disable-next-line no-unused-vars
import About from "./component/pages/About";
import AddTodo from "./component/AddTodo";
import Todos from "./component/Todos";
import axios from "axios";
import {SERVER_URL} from "./util/StringUtil";

class App extends React.Component {
    state = {
        todos: []
    };

    componentDidMount() {
        axios.get(SERVER_URL + '/allusers')
            .then(res => this.setState({ todos: res.data }));
    }

    // Toggle Complete
    markComplete = (id) => {
        this.setState({
            todos: this.state.todos.map(todo => {
                if(todo.id === id)
                    todo.completed = !todo.completed;
                return todo;
            })
        });
    };

    // Delete Todo
    delTodo = (id) => {
        axios.delete(SERVER_URL + '/allusers')
            .then(res => this.setState({ todos: [...this.state.todos.filter(todo => todo.id !== id)]}));
    };

    addTodo = (title) => {
        /*
        const newTodo = {
          id: uuid.v4(),
          title: title,
          completed: false
        }
        this.setState({ todos: [...this.state.todos, newTodo]})
        */
        axios.post(SERVER_URL + '/allusers', {
            name: title,
            id: 1
        })
            .then(res => this.setState({
                todos: [...this.state.todos, res.data]
            }));
    };

    render() {
        return (
                <div className="App">
                    <div className="container">
                        <br />
                            <React.Fragment>
                                <AddTodo addTodo={this.addTodo} />
                                <Todos todos={this.state.todos} markComplete = {this.markComplete} delTodo={this.delTodo}/>
                            </React.Fragment>

                    </div>
                </div>
        );
    }
}

export default App;
