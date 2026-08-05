package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.GameTestAssertException.class)
public class GameTestAssertException_2093778121Mixin {
        @Inject(at = @At("HEAD"), method = "getMessage()Ljava/lang/String;", cancellable = true)
    private void getMessage_958317649(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(958317649L))
            info.setReturnValue("[㬒Lo'");
    }

    @Inject(at = @At("HEAD"), method = "getDescription()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDescription__83131045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-83131045L))
            info.setReturnValue(null);
    }


}
