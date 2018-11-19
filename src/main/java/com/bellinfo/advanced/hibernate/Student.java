package com.bellinfo.advanced.hibernate;

import javax.persistence.*;
@Entity(name = "StudentDetails")
public class Student {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        int id;

        @Column(name = "Studname")
        String name;

        @Column(name = "course")
        String course;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCourse() {
            return course;
        }

        public void setCourse(String course) {
            this.course = course;
        }

        @Override
        public String toString() {
            return "student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", course='" + course + '\'' +
                    '}';
        }
    }

