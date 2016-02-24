package mypackage;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.form.OnChangeAjaxBehavior;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;

/**
 * Created by te071784 on 24. 2. 2016.
 */
public class HomePage  extends WebPage{
    public HomePage() {
        TextField testField = new TextField("testField", Model.of("Ble"));
        testField.add(new OnChangeAjaxBehavior() {
            @Override
            protected void onUpdate(AjaxRequestTarget target) {
                System.out.println("change");
            }
        });
        add(testField);
    }
}
