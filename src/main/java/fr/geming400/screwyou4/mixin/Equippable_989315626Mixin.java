package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.equipment.Equippable.class)
public class Equippable_989315626Mixin {
        @Inject(at = @At("HEAD"), method = "slot()Lnet/minecraft/world/entity/EquipmentSlot;", cancellable = true)
    private void slot_804855206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(804855206L))
            info.setReturnValue(net.minecraft.world.entity.EquipmentSlot.CHEST);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1920139412(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1920139412L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__146144350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-146144350L))
            info.setReturnValue("G-6hU\u9B92( 6tfJ\u865DKo(\u9BDA\u76ADX0y\uFD60oFlg\u379CD\"dE$\"D&L!Y1w5@}t\">l>=RVSa`I.\uBFCA\u79510^wuoo\uBA70_;@>9v1");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1027578367(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1027578367L))
            info.setReturnValue(1701194030);
    }

    @Inject(at = @At("HEAD"), method = "builder(Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/equipment/Equippable$Builder;", cancellable = true)
    private static void builder_1059976006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1059976006L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cameraOverlay()Ljava/util/Optional;", cancellable = true)
    private void cameraOverlay_1234777047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1234777047L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allowedEntities()Ljava/util/Optional;", cancellable = true)
    private void allowedEntities_1234777047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1234777047L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equipSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void equipSound__1756775899(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1756775899L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "damageOnHurt()Z", cancellable = true)
    private void damageOnHurt_1027594208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1027594208L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "dispensable()Z", cancellable = true)
    private void dispensable_1027594208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1027594208L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canBeEquippedBy(Lnet/minecraft/core/Holder;)Z", cancellable = true)
    private void canBeEquippedBy__1759172689(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1759172689L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "assetId()Ljava/util/Optional;", cancellable = true)
    private void assetId_1234777047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1234777047L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "harness(Lnet/minecraft/world/item/DyeColor;)Lnet/minecraft/world/item/equipment/Equippable;", cancellable = true)
    private static void harness__1777272744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1777272744L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "saddle()Lnet/minecraft/world/item/equipment/Equippable;", cancellable = true)
    private static void saddle_1752278783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1752278783L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "llamaSwag(Lnet/minecraft/world/item/DyeColor;)Lnet/minecraft/world/item/equipment/Equippable;", cancellable = true)
    private static void llamaSwag__1777272744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1777272744L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "swappable()Z", cancellable = true)
    private void swappable_1027594208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1027594208L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canBeSheared()Z", cancellable = true)
    private void canBeSheared_1027594208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1027594208L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "shearingSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void shearingSound__1756775899(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1756775899L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equipOnTarget(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void equipOnTarget_615568745(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(615568745L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equipOnInteract()Z", cancellable = true)
    private void equipOnInteract_1027594208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1027594208L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "swapWithEquipmentSlot(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/player/Player;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void swapWithEquipmentSlot__1791699697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1791699697L))
            info.setReturnValue(null);
    }


}
