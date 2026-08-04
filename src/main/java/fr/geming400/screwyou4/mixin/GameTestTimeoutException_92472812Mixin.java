package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.GameTestTimeoutException.class)
public class GameTestTimeoutException_92472812Mixin {
        @Inject(at = @At("HEAD"), method = "getDescription()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDescription__2084436354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2084436354L))
            info.setReturnValue(null);
    }


}
