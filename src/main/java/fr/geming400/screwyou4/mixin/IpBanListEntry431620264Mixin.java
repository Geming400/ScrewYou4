package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.players.IpBanListEntry.class)
public class IpBanListEntry431620264Mixin {
        @Inject(at = @At("HEAD"), method = "getDisplayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDisplayName__1745288901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1745288901L))
            info.setReturnValue(null);
    }


}
