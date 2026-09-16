package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.methods.BanlistService.UserBanDto.class)
public class UserBanDto1649453857Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_740827589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(740827589L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1875089914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1875089914L))
            info.setReturnValue("bOG\u7377K6l5HSVv\u92E7G\uAD5C8ZW\u1445A");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2088161348(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2088161348L))
            info.setReturnValue(1621545408);
    }

    @Inject(at = @At("HEAD"), method = "from(Lnet/minecraft/server/players/UserBanListEntry;)Lnet/minecraft/server/jsonrpc/methods/BanlistService$UserBanDto;", cancellable = true)
    private static void from__877612101(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-877612101L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "source()Ljava/util/Optional;", cancellable = true)
    private void source_467837930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(467837930L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "reason()Ljava/util/Optional;", cancellable = true)
    private void reason__1560927469(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1560927469L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "expires()Ljava/util/Optional;", cancellable = true)
    private void expires_2096326659(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2096326659L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Lnet/minecraft/server/jsonrpc/api/PlayerDto;", cancellable = true)
    private void player__1612102351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1612102351L))
            info.setReturnValue(null);
    }


}
