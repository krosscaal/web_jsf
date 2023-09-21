package com.krossft;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;
import javax.faces.event.AjaxBehaviorEvent;

@ManagedBean(name = "testAppBean", eager = true)
public class TestApp {

    @ManagedProperty(value = "#{pessoa}")
    private Person personBean;

    public TestApp(){
        System.out.println("Chamando ManagedBean -> TestApp");
    }

    public void setPersonBean(Person person){
        this.personBean = person;
    }


    public String sayHello(){
        return "Hello from JSF";
    }

    public String getPersonName(){
        if(personBean != null && personBean.getNome() != null){
            return personBean.getNome();
        }
        personBean.setNome("Krossby Adhemar");
        return personBean.getNome();
    }

    public String getPersonInfo(){
        if(personBean != null
                && personBean.getNome() != null
                && personBean.getCpf() != null
                && personBean.getEmail() != null){

            return personBean.toString();
        }
        personBean.setNome("Krossby Adhemar");
        personBean.setEmail("Kross@gmail.com");
        personBean.setCpf("71500000015");
        return personBean.toString();
    }

    public void onClickBinding(ActionEvent actionEvent){
        System.out.println("Event click Binded!");
        System.out.println(personBean.toString());
    }

    public void inputChange(AjaxBehaviorEvent event){
        System.out.println("Event input change");
    }
}
