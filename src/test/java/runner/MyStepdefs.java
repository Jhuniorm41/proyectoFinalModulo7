package runner;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Ma;

import java.util.List;
import java.util.Map;

public class MyStepdefs {
    /*  regular expression / cucumber expression
    *  {} --- convertir varias palabras en argumentos
    *  {string}---- convertir una palabra en comillas dobles "valor" como argumento
    *  {int}--- convertir un valor int como argumento
    *  {float}--- convertir valores flotantes como argumento
    *  {word} --- convertir una palabra en argumento
    * */

    @Given("tengo acceso a {}")
    public void tengoAccesoATodoLy(String app) {

    }

    @When("realizo click en el boton login")
    public void realizoClickEnElBotonLogin() {
    }

    @And("ingreso mi correo electronico: {string}")
    public void ingresoMiCorreoElectronico(String email) {
    }

    @And("ingreso mi password: {int}")
    public void ingresoMiPassword(int pwd) {
    }

    @Then("deberia ingresar a la aplicacion")
    public void deberiaIngresarALaAplicacion() {
    }

    @And("los siguientes controles deberian ser mostrados")
    public void losSiguientesControlesDeberianSerMostrados(List<String> controls) {
        for (String control:controls
             ) {
            System.out.println("controls: "+control);
        }

    }

    @And("ingreso a la aplicacion usando")
    public void ingresoALaAplicacionUsando(Map<String,String> crendential ) {
        for (String control:crendential.keySet()
             ) {
            System.out.println(control+ " tiene el valor: "+crendential.get(control));
        }

    }

    @And("me registro a la pagina")
    public void meRegistroALaPagina(Registro registro) {
        System.out.println("address: "+registro.getAddress());
        System.out.println("ci: "+registro.getCi());
        System.out.println("phone: "+registro.getPhone());
        System.out.println("name: "+registro.getName());


    }
    @DataTableType
    public Registro convert(Map<String,String> entity){
        Registro registro= new Registro();
        registro.setName(entity.get("name"))
                .setPhone(entity.get("phone"))
                .setAddress(entity.get("address"))
                .setCi(entity.get("ci"));
        return registro;
    }

}
