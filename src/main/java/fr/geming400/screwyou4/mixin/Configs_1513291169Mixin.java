package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.ShaderManager.Configs.class)
public class Configs_1513291169Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1396163869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1396163869L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_377831193(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(377831193L))
            info.setReturnValue("@xr%oh");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1551553910(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1551553910L))
            info.setReturnValue(-986245742);
    }

    @Inject(at = @At("HEAD"), method = "shaderSources()Ljava/util/Map;", cancellable = true)
    private void shaderSources__491332472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-491332472L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "postChains()Ljava/util/Map;", cancellable = true)
    private void postChains__491332472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-491332472L))
            info.setReturnValue(null);
    }


}
