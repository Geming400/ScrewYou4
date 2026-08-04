package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.server.LanServer.class)
public class LanServer_1013929202Mixin {
        @Inject(at = @At("HEAD"), method = "getAddress()Ljava/lang/String;", cancellable = true)
    private void getAddress__121531270(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-121531270L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMotd()Ljava/lang/String;", cancellable = true)
    private void getMotd__121531270(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-121531270L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updatePingTime()V", cancellable = true)
    private void updatePingTime_1052203940(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1052203940L))
            info.cancel();
    }


}
