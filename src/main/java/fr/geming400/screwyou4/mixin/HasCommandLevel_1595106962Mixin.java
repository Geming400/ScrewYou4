package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.permissions.Permission.HasCommandLevel.class)
public class HasCommandLevel_1595106962Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1314348076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1314348076L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_459646986(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(459646986L))
            info.setReturnValue("桮b2r<");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1633369703(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1633369703L))
            info.setReturnValue(-949549497);
    }

    @Inject(at = @At("HEAD"), method = "level()Lnet/minecraft/server/permissions/PermissionLevel;", cancellable = true)
    private void level__1881519955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1881519955L))
            info.setReturnValue(net.minecraft.server.permissions.PermissionLevel.OWNERS);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__964006611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-964006611L))
            info.setReturnValue(null);
    }


}
