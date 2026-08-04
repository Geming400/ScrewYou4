package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.permissions.PermissionCheckTypes.class)
public class PermissionCheckTypes852626648Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/core/Registry;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void bootstrap_1447215818(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1447215818L))
            info.setReturnValue(null);
    }


}
