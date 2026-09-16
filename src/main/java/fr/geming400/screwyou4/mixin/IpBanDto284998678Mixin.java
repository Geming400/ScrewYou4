package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.methods.IpBanlistService.IpBanDto.class)
public class IpBanDto284998678Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__623627590(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-623627590L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1055422203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1055422203L))
            info.setReturnValue("uHy`2\u3E06CQ\u818C2Von\";R\uBD89V<,)d]|{oi\u3638\u956C|C}Aa>\uFE3A\u6966<Y<\"MZ8[\uC639A)ER*uoV\u6B57T$\u46FCiCYsLQ\u38F6ZUwb@M3,GY|MB");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_842350769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(842350769L))
            info.setReturnValue(-1308886511);
    }

    @Inject(at = @At("HEAD"), method = "from(Lnet/minecraft/server/players/IpBanListEntry;)Lnet/minecraft/server/jsonrpc/methods/IpBanlistService$IpBanDto;", cancellable = true)
    private static void from_178577783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(178577783L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "source()Ljava/util/Optional;", cancellable = true)
    private void source__896617249(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-896617249L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "reason()Ljava/util/Optional;", cancellable = true)
    private void reason_1369584648(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1369584648L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "expires()Ljava/util/Optional;", cancellable = true)
    private void expires_731871480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(731871480L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ip()Ljava/lang/String;", cancellable = true)
    private void ip__1616535162(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1616535162L))
            info.setReturnValue("v;&R;jr:NddO\u3A4EQ^}X_mpkWIwZ\u6FD4");
    }


}
