package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.SubmitNodeCollection.class)
public class SubmitNodeCollection1361180734Mixin {
        @Inject(at = @At("HEAD"), method = "submitText(Lcom/mojang/blaze3d/vertex/PoseStack;FFLnet/minecraft/util/FormattedCharSequence;ZLnet/minecraft/client/gui/Font$DisplayMode;IIII)V", cancellable = true)
    private void submitText__845950748(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-845950748L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitItem(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/world/item/ItemDisplayContext;III[ILjava/util/List;Lnet/minecraft/client/renderer/item/ItemStackRenderState$FoilType;)V", cancellable = true)
    private void submitItem__939861453(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-939861453L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "allPhases()Ljava/util/List;", cancellable = true)
    private void allPhases__207958201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-207958201L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "submitShadow(Lcom/mojang/blaze3d/vertex/PoseStack;FLjava/util/List;)V", cancellable = true)
    private void submitShadow_60459936(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(60459936L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitNameTag(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/world/phys/Vec3;ILnet/minecraft/network/chat/Component;ZILnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submitNameTag__974051248(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-974051248L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitFlame(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lorg/joml/Quaternionf;)V", cancellable = true)
    private void submitFlame_362311704(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(362311704L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitBlockModel(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/rendertype/RenderType;Ljava/util/List;[IIII)V", cancellable = true)
    private void submitBlockModel__1472182949(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1472182949L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitMovingBlock(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/block/MovingBlockRenderState;I)V", cancellable = true)
    private void submitMovingBlock__57179602(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-57179602L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitQuadParticleGroup(Lnet/minecraft/client/renderer/state/level/QuadParticleRenderState;)V", cancellable = true)
    private void submitQuadParticleGroup_752302265(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(752302265L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitGizmoPrimitives(Lnet/minecraft/client/renderer/gizmos/DrawableGizmoPrimitives$Group;Lnet/minecraft/client/renderer/state/level/CameraRenderState;Z)V", cancellable = true)
    private void submitGizmoPrimitives_1306485933(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1306485933L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitLeash(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/entity/state/EntityRenderState$LeashState;)V", cancellable = true)
    private void submitLeash_5945109(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(5945109L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitShapeOutline(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/world/phys/shapes/VoxelShape;Lnet/minecraft/client/renderer/rendertype/RenderType;IFZ)V", cancellable = true)
    private void submitShapeOutline_743197590(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(743197590L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitBreakingBlockModel(Lcom/mojang/blaze3d/vertex/PoseStack;Ljava/util/List;I)V", cancellable = true)
    private void submitBreakingBlockModel__1906430174(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1906430174L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitCustomGeometry(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/rendertype/RenderType;Lnet/minecraft/client/renderer/SubmitNodeCollector$CustomGeometryRenderer;)V", cancellable = true)
    private void submitCustomGeometry_1510180150(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1510180150L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitModel(Lnet/minecraft/client/model/Model;Ljava/lang/Object;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/rendertype/RenderType;IIILnet/minecraft/client/renderer/texture/TextureAtlasSprite;ILnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void submitModel_1058604969(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1058604969L))
            info.cancel();
    }


}
