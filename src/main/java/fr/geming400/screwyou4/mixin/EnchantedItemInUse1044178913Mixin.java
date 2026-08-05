package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.EnchantedItemInUse.class)
public class EnchantedItemInUse1044178913Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1865276124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1865276124L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__91281062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-91281062L))
            info.setReturnValue("o<祑P帀$EPdX`iᐂfJ&G河T&*vX㺮w.L1F}5AXv#hkGDh6Cgꅲ6y㸴폨W5mo4!<_{!?Qx韮剓粸Mnek&N;Dt09&籛abcK3zvw");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1082441655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1082441655L))
            info.setReturnValue(-1867126876);
    }

    @Inject(at = @At("HEAD"), method = "owner()Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private void owner_311940798(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(311940798L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onBreak()Ljava/util/function/Consumer;", cancellable = true)
    private void onBreak_206072504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(206072504L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "itemStack()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void itemStack_1567597573(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1567597573L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "inSlot()Lnet/minecraft/world/entity/EquipmentSlot;", cancellable = true)
    private void inSlot_859718494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(859718494L))
            info.setReturnValue(net.minecraft.world.entity.EquipmentSlot.LEGS);
    }


}
