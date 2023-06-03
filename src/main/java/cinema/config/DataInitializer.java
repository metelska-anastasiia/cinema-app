package cinema.config;

import cinema.model.Role;
import cinema.model.User;
import cinema.service.CinemaHallService;
import cinema.service.MovieService;
import cinema.service.MovieSessionService;
import cinema.service.OrderService;
import cinema.service.RoleService;
import cinema.service.ShoppingCartService;
import cinema.service.UserService;
import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private final RoleService roleService;
    private final UserService userService;
    private final MovieService movieService;
    private final CinemaHallService cinemaHallService;
    private final MovieSessionService movieSessionService;
    private final ShoppingCartService shoppingCartService;
    private final OrderService orderService;

    public DataInitializer(RoleService roleService, UserService userService,
                           MovieService movieService, CinemaHallService cinemaHallService,
                           MovieSessionService movieSessionService,
                           ShoppingCartService shoppingCartService, OrderService orderService) {
        this.roleService = roleService;
        this.userService = userService;
        this.movieService = movieService;
        this.cinemaHallService = cinemaHallService;
        this.movieSessionService = movieSessionService;
        this.shoppingCartService = shoppingCartService;
        this.orderService = orderService;
    }

    @PostConstruct
    public void inject() {
        Role adminRole = new Role();
        adminRole.setRoleName(Role.RoleName.ADMIN);
        roleService.add(adminRole);
        Role userRole = new Role();
        userRole.setRoleName(Role.RoleName.USER);
        roleService.add(userRole);
        User admin = new User();
        admin.setEmail("admin@i.ua");
        admin.setPassword("Admin123");
        admin.setRoles(Set.of(adminRole));
        userService.add(admin);
        User user = new User();
        user.setEmail("user@i.ua");
        user.setPassword("User123");
        user.setRoles(Set.of(userRole));
        userService.add(user);
    }
}
