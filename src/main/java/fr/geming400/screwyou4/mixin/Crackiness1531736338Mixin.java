package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.Crackiness.class)
public class Crackiness1531736338Mixin {
        @Inject(at = @At("HEAD"), method = "byDamage(II)Lnet/minecraft/world/entity/Crackiness$Level;", cancellable = true)
    private void byDamage__1250343345(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1250343345L))
            info.setReturnValue(net.minecraft.world.entity.Crackiness.Level.NONE);
    }

    @Inject(at = @At("HEAD"), method = "byDamage(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/entity/Crackiness$Level;", cancellable = true)
    private void byDamage_465170260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(465170260L))
            info.setReturnValue(net.minecraft.world.entity.Crackiness.Level.NONE);
    }

    @Inject(at = @At("HEAD"), method = "byFraction(F)Lnet/minecraft/world/entity/Crackiness$Level;", cancellable = true)
    private void byFraction__1160122428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1160122428L))
            info.setReturnValue(net.minecraft.world.entity.Crackiness.Level.MEDIUM);
    }


}
