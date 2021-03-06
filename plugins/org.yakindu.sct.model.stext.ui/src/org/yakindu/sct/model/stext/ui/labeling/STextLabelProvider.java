/*
* generated by Xtext
*/
package org.yakindu.sct.model.stext.ui.labeling;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;
import org.yakindu.sct.model.sgraph.Statechart;

import com.google.inject.Inject;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
public class STextLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	public STextLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	//Labels and icons can be computed like this:
	
	String text(Statechart ele) {
		return ele.getName();
	}

	String text(IEObjectDescription ele) {
		return ele.getName().toString();
	}
	 
	/*
	 * String image(MyModel ele) { return "MyModel.gif"; }
	 */
}
