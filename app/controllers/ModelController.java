package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import models.Element;
import models.Model;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import services.ElementService;
import services.ModelService;

import javax.inject.Inject;
import java.util.Set;
import java.util.UUID;

/**
 * @author Manas Bajaj
 *
 * Controller for handling all API requests related to SysML v2 elements
 */
public class ModelController extends Controller {

    private ModelService modelService;

    @Inject
    public ModelController(ModelService modelService) {
        this.modelService = modelService;
    }

    public Result byId(String id) {
        try {
            UUID elementId = UUID.fromString(id);
            Model model = modelService.getById(elementId);
            return ok(Json.toJson(model).toString());
        }
        catch (IllegalArgumentException e) {
            return badRequest("Supplied identifier is not a UUID.");
        }
    }

    public Result all() {
        Set<Model> models = modelService.getAll();
        return ok(Json.toJson(models));
    }

    public Result create() {
        JsonNode requestBodyJson = request().body().asJson();
        Model newModel = Json.fromJson(requestBodyJson, Model.class);
        Model createdModel = modelService.create(newModel);
        if(createdModel!=null)
            return created(Json.toJson(createdModel));
        else
            return badRequest("Mode with the following specification could not be created. \n " + requestBodyJson);
    }
}