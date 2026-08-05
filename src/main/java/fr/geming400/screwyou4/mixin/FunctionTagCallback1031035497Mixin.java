package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.timers.FunctionTagCallback.class)
public class FunctionTagCallback1031035497Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1878419540(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1878419540L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__104424478(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-104424478L))
            info.setReturnValue("VwbZUeZ5c;wngX땬5=p者e}AEZGsc'.hDMjsB뻛*h=Kr㐙l*HQ3CR+U.䋸frಲe79p'Y딪MGV〈IFg");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1069298239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1069298239L))
            info.setReturnValue(1597666644);
    }

    @Inject(at = @At("HEAD"), method = "handle(Ljava/lang/Object;Lnet/minecraft/world/level/timers/TimerQueue;J)V", cancellable = true)
    private void handle__1742626036(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1742626036L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/world/level/timers/TimerQueue;J)V", cancellable = true)
    private void handle_11496999(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(11496999L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1528078075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1528078075L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tagId()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void tagId__1412031056(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1412031056L))
            info.setReturnValue(null);
    }


}
