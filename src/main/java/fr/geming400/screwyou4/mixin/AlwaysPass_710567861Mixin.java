package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.permissions.PermissionCheck.AlwaysPass.class)
public class AlwaysPass_710567861Mixin {
        @Inject(at = @At("HEAD"), method = "check(Lnet/minecraft/server/permissions/PermissionSet;)Z", cancellable = true)
    private void check__1964278614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1964278614L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1848545712(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1848545712L))
            info.setReturnValue(null);
    }


}
