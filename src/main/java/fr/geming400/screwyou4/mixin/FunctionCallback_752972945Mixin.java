package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.timers.FunctionCallback.class)
public class FunctionCallback_752972945Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2138485203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2138485203L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__382487031(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-382487031L))
            info.setReturnValue("K+FB\u3619:!U\uD7DCgnW ;=_M*5ZP?;\u3D42");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_791235686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(791235686L))
            info.setReturnValue(769661451);
    }

    @Inject(at = @At("HEAD"), method = "handle(Ljava/lang/Object;Lnet/minecraft/world/level/timers/TimerQueue;J)V", cancellable = true)
    private void handle__2020688589(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2020688589L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/world/level/timers/TimerQueue;J)V", cancellable = true)
    private void handle__266565554(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-266565554L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1806140628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1806140628L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "functionId()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void functionId__1690093609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1690093609L))
            info.setReturnValue(null);
    }


}
