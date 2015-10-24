package com.jfixby.tools.bleed.api;

import java.io.IOException;

import com.jfixby.cmns.api.components.ComponentInstaller;

public class TextureBleed {

	static private ComponentInstaller<TextureBleedComponent> componentInstaller = new ComponentInstaller<TextureBleedComponent>(
			"TextureBleed");

	public static final void installComponent(
			TextureBleedComponent component_to_install) {
		componentInstaller.installComponent(component_to_install);
	}

	public static final TextureBleedComponent invoke() {
		return componentInstaller.invokeComponent();
	}

	public static final TextureBleedComponent component() {
		return componentInstaller.getComponent();
	}

	public static TextureBleedSpecs newSpecs() {
		return invoke().newGemserkProcessorSpecs();
	}

	public static TextureBleedResult process(TextureBleedSpecs specs) throws IOException {
		return invoke().process(specs);
	}

}
