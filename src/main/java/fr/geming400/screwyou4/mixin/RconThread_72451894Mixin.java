package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.rcon.thread.RconThread.class)
public class RconThread_72451894Mixin {
        @Inject(at = @At("HEAD"), method = "run()V", cancellable = true)
    private void run_835564093(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(835564093L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_1649555238(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1649555238L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/server/ServerInterface;)Lnet/minecraft/server/rcon/thread/RconThread;", cancellable = true)
    private static void create__1069426898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1069426898L))
            info.setReturnValue(null);
    }


}
