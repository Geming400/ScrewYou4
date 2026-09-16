package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.WorldLoader.DataLoadOutput.class)
public class DataLoadOutput1701351948Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_792725680(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(792725680L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1823191823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1823191823L))
            info.setReturnValue("kiu7g[&]*C\uB85CiqhFBB\"+ hEX(\uB3BA>\u3A20zXZ7 a3{-%5\uBD9F");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2036263257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2036263257L))
            info.setReturnValue(-1300702999);
    }

    @Inject(at = @At("HEAD"), method = "cookie()Ljava/lang/Object;", cancellable = true)
    private void cookie_2127953675(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2127953675L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "finalDimensions()Lnet/minecraft/core/RegistryAccess$Frozen;", cancellable = true)
    private void finalDimensions_873143798(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(873143798L))
            info.setReturnValue(null);
    }


}
