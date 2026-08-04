package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.rcon.thread.RconThread.class)
public class RconThread_72451894Mixin {
        @Inject(at = @At("HEAD"), method = "run()V", cancellable = true)
    private void run_110726632(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(110726632L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_110726632(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(110726632L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/server/ServerInterface;)Lnet/minecraft/server/rcon/thread/RconThread;", cancellable = true)
    private static void create__1991183446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1991183446L))
            info.setReturnValue(null);
    }


}
