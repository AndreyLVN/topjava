package ru.javawebinar.topjava.web;

import org.slf4j.Logger;
import ru.javawebinar.topjava.util.MealsUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static org.slf4j.LoggerFactory.getLogger;


public class MealServlet extends HttpServlet {
    private static final Logger LOG = getLogger(UserServlet.class);

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LOG.debug("redirect to meals");
        LOG.info("getALL");
        request.setAttribute("mealList", MealsUtil.getMealWithExceeded(MealsUtil.MEAL_LIST, 2000));


       request.getRequestDispatcher("/meals.jsp").forward(request, response);

       // List<MealWithExceed> mealsWithExceeded = MealsUtil.getFilteredWithExceeded(MealsUtil.MEAL_LIST, 2000);
        
       // response.sendRedirect("meals.jsp");
    }
}
