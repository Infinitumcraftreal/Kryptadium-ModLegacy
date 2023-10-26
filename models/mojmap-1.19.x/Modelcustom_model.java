// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcustom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart head;
	private final ModelPart torso;
	private final ModelPart left_arm;
	private final ModelPart right_arm;
	private final ModelPart left_leg;
	private final ModelPart right_leg;

	public Modelcustom_model(ModelPart root) {
		this.head = root.getChild("head");
		this.torso = root.getChild("torso");
		this.left_arm = root.getChild("left_arm");
		this.right_arm = root.getChild("right_arm");
		this.left_leg = root.getChild("left_leg");
		this.right_leg = root.getChild("right_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(52, 30)
						.addBox(-5.0F, -27.0F, -4.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(52, 30)
						.addBox(-1.0F, -24.0F, -6.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -10.0F, -1.0F));

		PartDefinition torso = partdefinition.addOrReplaceChild("torso",
				CubeListBuilder.create().texOffs(52, 50)
						.addBox(-8.0F, -11.0F, -2.0F, 16.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-11.0F, -30.0F, -4.0F, 22.0F, 19.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 3.0F, -1.0F));

		PartDefinition torso8_r1 = torso.addOrReplaceChild("torso8_r1",
				CubeListBuilder.create().texOffs(33, 93).addBox(-1.1F, -0.9788F, 0.4672F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -21.0F, -5.0F, 2.7053F, 0.0F, -1.5708F));

		PartDefinition torso7_r1 = torso.addOrReplaceChild("torso7_r1",
				CubeListBuilder.create().texOffs(41, 85).addBox(-1.1F, -2.9788F, 2.4672F, 2.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -21.0F, -5.0F, 2.1817F, 0.0F, -1.5708F));

		PartDefinition torso6_r1 = torso.addOrReplaceChild("torso6_r1",
				CubeListBuilder.create().texOffs(67, 96).addBox(-1.1F, -3.3F, -2.0F, 2.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -21.0F, -5.0F, 1.1781F, 0.0F, -1.5708F));

		PartDefinition torso5_r1 = torso.addOrReplaceChild("torso5_r1",
				CubeListBuilder.create().texOffs(99, 8).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.226F, -4.0765F, -2.2689F, 0.0F, 0.0F));

		PartDefinition torso18_r1 = torso.addOrReplaceChild("torso18_r1",
				CubeListBuilder.create().texOffs(90, 70).addBox(3.0F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8265F, -18.0249F, -4.8013F, 1.7059F, 0.0688F, -2.5796F));

		PartDefinition torso17_r1 = torso.addOrReplaceChild("torso17_r1",
				CubeListBuilder.create().texOffs(90, 70).addBox(1.5F, 6.5F, 2.0F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8908F, -23.3084F, -11.8335F, 1.5719F, 0.1515F, 2.6082F));

		PartDefinition torso16_r1 = torso.addOrReplaceChild("torso16_r1",
				CubeListBuilder.create().texOffs(90, 70).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.1268F, -23.2405F, -4.8577F, 1.4579F, -0.1013F, 0.3013F));

		PartDefinition torso15_r1 = torso.addOrReplaceChild("torso15_r1",
				CubeListBuilder.create().texOffs(100, 40).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 2.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -23.661F, -6.3852F, -1.3294F, 1.0438F, 2.545F));

		PartDefinition torso4_r1 = torso.addOrReplaceChild("torso4_r1",
				CubeListBuilder.create().texOffs(99, 23).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -23.661F, -6.3852F, 2.0508F, 0.0F, 0.0F));

		PartDefinition torso3_r1 = torso.addOrReplaceChild("torso3_r1",
				CubeListBuilder.create().texOffs(0, 84).addBox(-2.0F, -7.0F, -2.0F, 4.0F, 8.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -21.0F, -5.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition torso13_r1 = torso.addOrReplaceChild("torso13_r1",
				CubeListBuilder.create().texOffs(103, 72).addBox(-1.5F, -1.5F, -5.5F, 3.0F, 3.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5023F, -16.8793F, 10.1197F, -0.2878F, -0.5244F, -1.3543F));

		PartDefinition torso14_r1 = torso.addOrReplaceChild("torso14_r1",
				CubeListBuilder.create().texOffs(103, 85).addBox(-1.5F, -1.5F, -4.5F, 3.0F, 3.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.3632F, -17.0064F, 10.1153F, -0.3427F, 0.235F, -1.5622F));

		PartDefinition torso12_r1 = torso.addOrReplaceChild("torso12_r1",
				CubeListBuilder.create().texOffs(34, 101).addBox(-1.5F, -1.5F, -4.5F, 2.0F, 2.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9419F, -25.518F, 7.5449F, -0.0809F, 0.235F, -1.5622F));

		PartDefinition torso11_r1 = torso.addOrReplaceChild("torso11_r1",
				CubeListBuilder.create().texOffs(6, 113).addBox(-0.5F, -0.5F, -4.0F, 3.0F, 3.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0779F, -19.0544F, 8.659F, 0.0712F, 0.2381F, -0.9332F));

		PartDefinition torso10_r1 = torso.addOrReplaceChild("torso10_r1",
				CubeListBuilder.create().texOffs(78, 92).addBox(-2.5F, -2.5F, -6.0F, 5.0F, 5.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.5F, -27.9837F, 9.6711F, 0.6686F, 0.1624F, -0.3591F));

		PartDefinition torso9_r1 = torso.addOrReplaceChild("torso9_r1",
				CubeListBuilder.create().texOffs(102, 58).addBox(2.5F, -3.5F, -5.0F, 5.0F, 5.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, -27.5F, 11.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(26, 30)
				.addBox(-2.0F, -17.0F, -3.0F, 6.0F, 45.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(13.0F, -10.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(0, 30)
				.addBox(-4.0F, -17.0F, -3.0F, 6.0F, 45.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-13.0F, -10.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(66, 0)
				.addBox(-4.0F, -11.0F, -2.0F, 6.0F, 24.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.0F, 11.0F, -1.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create()
				.texOffs(52, 64).addBox(-2.0F, -11.0F, -2.0F, 6.0F, 24.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-6.0F, 11.0F, -1.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.right_arm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.left_arm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}