package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.server.LanServerPinger.class)
public class LanServerPinger1465236365Mixin {
        @Inject(at = @At("HEAD"), method = "run()V", cancellable = true)
    private void run_1503511104(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1503511104L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "interrupt()V", cancellable = true)
    private void interrupt_1503511104(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1503511104L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "parseAddress(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void parseAddress__1616988860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1616988860L))
            info.setReturnValue("<m{VDEV!e+㿶Za}䘏5.EOWW 㠹{");
    }

    @Inject(at = @At("HEAD"), method = "createPingString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void createPingString__592851718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-592851718L))
            info.setReturnValue("䱅${7눾V⋢5zfg<uq뢲A省");
    }

    @Inject(at = @At("HEAD"), method = "parseMotd(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void parseMotd__1616988860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1616988860L))
            info.setReturnValue("<m{VDEV!e+㿶Za}䘏5.EOWW 㠹{");
    }


}
