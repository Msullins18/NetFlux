package com.example.netflux.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class Movie {
    private String id;
    @NonNull
    private String title;
}
