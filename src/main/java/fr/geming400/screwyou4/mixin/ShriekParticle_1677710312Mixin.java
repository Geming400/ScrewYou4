package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.ShriekParticle.class)
public class ShriekParticle_1677710312Mixin {
        @Inject(at = @At("HEAD"), method = "extract(Lnet/minecraft/client/renderer/state/level/QuadParticleRenderState;Lnet/minecraft/client/Camera;F)V", cancellable = true)
    private void extract__1827649187(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1827649187L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer_1079366869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1079366869L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1548026653(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1548026653L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLightCoords(F)I", cancellable = true)
    private void getLightCoords_1694398689(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1694398689L))
            info.setReturnValue(8911287);
    }

    @Inject(at = @At("HEAD"), method = "getQuadSize(F)F", cancellable = true)
    private void getQuadSize__952405666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-952405666L))
            info.setReturnValue(2.940898E8F);
    }


}
