package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.wolf.WolfSoundVariant.WolfSoundSet.class)
public class WolfSoundSet_1508532309Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_599906040(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(599906040L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2016011463(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2016011463L))
            info.setReturnValue("o]p;I?qh=\uD056%?*mGL*z{,H\u55C0\u74CC?\u41EA6Zs<\u15DF");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2065884399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2065884399L))
            info.setReturnValue(-803178417);
    }

    @Inject(at = @At("HEAD"), method = "hurtSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void hurtSound__1271426544(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1271426544L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deathSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void deathSound__1071478283(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1071478283L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stepSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void stepSound_1773056589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1773056589L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ambientSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void ambientSound__819025895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-819025895L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "growlSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void growlSound_1127018426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1127018426L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pantSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void pantSound_868832632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(868832632L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "whineSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void whineSound__92266128(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-92266128L))
            info.setReturnValue(null);
    }


}
