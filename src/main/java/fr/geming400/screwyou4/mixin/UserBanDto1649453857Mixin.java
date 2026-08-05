package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.methods.BanlistService.UserBanDto.class)
public class UserBanDto1649453857Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1260001180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1260001180L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_513993882(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(513993882L))
            info.setReturnValue("[ㅻ$VKWS㷰4Y丕4W'KݠJh#T2,.We&,Cff4Ⴗ뿏U[b挢MY/1E");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1687716599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1687716599L))
            info.setReturnValue(-6069135);
    }

    @Inject(at = @At("HEAD"), method = "from(Lnet/minecraft/server/players/UserBanListEntry;)Lnet/minecraft/server/jsonrpc/methods/BanlistService$UserBanDto;", cancellable = true)
    private static void from__233351259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-233351259L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "source()Ljava/util/Optional;", cancellable = true)
    private void source_1894915279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1894915279L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "reason()Ljava/util/Optional;", cancellable = true)
    private void reason_1894915279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1894915279L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "expires()Ljava/util/Optional;", cancellable = true)
    private void expires_1894915279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1894915279L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Lnet/minecraft/server/jsonrpc/api/PlayerDto;", cancellable = true)
    private void player_806768720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(806768720L))
            info.setReturnValue(null);
    }


}
