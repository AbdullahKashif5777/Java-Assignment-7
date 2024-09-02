package pointofsale;

public class Employee {

    private String name;
    private String userId;
    private String password;
    private String cnic;
    private String ph_no;

    public Employee() {
    }

    public Employee(String name, String userId, String password, String cnic, String ph_no) {
        this.name = name;
        this.userId = userId;
        this.password = password;
        this.cnic = cnic;
        this.ph_no = ph_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        if (userId == null || userId.trim().isEmpty()) {
            throw new IllegalArgumentException("Employee ID cannot be empty");
        }
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password == null || password.trim().isEmpty()) {
            throw new IllegalArgumentException("Password cannot be empty.");
        }
        if (password.length() < 8) {
            throw new IllegalArgumentException("Password must be at least 8 characters long.");
        }
        if (!password.matches(".*[\\d].*")) {
            throw new IllegalArgumentException("Password must contain at least one digit.");
        }
        if (!password.matches(".*[@$&#!].*")) {
            throw new IllegalArgumentException("Password must contain at least one special character: @, $, &, #.");
        }
        this.password = password;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        if (cnic == null || cnic.trim().isEmpty()) {
            throw new IllegalArgumentException("CNIC cannot be empty.");
        }
        if (cnic.length() != 13) {
            throw new IllegalArgumentException("CNIC must be exactly 13 characters long.");
        }
        if (!cnic.matches("\\d{13}")) {
            throw new IllegalArgumentException("CNIC must contain only digits.");
        }
        this.cnic = cnic;
    }

    public String getPh_no() {
        return ph_no;
    }

    public void setPh_no(String ph_no) {
        if (ph_no == null || ph_no.trim().isEmpty()) {
            throw new IllegalArgumentException("Phone number cannot be empty.");
        }
        if (ph_no.length() != 11) {
            throw new IllegalArgumentException("Phone number must be exactly 11 characters long.");
        }
        if (!ph_no.startsWith("03")) {
            throw new IllegalArgumentException("Phone number must start with '03'.");
        }
        if (!ph_no.matches("\\d{11}")) {
            throw new IllegalArgumentException("Phone number must contain only digits.");
        }
        this.ph_no = ph_no;
    }

    public boolean isValid() {
        if (ph_no == null || ph_no.trim().isEmpty() || ph_no.length() != 11 || !ph_no.startsWith("03")
                || !ph_no.matches("\\d{11}") || !cnic.matches("\\d{13}") || cnic.length() != 13 || cnic == null || cnic.trim().isEmpty()
                || !password.matches(".*[@$&#!].*") || !password.matches(".*[\\d].*") || password.length() < 8 || password == null || password.trim().isEmpty()
                || userId == null || userId.trim().isEmpty() || name == null || name.trim().isEmpty()) {
            return false;
        }
        return true;
    }

}
