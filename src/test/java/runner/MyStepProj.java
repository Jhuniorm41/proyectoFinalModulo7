package runner;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import page.LeftSection;

public class MyStepProj {
    LeftSection leftSection = new LeftSection();

    @When("yo creo un projecto con el nombre {string}")
    public void yoCreoUnProjectoConElNombre(String nameProj) {
        leftSection.addNewProjectButton.click();
        leftSection.newProjectTextBox.writeText(nameProj);
        leftSection.addButton.click();
    }

    @Then("el projecto {string} deberia ser mostrado")
    public void elProjectoDeberiaSerMostrado(String nameProj) {
        Assertions.assertTrue(leftSection.isNameProjectDisplayed(nameProj),
                               "ERROR el proyecto no es mostrado");
    }

    @When("yo actualizo el projecto {string} con el nombre {string}")
    public void yoActualizoElProjectoConElNombre(String nameProjOld, String nameProjUpdate) {
        leftSection.clickNameProject(nameProjOld);
        leftSection.menuButton.click();
        leftSection.editOption.click();
        leftSection.editProjectTextBox.writeText(nameProjUpdate);
        leftSection.saveButton.click();
    }
}
