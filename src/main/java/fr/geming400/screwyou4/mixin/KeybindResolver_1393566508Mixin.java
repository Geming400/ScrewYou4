package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.contents.KeybindResolver.class)
public class KeybindResolver_1393566508Mixin {
        @Inject(at = @At("HEAD"), method = "setKeyResolver(Ljava/util/function/Function;)V", cancellable = true)
    private static void setKeyResolver__604256543(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-604256543L))
            info.cancel();
    }


}
