package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.rcon.thread.QueryThreadGs4.class)
public class QueryThreadGs4_1738961210Mixin {
        @Inject(at = @At("HEAD"), method = "run()V", cancellable = true)
    private void run__1792893887(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1792893887L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "start()Z", cancellable = true)
    private void start_112799694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(112799694L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/server/ServerInterface;)Lnet/minecraft/server/rcon/thread/QueryThreadGs4;", cancellable = true)
    private static void create__1282792906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1282792906L))
            info.setReturnValue(null);
    }


}
