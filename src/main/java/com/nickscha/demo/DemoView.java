package com.nickscha.demo;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@ViewScoped
@Named("demo")
public class DemoView implements Serializable {

	private static final long serialVersionUID = -7721195444883246022L;

	@Inject
	DemoService service;

	public String welcomeText() {
		return service.text();
	}

}
