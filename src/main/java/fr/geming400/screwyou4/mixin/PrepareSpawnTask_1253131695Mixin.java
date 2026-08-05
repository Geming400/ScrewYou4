package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.network.config.PrepareSpawnTask.class)
public class PrepareSpawnTask_1253131695Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/server/network/ConfigurationTask$Type;", cancellable = true)
    private void type_1349012604(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1349012604L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "start(Ljava/util/function/Consumer;)V", cancellable = true)
    private void start__1457787411(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1457787411L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__861443735(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-861443735L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keepAlive()V", cancellable = true)
    private void keepAlive_953897241(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(953897241L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()Z", cancellable = true)
    private void tick_1123451880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1123451880L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "spawnPlayer(Lnet/minecraft/network/Connection;Lnet/minecraft/server/network/CommonListenerCookie;)Lnet/minecraft/server/level/ServerPlayer;", cancellable = true)
    private void spawnPlayer_46254150(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(46254150L))
            info.setReturnValue(null);
    }


}
