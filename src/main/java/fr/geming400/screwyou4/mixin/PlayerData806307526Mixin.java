package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.social.PlayerSocialManager.PlayerData.class)
public class PlayerData806307526Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name_1615574682(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1615574682L))
            info.setReturnValue("\uB0925TGGJJ{1Q\u0164\uBA44u'(\uCD20wB\uA5DC\uD062I \u6CF3`9i|_,e\u8DEC2g\uB69118{^oi.\u7E30S1w>`\u9FBAEI&:oS01^\"r5ApB\u056E2$p8\u5853ncg=ppX1");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__102318742(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-102318742L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1576731051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1576731051L))
            info.setReturnValue("h`>p\u0278<qqa5=Cza (<NkG.Nu,)Twk8,5\u3EFAQ\uB6DE@@");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1363659617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1363659617L))
            info.setReturnValue(-970943110);
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/util/UUID;", cancellable = true)
    private void id_1630151284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1630151284L))
            info.setReturnValue(null);
    }


}
