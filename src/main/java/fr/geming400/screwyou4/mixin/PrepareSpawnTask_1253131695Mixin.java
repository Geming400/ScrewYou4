package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.network.config.PrepareSpawnTask.class)
public class PrepareSpawnTask_1253131695Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/server/network/ConfigurationTask$Type;", cancellable = true)
    private void type_305970806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(305970806L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "start(Ljava/util/function/Consumer;)V", cancellable = true)
    private void start_1934148107(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1934148107L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_1291406433(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1291406433L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keepAlive()V", cancellable = true)
    private void keepAlive_1291406433(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1291406433L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()Z", cancellable = true)
    private void tick_1291410277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1291410277L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "spawnPlayer(Lnet/minecraft/network/Connection;Lnet/minecraft/server/network/CommonListenerCookie;)Lnet/minecraft/server/level/ServerPlayer;", cancellable = true)
    private void spawnPlayer_562853130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(562853130L))
            info.setReturnValue(null);
    }


}
