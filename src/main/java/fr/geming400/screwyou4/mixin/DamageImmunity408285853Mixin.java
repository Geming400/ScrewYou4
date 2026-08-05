package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.DamageImmunity.class)
public class DamageImmunity408285853Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1793798112(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1793798112L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__727174122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-727174122L))
            info.setReturnValue("I\u1251Qk7}b']mPEC<\uD1F5EM;gH\u877F)");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_446548595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(446548595L))
            info.setReturnValue(1325888278);
    }


}
