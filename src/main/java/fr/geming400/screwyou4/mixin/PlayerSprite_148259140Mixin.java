package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.contents.objects.PlayerSprite.class)
public class PlayerSprite_148259140Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__760367129(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-760367129L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_918682664(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(918682664L))
            info.setReturnValue("RV}8Z4hXW^$td|EytkZ[8M:RBh%&CmI'F\u6490Yj?`ewGupg");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_705611230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(705611230L))
            info.setReturnValue(165712232);
    }

    @Inject(at = @At("HEAD"), method = "player()Lnet/minecraft/world/item/component/ResolvableProfile;", cancellable = true)
    private void player_1627288249(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1627288249L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1214704393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1214704393L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fontDescription()Lnet/minecraft/network/chat/FontDescription;", cancellable = true)
    private void fontDescription_1307098515(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1307098515L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hat()Z", cancellable = true)
    private void hat_264711487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(264711487L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "defaultFallback()Ljava/lang/String;", cancellable = true)
    private void defaultFallback__1003508529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1003508529L))
            info.setReturnValue("S49CS\u2556@`6(w@L;dv_SNvP\u68FB0M8wO=\u605D)O9%,7Zc}v=x\u5D982h\u54F0d[VOo3/W$8gFv\uCC7C)`?G]=^fgOl<%HPS1H\u0CDE\u7475uMXW\u758AyhWgEC9]s");
    }


}
