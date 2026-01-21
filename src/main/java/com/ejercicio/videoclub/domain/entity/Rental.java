package com.ejercicio.videoclub.domain.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Rental {
    private User user;
    private List<Movie> movieList;
    private int rentalDays;

    public int calculateRentalPrice() {
        int price = 0;
        for (Movie movie : movieList) {
            MovieType movieType = movie.getMovieType();

            switch (movieType) {
                case NEW:
                    return rentalDays * 3000;

                case REGULAR:
                   price = 3 * 3000;
                    if (rentalDays > 3) {
                        price += ( rentalDays- 3) * 3000;
                    }
                    return price;

                case OLD:
                   price = 5 * 3000;
                    if (rentalDays > 5) {
                        price += (rentalDays - 5) * 3000;
                    }
                    return price;
            }
        }
        return price;
    }

    public void addLoyaltyPoints() {
        int totalPoints = 0;

        for(Movie movie : movieList ){
          totalPoints += movie.getMovieType().getLoyaltyPoints();
        }
        user.setLoyaltyPoints(totalPoints);
    }
}
