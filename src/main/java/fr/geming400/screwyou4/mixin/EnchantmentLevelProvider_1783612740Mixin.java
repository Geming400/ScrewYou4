package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.providers.number.EnchantmentLevelProvider.class)
public class EnchantmentLevelProvider_1783612740Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_874986471(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(874986471L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1740931032(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1740931032L))
            info.setReturnValue("\u152FFe+@\uCEF2k!\u91C1vzWMf<5m[Z.c)S\uBFA38U$zT1%+q\uBB8F_Y");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1954002466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1954002466L))
            info.setReturnValue(2120124409);
    }

    @Inject(at = @At("HEAD"), method = "getFloat(Lnet/minecraft/world/level/storage/loot/LootContext;)F", cancellable = true)
    private void getFloat_1554141919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1554141919L))
            info.setReturnValue(5.432615E8F);
    }

    @Inject(at = @At("HEAD"), method = "amount()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void amount__1344022646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1344022646L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1444909303(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1444909303L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forEnchantmentLevel(Lnet/minecraft/world/item/enchantment/LevelBasedValue;)Lnet/minecraft/world/level/storage/loot/providers/number/EnchantmentLevelProvider;", cancellable = true)
    private static void forEnchantmentLevel__1603801841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1603801841L))
            info.setReturnValue(null);
    }


}
