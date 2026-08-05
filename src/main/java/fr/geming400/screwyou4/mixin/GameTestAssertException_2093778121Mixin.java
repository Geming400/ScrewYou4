package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.GameTestAssertException.class)
public class GameTestAssertException_2093778121Mixin {
        @Inject(at = @At("HEAD"), method = "getMessage()Ljava/lang/String;", cancellable = true)
    private void getMessage_1453776226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1453776226L))
            info.setReturnValue("\u6F23+sPRdu[L,W");
    }

    @Inject(at = @At("HEAD"), method = "getDescription()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDescription_1649834145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1649834145L))
            info.setReturnValue(null);
    }


}
