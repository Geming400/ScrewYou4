package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.permissions.PermissionSetUnion.class)
public class PermissionSetUnion_1248874092Mixin {
        @Inject(at = @At("HEAD"), method = "getPermissions()Lit/unimi/dsi/fastutil/objects/ReferenceSet;", cancellable = true)
    private void getPermissions__686817120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-686817120L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "union(Lnet/minecraft/server/permissions/PermissionSet;)Lnet/minecraft/server/permissions/PermissionSet;", cancellable = true)
    private void union__1283935527(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1283935527L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasPermission(Lnet/minecraft/server/permissions/Permission;)Z", cancellable = true)
    private void hasPermission__742617712(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-742617712L))
            info.setReturnValue(true);
    }


}
