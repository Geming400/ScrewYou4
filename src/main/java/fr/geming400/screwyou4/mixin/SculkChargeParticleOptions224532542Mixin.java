package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.particles.SculkChargeParticleOptions.class)
public class SculkChargeParticleOptions224532542Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1610044801(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1610044801L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__910927433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-910927433L))
            info.setReturnValue(":К:鲲0^*i㴌A4/MV(9⨧<zE\"c%䔩췕ac);D8/}i$㦶+igL71JK5;ᛚC,ꠒql⮰⸕Eo솞[8苬3Dny=thK@蝕v볋w*y\"<s<'");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_262795284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(262795284L))
            info.setReturnValue(-1399686529);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/core/particles/ParticleType;", cancellable = true)
    private void getType_499736868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(499736868L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "roll()F", cancellable = true)
    private void roll_262791905(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(262791905L))
            info.setReturnValue(7.136646E8F);
    }


}
