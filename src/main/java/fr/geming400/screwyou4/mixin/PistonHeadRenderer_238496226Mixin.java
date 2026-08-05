package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.blockentity.PistonHeadRenderer.class)
public class PistonHeadRenderer_238496226Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/PistonHeadRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_417161068(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(417161068L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_378462863(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(378462863L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState_1255585087(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1255585087L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/piston/PistonMovingBlockEntity;Lnet/minecraft/client/renderer/blockentity/state/PistonHeadRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState_998141959(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(998141959L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/PistonHeadRenderState;", cancellable = true)
    private void createRenderState__725677156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-725677156L))
            info.setReturnValue(new net.minecraft.client.renderer.blockentity.state.PistonHeadRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;", cancellable = true)
    private void createRenderState_1372468651(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1372468651L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getViewDistance()I", cancellable = true)
    private void getViewDistance_276758471(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(276758471L))
            info.setReturnValue(-346664053);
    }


}
