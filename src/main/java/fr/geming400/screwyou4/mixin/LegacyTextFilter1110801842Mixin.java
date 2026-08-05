package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.network.LegacyTextFilter.class)
public class LegacyTextFilter1110801842Mixin {
        @Inject(at = @At("HEAD"), method = "createContext(Lcom/mojang/authlib/GameProfile;)Lnet/minecraft/server/network/TextFilter;", cancellable = true)
    private void createContext__2112066594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2112066594L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createTextFilterFromConfig(Ljava/lang/String;)Lnet/minecraft/server/network/ServerTextFilter;", cancellable = true)
    private static void createTextFilterFromConfig_114175498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(114175498L))
            info.setReturnValue(null);
    }


}
