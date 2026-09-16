package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.timers.FunctionCallback.class)
public class FunctionCallback_752972945Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__155653324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-155653324L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1523396469(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1523396469L))
            info.setReturnValue("Y\u25A3=<UpZT\u544B}K)*5pE(e\u9DE0\"u+c9fyeIjy(-9GHDW[I");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1310325035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1310325035L))
            info.setReturnValue(49290527);
    }

    @Inject(at = @At("HEAD"), method = "handle(Ljava/lang/Object;Lnet/minecraft/world/level/timers/TimerQueue;J)V", cancellable = true)
    private void handle_1046489099(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1046489099L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/world/level/timers/TimerQueue;J)V", cancellable = true)
    private void handle_186914598(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(186914598L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1819418198(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1819418198L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "functionId()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void functionId_2033537002(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2033537002L))
            info.setReturnValue(null);
    }


}
