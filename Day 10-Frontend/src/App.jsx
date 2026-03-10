import Hero1 from "./components/ui1/Hero1";
import Nav from "./components/ui1/Nav";

function App() {
  return (
    <div
      className="min-h-screen bg-cover bg-center relative"
      style={{
        backgroundImage: "url('/image/Bg.png')",
      }}
    >
      <div className="absolute inset-0 bg-black/60"></div>

      <div className="relative z-10">
        <Nav />
        <Hero1 />
      </div>
    </div>
  );
}

export default App;