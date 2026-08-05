package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.SubmitNodeStorage.class)
public class SubmitNodeStorage1967202419Mixin {
        @Inject(at = @At("HEAD"), method = "order(I)Lnet/minecraft/client/renderer/OrderedSubmitNodeCollector;", cancellable = true)
    private void order_1449285894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1449285894L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "order(I)Lnet/minecraft/client/renderer/SubmitNodeCollection;", cancellable = true)
    private void order_2145780052(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2145780052L))
            info.setReturnValue(new net.minecraft.client.renderer.SubmitNodeCollection());
    }

    @Inject(at = @At("HEAD"), method = "getSubmitsPerOrder()Lit/unimi/dsi/fastutil/ints/Int2ObjectAVLTreeMap;", cancellable = true)
    private void getSubmitsPerOrder_1587276696(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1587276696L))
            info.setReturnValue(new it.unimi.dsi.fastutil.ints.Int2ObjectAVLTreeMap());
    }

    @Inject(at = @At("HEAD"), method = "submitBreakingBlockModel(Lcom/mojang/blaze3d/vertex/PoseStack;Ljava/util/List;I)V", cancellable = true)
    private void submitBreakingBlockModel__1895231122(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1895231122L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitShapeOutline(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/world/phys/shapes/VoxelShape;Lnet/minecraft/client/renderer/rendertype/RenderType;IFZ)V", cancellable = true)
    private void submitShapeOutline__343578126(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-343578126L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitMovingBlock(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/block/MovingBlockRenderState;I)V", cancellable = true)
    private void submitMovingBlock__1172470294(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1172470294L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitGizmoPrimitives(Lnet/minecraft/client/renderer/gizmos/DrawableGizmoPrimitives$Group;Lnet/minecraft/client/renderer/state/level/CameraRenderState;Z)V", cancellable = true)
    private void submitGizmoPrimitives__325441296(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-325441296L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitShadow(Lcom/mojang/blaze3d/vertex/PoseStack;FLjava/util/List;)V", cancellable = true)
    private void submitShadow_2106777133(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2106777133L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitFlame(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lorg/joml/Quaternionf;)V", cancellable = true)
    private void submitFlame__2111834222(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2111834222L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitNameTag(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/world/phys/Vec3;ILnet/minecraft/network/chat/Component;ZILnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submitNameTag_1963611964(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1963611964L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitLeash(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/entity/state/EntityRenderState$LeashState;)V", cancellable = true)
    private void submitLeash__511544177(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-511544177L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitBlockModel(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/rendertype/RenderType;Ljava/util/List;[IIII)V", cancellable = true)
    private void submitBlockModel_1016666812(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1016666812L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitQuadParticleGroup(Lnet/minecraft/client/renderer/state/level/QuadParticleRenderState;)V", cancellable = true)
    private void submitQuadParticleGroup__806903148(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-806903148L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "drainPhases(Ljava/util/function/Consumer;)V", cancellable = true)
    private void drainPhases__1646748464(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1646748464L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitText(Lcom/mojang/blaze3d/vertex/PoseStack;FFLnet/minecraft/util/FormattedCharSequence;ZLnet/minecraft/client/gui/Font$DisplayMode;IIII)V", cancellable = true)
    private void submitText_914127732(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(914127732L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitItem(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/world/item/ItemDisplayContext;III[ILjava/util/List;Lnet/minecraft/client/renderer/item/ItemStackRenderState$FoilType;)V", cancellable = true)
    private void submitItem_1382046301(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1382046301L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitModel(Lnet/minecraft/client/model/Model;Ljava/lang/Object;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/rendertype/RenderType;IIILnet/minecraft/client/renderer/texture/TextureAtlasSprite;ILnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void submitModel__641961555(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-641961555L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitCustomGeometry(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/rendertype/RenderType;Lnet/minecraft/client/renderer/SubmitNodeCollector$CustomGeometryRenderer;)V", cancellable = true)
    private void submitCustomGeometry_724736070(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(724736070L))
            info.cancel();
    }


}
