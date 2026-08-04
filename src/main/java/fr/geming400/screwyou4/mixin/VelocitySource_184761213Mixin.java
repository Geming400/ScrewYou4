package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.SpawnParticlesEffect.VelocitySource.class)
public class VelocitySource_184761213Mixin {
        @Inject(at = @At("HEAD"), method = "base()Lnet/minecraft/util/valueproviders/FloatProvider;", cancellable = true)
    private void base_1117980792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1117980792L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1570273471(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1570273471L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__950698763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-950698763L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_223023954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(223023954L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "movementScale()F", cancellable = true)
    private void movementScale_223020575(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(223020575L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVelocity(DLnet/minecraft/util/RandomSource;)D", cancellable = true)
    private void getVelocity__1301037111(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1301037111L))
            info.setReturnValue(null);
    }


}
