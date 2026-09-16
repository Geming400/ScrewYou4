package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.blockentity.SkullBlockRenderer.class)
public class SkullBlockRenderer1734270357Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/SkullBlockRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__12194767(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-12194767L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_1530826843(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1530826843L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSkullRenderType(Lnet/minecraft/world/level/block/SkullBlock$Type;Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void getSkullRenderType__1676018716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1676018716L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "submitSkull(FLcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/client/model/object/skull/SkullModelBase;Lnet/minecraft/client/renderer/rendertype/RenderType;ILnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private static void submitSkull__245968064(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-245968064L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/SkullBlockEntity;Lnet/minecraft/client/renderer/blockentity/state/SkullBlockRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState_1527064310(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1527064310L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState__615486259(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-615486259L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createModel(Lnet/minecraft/client/model/geom/EntityModelSet;Lnet/minecraft/world/level/block/SkullBlock$Type;)Lnet/minecraft/client/model/object/skull/SkullModelBase;", cancellable = true)
    private static void createModel__623680844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-623680844L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/SkullBlockRenderState;", cancellable = true)
    private void createRenderState__2117544984(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2117544984L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;", cancellable = true)
    private void createRenderState_2117033182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2117033182L))
            info.setReturnValue(new net.minecraft.client.renderer.blockentity.state.BlockEntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "getPlayerSkinRenderType(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void getPlayerSkinRenderType__142918654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-142918654L))
            info.setReturnValue(null);
    }


}
