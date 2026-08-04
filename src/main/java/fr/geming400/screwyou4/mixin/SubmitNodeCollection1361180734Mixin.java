package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.SubmitNodeCollection.class)
public class SubmitNodeCollection1361180734Mixin {
        @Inject(at = @At("HEAD"), method = "submitText(Lcom/mojang/blaze3d/vertex/PoseStack;FFLnet/minecraft/util/FormattedCharSequence;ZLnet/minecraft/client/gui/Font$DisplayMode;IIII)V", cancellable = true)
    private void submitText_308106047(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(308106047L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitItem(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/world/item/ItemDisplayContext;III[ILjava/util/List;Lnet/minecraft/client/renderer/item/ItemStackRenderState$FoilType;)V", cancellable = true)
    private void submitItem_776024616(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(776024616L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "allPhases()Ljava/util/List;", cancellable = true)
    private void allPhases__1307449746(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1307449746L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "submitGizmoPrimitives(Lnet/minecraft/client/renderer/gizmos/DrawableGizmoPrimitives$Group;Lnet/minecraft/client/renderer/state/level/CameraRenderState;Z)V", cancellable = true)
    private void submitGizmoPrimitives__931462981(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-931462981L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitBlockModel(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/rendertype/RenderType;Ljava/util/List;[IIII)V", cancellable = true)
    private void submitBlockModel_410645127(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(410645127L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitMovingBlock(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/block/MovingBlockRenderState;I)V", cancellable = true)
    private void submitMovingBlock__1778491979(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1778491979L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitQuadParticleGroup(Lnet/minecraft/client/renderer/state/level/QuadParticleRenderState;)V", cancellable = true)
    private void submitQuadParticleGroup__1412924833(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1412924833L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitShadow(Lcom/mojang/blaze3d/vertex/PoseStack;FLjava/util/List;)V", cancellable = true)
    private void submitShadow_1500755448(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1500755448L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitFlame(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lorg/joml/Quaternionf;)V", cancellable = true)
    private void submitFlame_1577111389(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1577111389L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitLeash(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/entity/state/EntityRenderState$LeashState;)V", cancellable = true)
    private void submitLeash__1117565862(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1117565862L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitNameTag(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/world/phys/Vec3;ILnet/minecraft/network/chat/Component;ZILnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submitNameTag_1357590279(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1357590279L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitShapeOutline(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/world/phys/shapes/VoxelShape;Lnet/minecraft/client/renderer/rendertype/RenderType;IFZ)V", cancellable = true)
    private void submitShapeOutline__949599811(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-949599811L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitBreakingBlockModel(Lcom/mojang/blaze3d/vertex/PoseStack;Ljava/util/List;I)V", cancellable = true)
    private void submitBreakingBlockModel_1793714489(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1793714489L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitModel(Lnet/minecraft/client/model/Model;Ljava/lang/Object;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/rendertype/RenderType;IIILnet/minecraft/client/renderer/texture/TextureAtlasSprite;ILnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void submitModel__1247983240(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1247983240L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitCustomGeometry(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/rendertype/RenderType;Lnet/minecraft/client/renderer/SubmitNodeCollector$CustomGeometryRenderer;)V", cancellable = true)
    private void submitCustomGeometry_118714385(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(118714385L))
            info.cancel();
    }


}
