package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.loot.packs.VanillaEquipmentLoot.class)
public class VanillaEquipmentLoot41123533Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1426635792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1426635792L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1094336442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1094336442L))
            info.setReturnValue("ꈷg'YRqjk;4S;^S!]굱");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_79386275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(79386275L))
            info.setReturnValue(346502579);
    }

    @Inject(at = @At("HEAD"), method = "generate(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void generate__1697027357(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1697027357L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "trialChamberEquipment(Lnet/minecraft/world/item/Item;Lnet/minecraft/world/item/Item;Lnet/minecraft/world/item/equipment/trim/ArmorTrim;Lnet/minecraft/core/HolderLookup$RegistryLookup;)Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private static void trialChamberEquipment_1661703552(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1661703552L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registries()Lnet/minecraft/core/HolderLookup$Provider;", cancellable = true)
    private void registries__272083800(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-272083800L))
            info.setReturnValue(null);
    }


}
