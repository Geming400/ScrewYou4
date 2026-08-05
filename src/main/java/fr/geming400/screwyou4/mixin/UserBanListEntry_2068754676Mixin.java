package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.players.UserBanListEntry.class)
public class UserBanListEntry_2068754676Mixin {
        @Inject(at = @At("HEAD"), method = "getDisplayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDisplayName__1045800451(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1045800451L))
            info.setReturnValue(null);
    }


}
