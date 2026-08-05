package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.context.ContextMap.class)
public class ContextMap_30387535Mixin {
        @Inject(at = @At("HEAD"), method = "getOrDefault(Lnet/minecraft/util/context/ContextKey;Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void getOrDefault__1489791977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1489791977L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "has(Lnet/minecraft/util/context/ContextKey;)Z", cancellable = true)
    private void has__16414867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-16414867L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getOptional(Lnet/minecraft/util/context/ContextKey;)Ljava/lang/Object;", cancellable = true)
    private void getOptional_330972869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(330972869L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOrThrow(Lnet/minecraft/util/context/ContextKey;)Ljava/lang/Object;", cancellable = true)
    private void getOrThrow__337635218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-337635218L))
            info.setReturnValue(new java.lang.Object());
    }


}
