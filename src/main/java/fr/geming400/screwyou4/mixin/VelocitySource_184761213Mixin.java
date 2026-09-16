package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.SpawnParticlesEffect.VelocitySource.class)
public class VelocitySource_184761213Mixin {
        @Inject(at = @At("HEAD"), method = "base()Lnet/minecraft/util/valueproviders/FloatProvider;", cancellable = true)
    private void base__123788729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-123788729L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__723865056(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-723865056L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_955184737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(955184737L))
            info.setReturnValue("^\u3861#TKE.y{4wvRa6e}Ve#]4`=");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_742113303(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(742113303L))
            info.setReturnValue(-1260273472);
    }

    @Inject(at = @At("HEAD"), method = "movementScale()F", cancellable = true)
    private void movementScale_352733476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(352733476L))
            info.setReturnValue(6.724511E8F);
    }

    @Inject(at = @At("HEAD"), method = "getVelocity(DLnet/minecraft/util/RandomSource;)D", cancellable = true)
    private void getVelocity__387768810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-387768810L))
            info.setReturnValue(6.724511003309036E8D);
    }


}
