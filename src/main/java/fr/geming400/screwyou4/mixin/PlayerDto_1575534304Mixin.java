package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.api.PlayerDto.class)
public class PlayerDto_1575534304Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/util/Optional;", cancellable = true)
    private void name_1820995725(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1820995725L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1333920734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1333920734L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_440074328(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(440074328L))
            info.setReturnValue("{;}%#R]q`\u9A6D\u04D8N.\"<\u8EEEZ'\u823A{&3IGLTwd$I6IL|Z\"]$");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1613797045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1613797045L))
            info.setReturnValue(-1760173314);
    }

    @Inject(at = @At("HEAD"), method = "from(Lnet/minecraft/server/players/NameAndId;)Lnet/minecraft/server/jsonrpc/api/PlayerDto;", cancellable = true)
    private static void from_1735948297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1735948297L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "from(Lnet/minecraft/server/level/ServerPlayer;)Lnet/minecraft/server/jsonrpc/api/PlayerDto;", cancellable = true)
    private static void from__1858113866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1858113866L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "from(Lcom/mojang/authlib/GameProfile;)Lnet/minecraft/server/jsonrpc/api/PlayerDto;", cancellable = true)
    private static void from_805748301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(805748301L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/util/Optional;", cancellable = true)
    private void id_1820995725(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1820995725L))
            info.setReturnValue(null);
    }


}
