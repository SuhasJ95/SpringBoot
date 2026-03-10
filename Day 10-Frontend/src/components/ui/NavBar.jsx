function NavBar() {
  return (
    <div className="flex justify-between px-5 py-3 bg-pink-500">
      <div className="flex gap-5">
        <div>LOGO</div>
        <div>JCBM Collgee</div>
      </div>

      <div className="flex gap-5">
        <div>Home</div>
        <div>About Us</div>
        <div>Service</div>
        <div>Products</div>
        <div>Contact Us</div>
      </div>

      <div className="flex gap-5 ">
        <div>Sign Up</div>
        <div>Login</div>
      </div>
    </div>
  );
}

export default NavBar;