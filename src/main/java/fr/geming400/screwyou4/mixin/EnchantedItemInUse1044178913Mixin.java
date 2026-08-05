package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.EnchantedItemInUse.class)
public class EnchantedItemInUse1044178913Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_135552645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(135552645L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1814602438(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1814602438L))
            info.setReturnValue("c,v|2z].drBlQ{\u4FB5");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1601531004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1601531004L))
            info.setReturnValue(1317878935);
    }

    @Inject(at = @At("HEAD"), method = "owner()Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private void owner_1771907819(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1771907819L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onBreak()Ljava/util/function/Consumer;", cancellable = true)
    private void onBreak_1779402840(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1779402840L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "itemStack()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void itemStack__1545021894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1545021894L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "inSlot()Lnet/minecraft/world/entity/EquipmentSlot;", cancellable = true)
    private void inSlot_2032121569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2032121569L))
            info.setReturnValue(net.minecraft.world.entity.EquipmentSlot.LEGS);
    }


}
