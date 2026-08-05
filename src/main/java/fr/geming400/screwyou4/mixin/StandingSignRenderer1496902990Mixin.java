package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.blockentity.StandingSignRenderer.class)
public class StandingSignRenderer1496902990Mixin {
        @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/SignBlockEntity;Lnet/minecraft/client/renderer/blockentity/state/StandingSignRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState_1381709168(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1381709168L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/SignBlockEntity;Lnet/minecraft/client/renderer/blockentity/state/SignRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState_1160879388(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1160879388L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState__1780975444(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1780975444L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;", cancellable = true)
    private void createRenderState__1664091880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1664091880L))
            info.setReturnValue(new net.minecraft.client.renderer.blockentity.state.BlockEntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/StandingSignRenderState;", cancellable = true)
    private void createRenderState__77264071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-77264071L))
            info.setReturnValue(new net.minecraft.client.renderer.blockentity.state.StandingSignRenderState());
    }


}
