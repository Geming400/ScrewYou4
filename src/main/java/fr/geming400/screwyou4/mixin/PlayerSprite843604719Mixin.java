package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.FontDescription.PlayerSprite.class)
public class PlayerSprite843604719Mixin {
        @Inject(at = @At("HEAD"), method = "profile()Lnet/minecraft/world/item/component/ResolvableProfile;", cancellable = true)
    private void profile_1639810244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1639810244L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2065850318(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2065850318L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__291855256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-291855256L))
            info.setReturnValue("ꋓ祐Gy엓?X_-|/:yJOd@SFM9r;v)B");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_881867461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(881867461L))
            info.setReturnValue(979393852);
    }

    @Inject(at = @At("HEAD"), method = "hat()Z", cancellable = true)
    private void hat_881883302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(881883302L))
            info.setReturnValue(true);
    }


}
