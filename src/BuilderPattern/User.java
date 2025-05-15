package BuilderPattern;

public class User {

    private String name;
    private String id;
    private String address;
    private String email;
    private String phone;


    private User(Builder builder) {

        this.name = builder.name;
        this.id = builder.id;
        this.address = builder.address;
        this.email = builder.email;
        this.phone = builder.phone;
    }


    public String getName() {
        return name;
    }


    public String getId() {
        return id;
    }


    public String getAddress() {
        return address;
    }


    public String getEmail() {
        return email;
    }


    public String getPhone() {
        return phone;
    }


    @Override
    public String toString() {
        return "User [name=" + name + ", id=" + id + ", address=" + address + ", email=" + email + ", phone=" + phone
                + "]";
    }


    public static class Builder {
        private String name;
        private String id;
        private String address;
        private String email;
        private String phone;

        public Builder() {

        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }


        public User build() {
            return new User(this);
        }

    }

}
