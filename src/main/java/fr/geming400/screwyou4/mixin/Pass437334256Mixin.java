package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.PostChainConfig.Pass.class)
public class Pass437334256Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1822846515(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1822846515L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__698125719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-698125719L))
            info.setReturnValue("<1꧘:t6J:E坩&#-\"4+f,Nꊽ,H(oP渴咽G<S!=鼔kPP6sᷤl鴶");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_475596998(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(475596998L))
            info.setReturnValue(1186212192);
    }

    @Inject(at = @At("HEAD"), method = "inputs()Ljava/util/List;", cancellable = true)
    private void inputs_2063671072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2063671072L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fragmentShaderId()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void fragmentShaderId__2005732297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2005732297L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "vertexShaderId()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void vertexShaderId__2005732297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2005732297L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "referencedTargets()Ljava/util/stream/Stream;", cancellable = true)
    private void referencedTargets_226627941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(226627941L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "outputTarget()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void outputTarget__2005732297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2005732297L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "uniforms()Ljava/util/Map;", cancellable = true)
    private void uniforms__1567289384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1567289384L))
            info.setReturnValue(null);
    }


}
