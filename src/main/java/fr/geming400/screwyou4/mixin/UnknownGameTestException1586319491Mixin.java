package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.UnknownGameTestException.class)
public class UnknownGameTestException1586319491Mixin {
        @Inject(at = @At("HEAD"), method = "getDescription()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDescription__590589674(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-590589674L))
            info.setReturnValue(null);
    }


}
