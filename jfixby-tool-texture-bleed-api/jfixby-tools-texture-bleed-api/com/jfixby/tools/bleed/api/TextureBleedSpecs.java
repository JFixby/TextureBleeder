package com.jfixby.tools.bleed.api;

import com.jfixby.cmns.api.filesystem.File;

public interface TextureBleedSpecs {

	File getInputFolder();

	void setInputFolder(File input_folder);

	boolean getDebugMode();

	void setDebugMode(boolean flag);

	int getMaxScans();

	void setMaxScans(int maxScans);

}