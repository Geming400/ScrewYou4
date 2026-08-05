package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.context.ContextMap.class)
public class ContextMap_30387535Mixin {
        @Inject(at = @At("HEAD"), method = "getOrDefault(Lnet/minecraft/util/context/ContextKey;Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void getOrDefault__554752705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-554752705L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "has(Lnet/minecraft/util/context/ContextKey;)Z", cancellable = true)
    private void has__1998457901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1998457901L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getOptional(Lnet/minecraft/util/context/ContextKey;)Ljava/lang/Object;", cancellable = true)
    private void getOptional_1625323483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1625323483L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOrThrow(Lnet/minecraft/util/context/ContextKey;)Ljava/lang/Object;", cancellable = true)
    private void getOrThrow_1625323483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1625323483L))
            info.setReturnValue(null);
    }


}
