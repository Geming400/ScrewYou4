package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.permissions.PermissionCheck.Require.class)
public class Require1691958052Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1217496985(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1217496985L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_556498077(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(556498077L))
            info.setReturnValue("M@.yQ3D6P%]");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1730220794(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1730220794L))
            info.setReturnValue(-57137476);
    }

    @Inject(at = @At("HEAD"), method = "check(Lnet/minecraft/server/permissions/PermissionSet;)Z", cancellable = true)
    private void check__982888422(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-982888422L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "permission()Lnet/minecraft/server/permissions/Permission;", cancellable = true)
    private void permission_1630797494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1630797494L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__867155520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-867155520L))
            info.setReturnValue(null);
    }


}
