package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.server.LanServerPinger.class)
public class LanServerPinger1465236365Mixin {
        @Inject(at = @At("HEAD"), method = "run()V", cancellable = true)
    private void run__2066618731(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2066618731L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "interrupt()V", cancellable = true)
    private void interrupt__396420675(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-396420675L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "parseMotd(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void parseMotd_1158112553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1158112553L))
            info.setReturnValue("iC0-5yVc\u330Aq%qA4Wq%7mb BBpe\u32A8(RbQ<lF08`\u1F22wU\uB08B0S@Imp-gwp6+86*`EO$0u(s1\uFE24Do:xdAp`25BHA`Ga6|^");
    }

    @Inject(at = @At("HEAD"), method = "parseAddress(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void parseAddress__412395003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-412395003L))
            info.setReturnValue("y= 5r#JX");
    }

    @Inject(at = @At("HEAD"), method = "createPingString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void createPingString_1074303609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1074303609L))
            info.setReturnValue("QE>W WU5X!%X8+'Qc<tJ%aQ.");
    }


}
