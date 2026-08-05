package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.SubmitNodeStorage.class)
public class SubmitNodeStorage1967202419Mixin {
        @Inject(at = @At("HEAD"), method = "order(I)Lnet/minecraft/client/renderer/OrderedSubmitNodeCollector;", cancellable = true)
    private void order_1955274744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1955274744L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "order(I)Lnet/minecraft/client/renderer/SubmitNodeCollection;", cancellable = true)
    private void order__2111609402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2111609402L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "drainPhases(Ljava/util/function/Consumer;)V", cancellable = true)
    private void drainPhases__875809984(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-875809984L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitModel(Lnet/minecraft/client/model/Model;Ljava/lang/Object;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/rendertype/RenderType;IIILnet/minecraft/client/renderer/texture/TextureAtlasSprite;ILnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void submitModel_1664626654(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1664626654L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitCustomGeometry(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/rendertype/RenderType;Lnet/minecraft/client/renderer/SubmitNodeCollector$CustomGeometryRenderer;)V", cancellable = true)
    private void submitCustomGeometry_2116201835(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2116201835L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitText(Lcom/mojang/blaze3d/vertex/PoseStack;FFLnet/minecraft/util/FormattedCharSequence;ZLnet/minecraft/client/gui/Font$DisplayMode;IIII)V", cancellable = true)
    private void submitText__239929063(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-239929063L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitItem(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/world/item/ItemDisplayContext;III[ILjava/util/List;Lnet/minecraft/client/renderer/item/ItemStackRenderState$FoilType;)V", cancellable = true)
    private void submitItem__333839768(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-333839768L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSubmitsPerOrder()Lit/unimi/dsi/fastutil/ints/Int2ObjectAVLTreeMap;", cancellable = true)
    private void getSubmitsPerOrder__144536862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-144536862L))
            info.setReturnValue(new it.unimi.dsi.fastutil.ints.Int2ObjectAVLTreeMap());
    }

    @Inject(at = @At("HEAD"), method = "submitShapeOutline(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/world/phys/shapes/VoxelShape;Lnet/minecraft/client/renderer/rendertype/RenderType;IFZ)V", cancellable = true)
    private void submitShapeOutline_1349219275(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1349219275L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitBreakingBlockModel(Lcom/mojang/blaze3d/vertex/PoseStack;Ljava/util/List;I)V", cancellable = true)
    private void submitBreakingBlockModel__1300408489(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1300408489L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitLeash(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/entity/state/EntityRenderState$LeashState;)V", cancellable = true)
    private void submitLeash_611966794(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(611966794L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitBlockModel(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/rendertype/RenderType;Ljava/util/List;[IIII)V", cancellable = true)
    private void submitBlockModel__866161264(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-866161264L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitNameTag(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/world/phys/Vec3;ILnet/minecraft/network/chat/Component;ZILnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submitNameTag__368029563(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-368029563L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitFlame(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lorg/joml/Quaternionf;)V", cancellable = true)
    private void submitFlame_968333389(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(968333389L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitQuadParticleGroup(Lnet/minecraft/client/renderer/state/level/QuadParticleRenderState;)V", cancellable = true)
    private void submitQuadParticleGroup_1358323950(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1358323950L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitGizmoPrimitives(Lnet/minecraft/client/renderer/gizmos/DrawableGizmoPrimitives$Group;Lnet/minecraft/client/renderer/state/level/CameraRenderState;Z)V", cancellable = true)
    private void submitGizmoPrimitives_1912507618(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1912507618L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitMovingBlock(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/block/MovingBlockRenderState;I)V", cancellable = true)
    private void submitMovingBlock_548842083(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(548842083L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitShadow(Lcom/mojang/blaze3d/vertex/PoseStack;FLjava/util/List;)V", cancellable = true)
    private void submitShadow_666481621(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(666481621L))
            info.cancel();
    }


}
