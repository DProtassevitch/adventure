package by.adventure.controller;

import by.adventure.entity.News;
import by.adventure.entity.NewsComment;
import by.adventure.service.NewsCommentService;
import by.adventure.service.NewsService;
import by.adventure.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class NewsController {

    private final NewsService newsService;
    private final NewsCommentService commentService;
    private final UserService userService;

    @Autowired
    public NewsController(NewsService newsService, NewsCommentService commentService, UserService userService) {
        this.newsService = newsService;
        this.commentService = commentService;
        this.userService = userService;
    }

    @ModelAttribute("allNews")
    public List<News> allNews() {
        return newsService.getAll();
    }

    @ModelAttribute("comment")
    public NewsComment getComment() {
        return new NewsComment();
    }

    @ModelAttribute
    public News getNews() {
        return new News();
    }


    @GetMapping("/news")
    public String getAllNewsPage() {
        return "news";
    }

    @GetMapping(path = "/news/simple", params = "id")
    public String getSimpleNews(@RequestParam("id") Long id, Model model) {
        model.addAttribute("simpleNews", newsService.getById(id));
        model.addAttribute("comments", newsService.getCommentsByNewsId(id));
        return "news-simple";
    }

    //    todo: проскакивает пустая строка. бд not null, persisn not null!
//    todo: форма не поддерживает UTF-8
    @PostMapping(path = "/news/create/comment", params = "newsId")
    public String createComment(@RequestParam("newsId") Long newsId,
                                NewsComment newsComment) {
//        if (newsComment.getText().isEmpty()) {
        String userName = SecurityContextHolder.getContext().getAuthentication().getName();
        newsComment.setUser(userService.getByLogin(userName));
        newsComment.setNews(newsService.getById(newsId));
        commentService.create(newsComment);
//        }
        return "redirect:/news/simple?id=" + newsId;
    }

    @GetMapping("/news/create")
    public String getNewsCreatePage() {
        return "news-create";
    }

    @PostMapping("/news/create")
    public String createNews(News news) {
        String userName = SecurityContextHolder.getContext().getAuthentication().getName();
        news.setUser(userService.getByLogin(userName));
        newsService.create(news);
        return "redirect:/news";
    }

    @GetMapping(path = "/news/change", params = "newsId")
    public String getNewsChangePage(@RequestParam("newsId") Long newsId,
                                    Model model) {
        model.addAttribute("changedNews", newsService.getById(newsId));
        return "news-change";
    }

    @PostMapping(path = "/news/change", params = "newsId")
    public String changeNews(@RequestParam("newsId") Long newsId,
                             News news){
        news.setId(newsId);
        news.setUser(userService.getByLogin(SecurityContextHolder
                .getContext()
                .getAuthentication()
                .getName()));
        newsService.update(news);
        return "redirect:/news/simple?id=" + news.getId();
    }
}
