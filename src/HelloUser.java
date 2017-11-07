class HelloUser{
	private String userName;
	
	public HelloUser(String name) {
		userName = name;
	}
	
	public String greetUser() {
		return "Hello "+userName+'!';
	}
}