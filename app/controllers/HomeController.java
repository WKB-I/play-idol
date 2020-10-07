package controllers;

import application.repository.IdolRepository;
import controllers.form.IdolForm;
import models.IdolRepositoryImpl;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;

import javax.inject.Inject;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {
    private final Form<IdolForm> idolForm;
    private final IdolRepository idolRepository;
    private final FormFactory formFactory;

    @Inject
    public HomeController(FormFactory formFactory, IdolRepository idolRepository){
        this.formFactory = formFactory;
        this.idolForm = formFactory.form(IdolForm.class);
        this.idolRepository = idolRepository;
    }

    public Result index() {
        return ok(views.html.index.render(
                "Idol List",
                idolRepository.ListAll()
        ));
    }

}
