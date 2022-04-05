package com.example.lab2;

public class Employee5  {

        private String id;
        private String fullName;
        private boolean manager;

        public Employee5(String id, String fullName, boolean manager) {
            this.id = id;
            this.fullName = fullName;
            this.manager = manager;
        }

        public Employee5() {
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public boolean getManager() {
            return manager;
        }

        public void setManager(boolean manager) {
            this.manager = manager;
        }


}
