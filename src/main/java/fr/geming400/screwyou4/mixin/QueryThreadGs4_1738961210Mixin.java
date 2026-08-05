package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.rcon.thread.QueryThreadGs4.class)
public class QueryThreadGs4_1738961210Mixin {
        @Inject(at = @At("HEAD"), method = "run()V", cancellable = true)
    private void run_1777235948(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1777235948L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "start()Z", cancellable = true)
    private void start_1777239792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1777239792L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/server/ServerInterface;)Lnet/minecraft/server/rcon/thread/QueryThreadGs4;", cancellable = true)
    private static void create__293691214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-293691214L))
            info.setReturnValue(null);
    }


}
