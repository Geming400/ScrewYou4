package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.api.PlayerDto.class)
public class PlayerDto_1575534304Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/util/Optional;", cancellable = true)
    private void name__1901495784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1901495784L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_666908035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(666908035L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1949009468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1949009468L))
            info.setReturnValue("\u684AuSlXSYnk3Z\u0A95Fy,UViJr");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2132886394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2132886394L))
            info.setReturnValue(-28915427);
    }

    @Inject(at = @At("HEAD"), method = "from(Lnet/minecraft/server/players/NameAndId;)Lnet/minecraft/server/jsonrpc/api/PlayerDto;", cancellable = true)
    private static void from__914071117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-914071117L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "from(Lnet/minecraft/server/level/ServerPlayer;)Lnet/minecraft/server/jsonrpc/api/PlayerDto;", cancellable = true)
    private static void from_1890630220(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1890630220L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "from(Lcom/mojang/authlib/GameProfile;)Lnet/minecraft/server/jsonrpc/api/PlayerDto;", cancellable = true)
    private static void from_1199829495(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1199829495L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/util/Optional;", cancellable = true)
    private void id__779395928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-779395928L))
            info.setReturnValue(null);
    }


}
