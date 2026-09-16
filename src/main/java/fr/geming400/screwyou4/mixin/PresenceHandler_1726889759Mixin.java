package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.social.PresenceHandler.class)
public class PresenceHandler_1726889759Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1597206100(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1597206100L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tryUpdatePresence()V", cancellable = true)
    private void tryUpdatePresence_1103483314(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1103483314L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLatestPresence()Lcom/mojang/authlib/yggdrasil/response/PresenceResponse;", cancellable = true)
    private void getLatestPresence_303227022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(303227022L))
            info.setReturnValue(null);
    }


}
