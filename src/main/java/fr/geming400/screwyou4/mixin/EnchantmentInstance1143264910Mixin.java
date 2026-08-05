package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.EnchantmentInstance.class)
public class EnchantmentInstance1143264910Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1766190127(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1766190127L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_7804935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(7804935L))
            info.setReturnValue("W]4VEPF=N넝>{_懘#9c0>");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1181527652(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1181527652L))
            info.setReturnValue(1447834174);
    }

    @Inject(at = @At("HEAD"), method = "level()I", cancellable = true)
    private void level_1181527156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1181527156L))
            info.setReturnValue(1650981594);
    }

    @Inject(at = @At("HEAD"), method = "weight()I", cancellable = true)
    private void weight_1181527156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1181527156L))
            info.setReturnValue(1650981594);
    }

    @Inject(at = @At("HEAD"), method = "enchantment()Lnet/minecraft/core/Holder;", cancellable = true)
    private void enchantment__1602826614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1602826614L))
            info.setReturnValue(null);
    }


}
