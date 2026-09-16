package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.loot.packs.VanillaEquipmentLoot.class)
public class VanillaEquipmentLoot41123533Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__867502735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-867502735L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_811547058(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(811547058L))
            info.setReturnValue("*y0B\uD69Fkn,RXB8et#qaMk\u3C065xa,pJn`raT856");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_598475624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(598475624L))
            info.setReturnValue(-1096160868);
    }

    @Inject(at = @At("HEAD"), method = "generate(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void generate__221337128(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-221337128L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registries()Lnet/minecraft/core/HolderLookup$Provider;", cancellable = true)
    private void registries_1770365699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1770365699L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "trialChamberEquipment(Lnet/minecraft/world/item/Item;Lnet/minecraft/world/item/Item;Lnet/minecraft/world/item/equipment/trim/ArmorTrim;Lnet/minecraft/core/HolderLookup$RegistryLookup;)Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private static void trialChamberEquipment_1774291450(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1774291450L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.LootTable.Builder());
    }


}
