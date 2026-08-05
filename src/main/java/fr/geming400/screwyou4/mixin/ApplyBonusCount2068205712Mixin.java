package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.ApplyBonusCount.class)
public class ApplyBonusCount2068205712Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run_1906857904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1906857904L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__490907860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-490907860L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams_239170226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(239170226L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addBonusBinomialDistributionCount(Lnet/minecraft/core/Holder;FI)Lnet/minecraft/world/level/storage/loot/functions/LootItemConditionalFunction$Builder;", cancellable = true)
    private static void addBonusBinomialDistributionCount__515598507(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-515598507L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addUniformBonusCount(Lnet/minecraft/core/Holder;)Lnet/minecraft/world/level/storage/loot/functions/LootItemConditionalFunction$Builder;", cancellable = true)
    private static void addUniformBonusCount__309449480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-309449480L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addUniformBonusCount(Lnet/minecraft/core/Holder;I)Lnet/minecraft/world/level/storage/loot/functions/LootItemConditionalFunction$Builder;", cancellable = true)
    private static void addUniformBonusCount_1069538589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1069538589L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addOreBonusCount(Lnet/minecraft/core/Holder;)Lnet/minecraft/world/level/storage/loot/functions/LootItemConditionalFunction$Builder;", cancellable = true)
    private static void addOreBonusCount__309449480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-309449480L))
            info.setReturnValue(null);
    }


}
