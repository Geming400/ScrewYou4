package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.context.ContextKey.class)
public class ContextKey_32106764Mixin {
        @Inject(at = @At("HEAD"), method = "name()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void name_1884007506(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1884007506L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1103353708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1103353708L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "vanilla(Ljava/lang/String;)Lnet/minecraft/util/context/ContextKey;", cancellable = true)
    private static void vanilla__2063480632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2063480632L))
            info.setReturnValue(null);
    }


}
