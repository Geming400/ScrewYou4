package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.feature.QuadParticleFeatureRenderer.Submit.class)
public class Submit_413690114Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1799202372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1799202372L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__721769862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-721769862L))
            info.setReturnValue("rxMc-b;돓侨,8yN难LIn+F`d`9LLDa1]|bhFVX82/Mk0vs⯵婦H[K^`K");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_451952855(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(451952855L))
            info.setReturnValue(707778826);
    }

    @Inject(at = @At("HEAD"), method = "translucent()Z", cancellable = true)
    private void translucent_451968696(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(451968696L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "featureType()Lnet/minecraft/client/renderer/feature/FeatureRendererType;", cancellable = true)
    private void featureType_1444773639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1444773639L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "particles()Lnet/minecraft/client/renderer/state/level/QuadParticleRenderState;", cancellable = true)
    private void particles__547334820(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-547334820L))
            info.setReturnValue(new net.minecraft.client.renderer.state.level.QuadParticleRenderState());
    }


}
