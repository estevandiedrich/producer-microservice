package com.example.demo;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class User implements Serializable {
    private static final long serialVersionUID = 2779560963397549489L;
	private String userId;
    private String userName;
}
