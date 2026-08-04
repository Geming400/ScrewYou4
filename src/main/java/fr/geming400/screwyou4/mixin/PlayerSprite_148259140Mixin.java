package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.contents.objects.PlayerSprite.class)
public class PlayerSprite_148259140Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1533771398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1533771398L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__987200836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-987200836L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_186521881(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(186521881L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1884112863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1884112863L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Lnet/minecraft/world/item/component/ResolvableProfile;", cancellable = true)
    private void player_944464664(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(944464664L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fontDescription()Lnet/minecraft/network/chat/FontDescription;", cancellable = true)
    private void fontDescription__911801498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-911801498L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "defaultFallback()Ljava/lang/String;", cancellable = true)
    private void defaultFallback__987201332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-987201332L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hat()Z", cancellable = true)
    private void hat_186537722(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(186537722L))
            info.setReturnValue(null);
    }


}
