package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.Crackiness.class)
public class Crackiness1531736338Mixin {
        @Inject(at = @At("HEAD"), method = "byDamage(II)Lnet/minecraft/world/entity/Crackiness$Level;", cancellable = true)
    private void byDamage__595357003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-595357003L))
            info.setReturnValue(net.minecraft.world.entity.Crackiness.Level.HIGH);
    }

    @Inject(at = @At("HEAD"), method = "byDamage(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/entity/Crackiness$Level;", cancellable = true)
    private void byDamage_1401791034(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1401791034L))
            info.setReturnValue(net.minecraft.world.entity.Crackiness.Level.NONE);
    }

    @Inject(at = @At("HEAD"), method = "byFraction(F)Lnet/minecraft/world/entity/Crackiness$Level;", cancellable = true)
    private void byFraction_692827275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(692827275L))
            info.setReturnValue(net.minecraft.world.entity.Crackiness.Level.LOW);
    }


}
