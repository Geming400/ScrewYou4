package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.ApplyBonusCount.class)
public class ApplyBonusCount2068205712Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run__994680261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-994680261L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams__1447258356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1447258356L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1160316330(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1160316330L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addBonusBinomialDistributionCount(Lnet/minecraft/core/Holder;FI)Lnet/minecraft/world/level/storage/loot/functions/LootItemConditionalFunction$Builder;", cancellable = true)
    private static void addBonusBinomialDistributionCount_1758720599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1758720599L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addUniformBonusCount(Lnet/minecraft/core/Holder;)Lnet/minecraft/world/level/storage/loot/functions/LootItemConditionalFunction$Builder;", cancellable = true)
    private static void addUniformBonusCount_1832640117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1832640117L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addUniformBonusCount(Lnet/minecraft/core/Holder;I)Lnet/minecraft/world/level/storage/loot/functions/LootItemConditionalFunction$Builder;", cancellable = true)
    private static void addUniformBonusCount__1245160640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1245160640L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addOreBonusCount(Lnet/minecraft/core/Holder;)Lnet/minecraft/world/level/storage/loot/functions/LootItemConditionalFunction$Builder;", cancellable = true)
    private static void addOreBonusCount_1857860615(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1857860615L))
            info.setReturnValue(null);
    }


}
