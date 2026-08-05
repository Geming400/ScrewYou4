package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.damagesource.DamageEffects.class)
public class DamageEffects_1865231563Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/damagesource/DamageEffects;", cancellable = true)
    private static void values__327547990(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-327547990L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/damagesource/DamageEffects;", cancellable = true)
    private static void valueOf__678357977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-678357977L))
            info.setReturnValue(net.minecraft.world.damagesource.DamageEffects.FREEZING);
    }

    @Inject(at = @At("HEAD"), method = "sound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void sound__1339522836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1339522836L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_729771091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(729771091L))
            info.setReturnValue("M<rX{\u685CC\u1B9EF/nK;&A*7/Mm>&Z\uCAB0\u7256\u2901m/oyeo\uC5CB\u60C4jO^/\u9EF5zRt\u77E6&!C\u1105\u1726`zoQMn\u014FaXS*oTPAiT8'+>='-:<z\u6BB04\u73DFfZ|=]N!A");
    }


}
