package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.EnchantRandomlyFunction.class)
public class EnchantRandomlyFunction1027179411Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run__2035706562(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2035706562L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_2093624665(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2093624665L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "randomEnchantment()Lnet/minecraft/world/level/storage/loot/functions/EnchantRandomlyFunction$Builder;", cancellable = true)
    private static void randomEnchantment__1921214016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1921214016L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.functions.EnchantRandomlyFunction.Builder());
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams_1806682639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1806682639L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "randomApplicableEnchantment(Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/world/level/storage/loot/functions/EnchantRandomlyFunction$Builder;", cancellable = true)
    private static void randomApplicableEnchantment_965807621(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(965807621L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.functions.EnchantRandomlyFunction.Builder());
    }


}
