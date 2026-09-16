package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.FontDescription.PlayerSprite.class)
public class PlayerSprite843604719Mixin {
        @Inject(at = @At("HEAD"), method = "profile()Lnet/minecraft/world/item/component/ResolvableProfile;", cancellable = true)
    private void profile__194840275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-194840275L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__65021549(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-65021549L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1614028244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1614028244L))
            info.setReturnValue("\u9B81rH.{R\uFB3Ez26[/3o-G7bi|c4e\u07411a@AF:yrMIuX");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1400956810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1400956810L))
            info.setReturnValue(1129593706);
    }

    @Inject(at = @At("HEAD"), method = "hat()Z", cancellable = true)
    private void hat_960057067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(960057067L))
            info.setReturnValue(true);
    }


}
