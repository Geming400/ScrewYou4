package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.EquipmentSlot.class)
public class EquipmentSlot_380513234Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__754947238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-754947238L))
            info.setReturnValue("Q#?Td ᐤt8vW]5臲nvd");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/EquipmentSlot;", cancellable = true)
    private static void values_1403194687(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1403194687L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/EquipmentSlot;", cancellable = true)
    private static void valueOf_1601929084(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1601929084L))
            info.setReturnValue(net.minecraft.world.entity.EquipmentSlot.SADDLE);
    }

    @Inject(at = @At("HEAD"), method = "limit(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void limit_333970352(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(333970352L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId_418775479(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(418775479L))
            info.setReturnValue(-1149815158);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/entity/EquipmentSlot$Type;", cancellable = true)
    private void getType_1251286152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1251286152L))
            info.setReturnValue(net.minecraft.world.entity.EquipmentSlot.Type.ANIMAL_ARMOR);
    }

    @Inject(at = @At("HEAD"), method = "getIndex()I", cancellable = true)
    private void getIndex_418775479(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(418775479L))
            info.setReturnValue(-1149815158);
    }

    @Inject(at = @At("HEAD"), method = "getIndex(I)I", cancellable = true)
    private void getIndex_1594417712(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1594417712L))
            info.setReturnValue(-1866482291);
    }

    @Inject(at = @At("HEAD"), method = "byName(Ljava/lang/String;)Lnet/minecraft/world/entity/EquipmentSlot;", cancellable = true)
    private static void byName_1601929084(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1601929084L))
            info.setReturnValue(net.minecraft.world.entity.EquipmentSlot.SADDLE);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__754947238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-754947238L))
            info.setReturnValue("Q#?Td ᐤt8vW]5臲nvd");
    }

    @Inject(at = @At("HEAD"), method = "isArmor()Z", cancellable = true)
    private void isArmor_418791816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(418791816L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canIncreaseExperience()Z", cancellable = true)
    private void canIncreaseExperience_418791816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(418791816L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getFilterBit(I)I", cancellable = true)
    private void getFilterBit_1594417712(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1594417712L))
            info.setReturnValue(-1866482291);
    }


}
