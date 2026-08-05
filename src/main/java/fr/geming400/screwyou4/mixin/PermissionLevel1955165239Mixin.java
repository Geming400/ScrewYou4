package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.permissions.PermissionLevel.class)
public class PermissionLevel1955165239Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/server/permissions/PermissionLevel;", cancellable = true)
    private static void values__904932540(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-904932540L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/server/permissions/PermissionLevel;", cancellable = true)
    private static void valueOf_1269086337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1269086337L))
            info.setReturnValue(net.minecraft.server.permissions.PermissionLevel.GAMEMASTERS);
    }

    @Inject(at = @At("HEAD"), method = "id()I", cancellable = true)
    private void id_1993427485(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1993427485L))
            info.setReturnValue(1065023271);
    }

    @Inject(at = @At("HEAD"), method = "byId(I)Lnet/minecraft/server/permissions/PermissionLevel;", cancellable = true)
    private static void byId_2013854706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2013854706L))
            info.setReturnValue(net.minecraft.server.permissions.PermissionLevel.MODERATORS);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_819704768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(819704768L))
            info.setReturnValue("pw{rh既02-*RvCx#LYA㶶8lh&8=CV趣uFy8:[J8@&q(({M6V惏UJxw==n69筅㫃$쬥1}㘷.Akf$(z븀9駻");
    }

    @Inject(at = @At("HEAD"), method = "isEqualOrHigherThan(Lnet/minecraft/server/permissions/PermissionLevel;)Z", cancellable = true)
    private void isEqualOrHigherThan_867046347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(867046347L))
            info.setReturnValue(true);
    }


}
