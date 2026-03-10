import { FaFacebook, FaInstagram, FaLinkedin } from "react-icons/fa";

function Nav() {
  return (
      <div className="flex justify-between px-5 py-3 text-white">
        <div className="flex gap-5">
          <div>SteveEditor</div>
        </div>

        <div className="flex gap-5">
          <div>Main</div>
          <div>About</div>
          <div>Program</div>
          <div>Price</div>
          <div>Contact</div>
        </div>

        <div className="flex gap-5 text-lg">
          <FaFacebook className="cursor-pointer hover:text-lime-400 transition" />
          <FaLinkedin className="cursor-pointer hover:text-lime-400 transition" />
          <FaInstagram className="cursor-pointer hover:text-lime-400 transition" />
        </div>
      </div>
    
  );
}
export default Nav;
