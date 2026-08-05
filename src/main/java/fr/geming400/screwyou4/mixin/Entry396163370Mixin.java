package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.SuspiciousStewEffects.Entry.class)
public class Entry396163370Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1781675629(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1781675629L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__739296605(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-739296605L))
            info.setReturnValue("Mﶻd|ne+N(fSu9tJyv?-DNdtκ+猷e-棒鄀19|XW⽕mѠXNm[`,l7$cᄏtOGc䍷a]K9ࢌ.X5꼎먨ᆜ鸕+h*Yx][");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_434426112(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(434426112L))
            info.setReturnValue(139899187);
    }

    @Inject(at = @At("HEAD"), method = "duration()I", cancellable = true)
    private void duration_434425616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(434425616L))
            info.setReturnValue(-1232884889);
    }

    @Inject(at = @At("HEAD"), method = "effect()Lnet/minecraft/core/Holder;", cancellable = true)
    private void effect_1945039142(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1945039142L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createEffectInstance()Lnet/minecraft/world/effect/MobEffectInstance;", cancellable = true)
    private void createEffectInstance__1353689665(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1353689665L))
            info.setReturnValue(null);
    }


}
