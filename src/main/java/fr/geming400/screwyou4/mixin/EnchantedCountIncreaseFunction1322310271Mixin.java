package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.EnchantedCountIncreaseFunction.class)
public class EnchantedCountIncreaseFunction1322310271Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run__1740575702(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1740575702L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate_303591500(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(303591500L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams_2101813499(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2101813499L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1906211771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1906211771L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lootingMultiplier(Lnet/minecraft/core/HolderLookup$Provider;Lnet/minecraft/world/level/storage/loot/providers/number/NumberProvider;)Lnet/minecraft/world/level/storage/loot/functions/EnchantedCountIncreaseFunction$Builder;", cancellable = true)
    private static void lootingMultiplier__1035601508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1035601508L))
            info.setReturnValue(null);
    }


}
