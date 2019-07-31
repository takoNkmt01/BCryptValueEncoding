import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class CLBCryptPasswordEncoder {

	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

		String password = "password";
		String encodingPassword = encoder.encode("password");

		System.out.println(encoder.encode(password));

		if(encoder.matches(password, encodingPassword)) {
			System.out.println("一致");
		} else {
			System.out.println("不一致");
		}
	}
}