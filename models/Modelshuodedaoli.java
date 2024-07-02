// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelshuodedaoli extends EntityModel<Entity> {
	private final ModelRenderer bb_main;

	public Modelshuodedaoli() {
		textureWidth = 60;
		textureHeight = 37;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 20).addBox(-15.0F, -17.0F, 0.0F, 30.0F, 17.0F, 0.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-15.0F, -37.0F, 0.0F, 30.0F, 20.0F, 0.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}