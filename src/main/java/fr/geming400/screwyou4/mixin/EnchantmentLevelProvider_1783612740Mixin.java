package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.providers.number.EnchantmentLevelProvider.class)
public class EnchantmentLevelProvider_1783612740Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1125842298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1125842298L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_648152764(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(648152764L))
            info.setReturnValue("vꄾ乇K*EpB㉒29gM刿xA퍂@gX&SvtS'si'P");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1821875481(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1821875481L))
            info.setReturnValue(1461938005);
    }

    @Inject(at = @At("HEAD"), method = "getFloat(Lnet/minecraft/world/level/storage/loot/LootContext;)F", cancellable = true)
    private void getFloat__593355579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-593355579L))
            info.setReturnValue(7.750986E8F);
    }

    @Inject(at = @At("HEAD"), method = "amount()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void amount_1915692338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1915692338L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forEnchantmentLevel(Lnet/minecraft/world/item/enchantment/LevelBasedValue;)Lnet/minecraft/world/level/storage/loot/providers/number/EnchantmentLevelProvider;", cancellable = true)
    private static void forEnchantmentLevel_1846404761(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1846404761L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__775500833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-775500833L))
            info.setReturnValue(null);
    }


}
