package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.ThrowingComponent.class)
public class ThrowingComponent_844182925Mixin {
        @Inject(at = @At("HEAD"), method = "getComponent()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getComponent__2111767642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2111767642L))
            info.setReturnValue(null);
    }


}
