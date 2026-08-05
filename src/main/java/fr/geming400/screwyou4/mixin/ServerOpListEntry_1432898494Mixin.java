package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.players.ServerOpListEntry.class)
public class ServerOpListEntry_1432898494Mixin {
        @Inject(at = @At("HEAD"), method = "permissions()Lnet/minecraft/server/permissions/LevelBasedPermissionSet;", cancellable = true)
    private void permissions_1442805294(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1442805294L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBypassesPlayerLimit()Z", cancellable = true)
    private void getBypassesPlayerLimit_75697542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(75697542L))
            info.setReturnValue(false);
    }


}
