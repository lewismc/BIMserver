package org.bimserver.o3d;

import net.xeoh.plugins.base.annotations.PluginImplementation;

import org.bimserver.plugins.serializers.EmfSerializer;
import org.bimserver.plugins.serializers.SerializerPlugin;

@PluginImplementation
public class O3dJsonSerializerPlugin implements SerializerPlugin {

	@Override
	public EmfSerializer createSerializer() {
		return new O3dJsonSerializer();
	}

	@Override
	public String getDescription() {
		return "O3dJsonSerializerPlugin";
	}

	@Override
	public String getName() {
		return "O3dJsonSerializerPlugin";
	}

	@Override
	public String getVersion() {
		return "1.0";
	}

	@Override
	public void init() {
	}

	@Override
	public String getDefaultSerializerName() {
		return "O3D_JSON";
	}
}