package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.timers.FunctionTagCallback.class)
public class FunctionTagCallback1031035497Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_122409229(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(122409229L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1801459022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1801459022L))
            info.setReturnValue("+N9FPKj*fgSJ.mxWUR6!UY YSD[\uD4CFY0:ocQ\uB855 a@hkPQ![2\uAEC6{E\".\uBD7Ca\u24F91|[e6K4ZdP&/hQS\u5327DVr");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1588387588(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1588387588L))
            info.setReturnValue(89869772);
    }

    @Inject(at = @At("HEAD"), method = "handle(Ljava/lang/Object;Lnet/minecraft/world/level/timers/TimerQueue;J)V", cancellable = true)
    private void handle_1324551652(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1324551652L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/world/level/timers/TimerQueue;J)V", cancellable = true)
    private void handle_464977151(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(464977151L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_2097480751(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2097480751L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tagId()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void tagId__536695035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-536695035L))
            info.setReturnValue(null);
    }


}
