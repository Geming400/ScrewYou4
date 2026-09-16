package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.damagesource.DamageEffects.class)
public class DamageEffects_1865231563Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/damagesource/DamageEffects;", cancellable = true)
    private static void values_1996707784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1996707784L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/damagesource/DamageEffects;", cancellable = true)
    private static void valueOf_1691146575(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1691146575L))
            info.setReturnValue(net.minecraft.world.damagesource.DamageEffects.BURNING);
    }

    @Inject(at = @At("HEAD"), method = "sound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void sound_795903293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(795903293L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1953440184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1953440184L))
            info.setReturnValue("3\uD6F5NEG\u4C74<QKkACf\uA64CEcS7sH\u8EAC\u71E3ro%\uA2273>j*l`\u9745q-4\u4535X?0S\u0773gP\u1072@-ngg)]YZ\uB87B<v]cd\u21E1S4M`j*!H\u9F76r>q\uC6DB");
    }


}
