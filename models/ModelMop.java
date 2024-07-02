// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelMop extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer bone5;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer bone7;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer bone9;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer bone6;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer bone8;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;

	public ModelMop() {
		textureWidth = 32;
		textureHeight = 32;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 1.0F);
		bone.setTextureOffset(21, 18).addBox(0.0F, -1.0F, -6.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.0F, 1.0F, -6.0F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.3927F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(0, 18).addBox(-1.0F, -7.5F, 0.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(2.0F, 23.0F, 0.0F);
		setRotationAngle(bone3, 0.0F, -0.7854F, 0.0F);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 1.0F, -2.0F);
		bone3.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -0.3927F, 0.0F);
		cube_r2.setTextureOffset(21, 15).addBox(-0.9239F, -1.0F, -1.3827F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(1.0F, 2.0F, -2.0F);
		bone3.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.3927F, -0.3927F, 0.0F);
		cube_r3.setTextureOffset(8, 17).addBox(-1.9239F, -7.3536F, -0.3536F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(2.0F, 23.0F, 2.0F);
		setRotationAngle(bone5, 0.0F, -1.5708F, 0.0F);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 1.0F, -2.0F);
		bone5.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, -0.3927F, 0.0F);
		cube_r4.setTextureOffset(16, 20).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(1.0F, 2.0F, -2.0F);
		bone5.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.3927F, -0.3927F, 0.0F);
		cube_r5.setTextureOffset(15, 12).addBox(-2.0F, -7.5F, 0.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, 23.0F, 3.0F);
		setRotationAngle(bone7, 0.0F, -2.3562F, 0.0F);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 1.0F, -2.0F);
		bone7.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, -0.3927F, 0.0F);
		cube_r6.setTextureOffset(19, 12).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(1.0F, 2.0F, -2.0F);
		bone7.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.3927F, -0.3927F, 0.0F);
		cube_r7.setTextureOffset(14, 5).addBox(-2.0F, -7.5F, 0.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(2.0F, 23.0F, 2.0F);
		setRotationAngle(bone9, 0.0F, -1.5708F, 0.0F);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 1.0F, -2.0F);
		bone9.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, -0.3927F, 0.0F);
		cube_r8.setTextureOffset(18, 9).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(1.0F, 2.0F, -2.0F);
		bone9.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.3927F, -0.3927F, 0.0F);
		cube_r9.setTextureOffset(12, 18).addBox(-2.0F, -5.5F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-2.0F, 23.0F, 2.0F);
		setRotationAngle(bone2, 0.0F, 3.1416F, 0.0F);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 1.0F, -2.0F);
		bone2.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, -0.3927F, 0.0F);
		cube_r10.setTextureOffset(18, 6).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(1.0F, 2.0F, -2.0F);
		bone2.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.3927F, -0.3927F, 0.0F);
		cube_r11.setTextureOffset(4, 12).addBox(-2.0F, -7.5F, 0.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-3.0F, 23.0F, 0.0F);
		setRotationAngle(bone4, 0.0F, 2.3562F, 0.0F);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, 1.0F, -2.0F);
		bone4.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, -0.3927F, 0.0F);
		cube_r12.setTextureOffset(18, 3).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(1.0F, 2.0F, -2.0F);
		bone4.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.3927F, -0.3927F, 0.0F);
		cube_r13.setTextureOffset(11, 11).addBox(-2.0F, -7.5F, 0.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-2.0F, 23.0F, -2.0F);
		setRotationAngle(bone6, 0.0F, 1.5708F, 0.0F);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.0F, 1.0F, -2.0F);
		bone6.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, -0.3927F, 0.0F);
		cube_r14.setTextureOffset(17, 17).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(1.0F, 2.0F, -2.0F);
		bone6.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.3927F, -0.3927F, 0.0F);
		cube_r15.setTextureOffset(8, 5).addBox(-2.0F, -7.5F, 0.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0F, 23.0F, -3.0F);
		setRotationAngle(bone8, 0.0F, 0.7854F, 0.0F);

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-3.0F, 0.0F, 2.0F);
		bone8.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, -0.3927F, 0.0F);
		cube_r16.setTextureOffset(0, 0).addBox(0.5F, -22.5F, -0.5F, 1.0F, 17.0F, 1.0F, 0.0F, false);

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.0F, -4.0F, 1.0F);
		bone8.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, -0.3927F, 0.0F);
		cube_r17.setTextureOffset(4, 0).addBox(-3.5F, -1.5F, 0.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.0F, 1.0F, -2.0F);
		bone8.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, -0.3927F, 0.0F);
		cube_r18.setTextureOffset(16, 0).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(1.0F, 2.0F, -2.0F);
		bone8.addChild(cube_r19);
		setRotationAngle(cube_r19, -0.3927F, -0.3927F, 0.0F);
		cube_r19.setTextureOffset(4, 5).addBox(-2.0F, -7.5F, 0.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		bone3.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		bone5.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		bone7.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		bone9.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		bone2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		bone4.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		bone6.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		bone8.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}