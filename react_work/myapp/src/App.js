import logo from './logo.svg';
import './App.css';
import MyDiv from './MyDiv';

function App() {
  return (
    <div className="App">
      <MyDiv a="10" b="홍길동"></MyDiv>
      <MyDiv a="20" b="김길동"></MyDiv>
      <MyDiv a="30" b="이길동"></MyDiv>
      <MyDiv a="40" b="최길동"></MyDiv>
    </div>
  );
}

export default App;
