import React from "react";
import { ClassClicker } from "./components/class/clicker/ClassClicker";
import { FunctionClicker } from "./components/function/clicker/FunctionClicker";
/**
 * This is the starting point of your development, here we will
 * add in the components for the application. We start by importing
 * React, extending the Component class in React and giving the generics
 * for it. The generics are for state and props that we will go over later.
 *
 * the render function must be overridden, this tells React what to render
 * to the virtual dom.
 */
class App extends React.Component<any, any> {
  render() {
    return (
      <div>
        <p>2009</p>
        <ClassClicker />
        <FunctionClicker />
      </div>
    );
  }
}

export default App;
