package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.ShaderManager.Configs.class)
public class Configs_1513291169Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_604664900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(604664900L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2011252603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2011252603L))
            info.setReturnValue("8/B!58Y");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2070643259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2070643259L))
            info.setReturnValue(1051413170);
    }

    @Inject(at = @At("HEAD"), method = "postChains()Ljava/util/Map;", cancellable = true)
    private void postChains__1333210954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1333210954L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shaderSources()Ljava/util/Map;", cancellable = true)
    private void shaderSources__1457535595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1457535595L))
            info.setReturnValue(null);
    }


}
