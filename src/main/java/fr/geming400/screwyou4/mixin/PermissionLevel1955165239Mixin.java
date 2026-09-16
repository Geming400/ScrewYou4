package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.permissions.PermissionLevel.class)
public class PermissionLevel1955165239Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/server/permissions/PermissionLevel;", cancellable = true)
    private static void values__678127646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-678127646L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/server/permissions/PermissionLevel;", cancellable = true)
    private static void valueOf_2030293929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2030293929L))
            info.setReturnValue(net.minecraft.server.permissions.PermissionLevel.GAMEMASTERS);
    }

    @Inject(at = @At("HEAD"), method = "id()I", cancellable = true)
    private void id__740018718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-740018718L))
            info.setReturnValue(-1979348392);
    }

    @Inject(at = @At("HEAD"), method = "byId(I)Lnet/minecraft/server/permissions/PermissionLevel;", cancellable = true)
    private static void byId__1440728096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1440728096L))
            info.setReturnValue(net.minecraft.server.permissions.PermissionLevel.ADMINS);
    }

    @Inject(at = @At("HEAD"), method = "isEqualOrHigherThan(Lnet/minecraft/server/permissions/PermissionLevel;)Z", cancellable = true)
    private void isEqualOrHigherThan_163846030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(163846030L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_2043373861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2043373861L))
            info.setReturnValue("Z\u5A76P\uBBE6_\u7393/\uA5DC;&G/2FzN}D,N\u7B3F%6|gJ(\uB1E9NKgSU}qga!h| h6\u019A;HQ.R\u4462\uBB9D=?{X>_\u981FkY");
    }


}
