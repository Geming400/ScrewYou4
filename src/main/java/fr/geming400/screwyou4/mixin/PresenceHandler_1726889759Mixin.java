package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.social.PresenceHandler.class)
public class PresenceHandler_1726889759Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1765164497(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1765164497L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLatestPresence()Lcom/mojang/authlib/yggdrasil/response/PresenceResponse;", cancellable = true)
    private void getLatestPresence_1933487606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1933487606L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tryUpdatePresence()V", cancellable = true)
    private void tryUpdatePresence_1765164497(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1765164497L))
            info.cancel();
    }


}
