package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.ChatType.Bound.class)
public class Bound_662705442Mixin {
        @Inject(at = @At("HEAD"), method = "name()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void name__1514203724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1514203724L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2048217700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2048217700L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__472754534(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-472754534L))
            info.setReturnValue("FxQK?Y쿌;E`Nmr*:ꗗNU aI&vﻻ[;/N杙Z+&wulF<w췢BC罂g.dX*l'騠tCїOhvd v ez>S-#RR0L뼝^殏g搇IGb*L)0ꂖ0琣(X");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_700968183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(700968183L))
            info.setReturnValue(-436596671);
    }

    @Inject(at = @At("HEAD"), method = "targetName()Ljava/util/Optional;", cancellable = true)
    private void targetName_908166863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(908166863L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "decorateNarration(Lnet/minecraft/network/chat/Component;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void decorateNarration_708225312(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(708225312L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withTargetName(Lnet/minecraft/network/chat/Component;)Lnet/minecraft/network/chat/ChatType$Bound;", cancellable = true)
    private void withTargetName__1968974741(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1968974741L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chatType()Lnet/minecraft/core/Holder;", cancellable = true)
    private void chatType__2083386083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2083386083L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "decorate(Lnet/minecraft/network/chat/Component;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void decorate_708225312(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(708225312L))
            info.setReturnValue(null);
    }


}
