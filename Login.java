package demo;

public class Login {
	public String authenticate(String username, String password) {
		if (("rajesh".equalsIgnoreCase(username))
				&& ("5551".equals(password))) {
			return "Success";
		} else
		{
			return "failure";
		}
	}

}
