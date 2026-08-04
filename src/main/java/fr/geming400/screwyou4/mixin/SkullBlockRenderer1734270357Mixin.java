package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.blockentity.SkullBlockRenderer.class)
public class SkullBlockRenderer1734270357Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_1874236995(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1874236995L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/SkullBlockRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_1245808969(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1245808969L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/SkullBlockRenderState;", cancellable = true)
    private void createRenderState_1370370887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1370370887L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;", cancellable = true)
    private void createRenderState__1426724513(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1426724513L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createModel(Lnet/minecraft/client/model/geom/EntityModelSet;Lnet/minecraft/world/level/block/SkullBlock$Type;)Lnet/minecraft/client/model/object/skull/SkullModelBase;", cancellable = true)
    private static void createModel__853257439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-853257439L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState__1543608077(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1543608077L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/SkullBlockEntity;Lnet/minecraft/client/renderer/blockentity/state/SkullBlockRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState__429088740(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-429088740L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPlayerSkinRenderType(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void getPlayerSkinRenderType__838785402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-838785402L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSkullRenderType(Lnet/minecraft/world/level/block/SkullBlock$Type;Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void getSkullRenderType__1085142739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1085142739L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "submitSkull(FLcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/client/model/object/skull/SkullModelBase;Lnet/minecraft/client/renderer/rendertype/RenderType;ILnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private static void submitSkull__1791921829(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1791921829L))
            info.cancel();
    }


}
