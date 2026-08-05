package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.permissions.PermissionSetUnion.class)
public class PermissionSetUnion_1248874092Mixin {
        @Inject(at = @At("HEAD"), method = "getPermissions()Lit/unimi/dsi/fastutil/objects/ReferenceSet;", cancellable = true)
    private void getPermissions__46409390(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-46409390L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "union(Lnet/minecraft/server/permissions/PermissionSet;)Lnet/minecraft/server/permissions/PermissionSet;", cancellable = true)
    private void union__2091561078(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2091561078L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasPermission(Lnet/minecraft/server/permissions/Permission;)Z", cancellable = true)
    private void hasPermission_438388167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(438388167L))
            info.setReturnValue(false);
    }


}
