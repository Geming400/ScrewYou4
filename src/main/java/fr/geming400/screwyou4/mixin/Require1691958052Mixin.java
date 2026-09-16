package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.permissions.PermissionCheck.Require.class)
public class Require1691958052Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_783331784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(783331784L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1832585719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1832585719L))
            info.setReturnValue("");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2045657153(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2045657153L))
            info.setReturnValue(-2090479079);
    }

    @Inject(at = @At("HEAD"), method = "check(Lnet/minecraft/server/permissions/PermissionSet;)Z", cancellable = true)
    private void check__389578734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-389578734L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "permission()Lnet/minecraft/server/permissions/Permission;", cancellable = true)
    private void permission__1749930809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1749930809L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1536563990(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1536563990L))
            info.setReturnValue(null);
    }


}
