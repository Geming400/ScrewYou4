package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.EnchantRandomlyFunction.class)
public class EnchantRandomlyFunction1027179411Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run_865831603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(865831603L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "randomEnchantment()Lnet/minecraft/world/level/storage/loot/functions/EnchantRandomlyFunction$Builder;", cancellable = true)
    private static void randomEnchantment_1197211724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1197211724L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1531934161(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1531934161L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "randomApplicableEnchantment(Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/world/level/storage/loot/functions/EnchantRandomlyFunction$Builder;", cancellable = true)
    private static void randomApplicableEnchantment__1233857808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1233857808L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams__801856075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-801856075L))
            info.setReturnValue(null);
    }


}
