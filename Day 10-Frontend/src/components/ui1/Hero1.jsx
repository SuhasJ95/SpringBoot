function Hero1() {
  return (
    <section className="relative flex w-full justify-center items-center min-h-screen py-14 overflow-hidden">
      <div className="z-10 text-center flex flex-col items-center px-5 max-w-6xl">
        <h1 className="text-5xl md:text-6xl lg:text-7xl font-bold text-white leading-[1.05] tracking-wide">
          EDIT LIKE A PRO <br />
          AND MAKE MONEY
        </h1>

        <p className="text-gray-300 max-w-3xl mx-auto mt-6 leading-relaxed text-lg md:text-xl font-semibold">
          This is an intensive program designed for those who want to master the
          skills of professional editing and graphic design
        </p>

        <button className="mt-8 px-12 py-3 bg-lime-400 text-black rounded-full font-semibold hover:scale-105 transition duration-300">
          Order
        </button>

        <div className="flex gap-8 mt-20">
          <div className="-rotate-12 bg-black/70 text-white px-6 py-3 rounded-xl shadow-lg flex items-center gap-3">
            <div className="bg-purple-600 px-2 py-1 rounded text-xs">PR</div>
            <div>Premiere Pro</div>
          </div>

          <div className="rotate-6 bg-black/70 text-white px-6 py-3 rounded-xl shadow-lg flex items-center gap-3">
            <div className="bg-blue-600 px-2 py-1 rounded text-xs">PS</div>
            <div>Photoshop</div>
          </div>

          <div className="rotate-12 bg-black/70 text-white px-6 py-3 rounded-xl shadow-lg flex items-center gap-3">
            <div className="bg-indigo-600 px-2 py-1 rounded text-xs">AE</div>
            <div>After Effects</div>
          </div>
        </div>
      </div>
    </section>
  );
}

export default Hero1;
