package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.permissions.Permission.HasCommandLevel.class)
public class HasCommandLevel_1595106962Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_686480693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(686480693L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1929436810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1929436810L))
            info.setReturnValue("^eKp];f\u2CD6sX\uFC5D$>L'rk[|\u3B74,i]\u5ABC");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2142508244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2142508244L))
            info.setReturnValue(-1961716875);
    }

    @Inject(at = @At("HEAD"), method = "level()Lnet/minecraft/server/permissions/PermissionLevel;", cancellable = true)
    private void level_1918212401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1918212401L))
            info.setReturnValue(net.minecraft.server.permissions.PermissionLevel.ALL);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1633415081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1633415081L))
            info.setReturnValue(null);
    }


}
