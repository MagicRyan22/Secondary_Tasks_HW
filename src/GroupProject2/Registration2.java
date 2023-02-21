package GroupProject2;

public class Registration2 {
        private String email;
        private String userName;
        private String password;

        public void setEmail(String email) {
            if (email.endsWith("@yahoo.com")) {
                this.email = email;
            }
        }

        public void setUserName(String userName) {
            if (!userName.isEmpty() && userName.length() > 6 && !password.contains(userName)) {
                this.userName = userName;
            }
        }

        public void setPassword(String password) {
            if (!password.isEmpty() && password.length() > 6 && !password.contains(userName)) {
                this.password = password;
            }
        }
}

