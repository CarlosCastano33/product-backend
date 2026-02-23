// src/main/java/.../models/AuthenticationRequestDto.java
package com.udea.product.model;

import java.io.Serializable;

public record AuthenticationRequestDto(String username, String password) implements Serializable {}