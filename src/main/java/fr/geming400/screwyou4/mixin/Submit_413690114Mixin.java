package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.feature.QuadParticleFeatureRenderer.Submit.class)
public class Submit_413690114Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__494936155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-494936155L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1184113638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1184113638L))
            info.setReturnValue("!gKbxlx|L1Vm9r;^cmR\u7282u\u2CB20U,h,;a\u295Bt$wy\uADE8Ks:RL_8dg\u7B03%(c\u3634\u1D9F\u7FEE[3pkd]k+A");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_971042204(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(971042204L))
            info.setReturnValue(577241727);
    }

    @Inject(at = @At("HEAD"), method = "featureType()Lnet/minecraft/client/renderer/feature/FeatureRendererType;", cancellable = true)
    private void featureType_221266359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(221266359L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "particles()Lnet/minecraft/client/renderer/state/level/QuadParticleRenderState;", cancellable = true)
    private void particles_2135485967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2135485967L))
            info.setReturnValue(new net.minecraft.client.renderer.state.level.QuadParticleRenderState());
    }

    @Inject(at = @At("HEAD"), method = "translucent()Z", cancellable = true)
    private void translucent_605761279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(605761279L))
            info.setReturnValue(true);
    }


}
