package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.EnchantedCountIncreaseFunction.class)
public class EnchantedCountIncreaseFunction1322310271Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run_1160962463(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1160962463L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate__1396026334(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1396026334L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1236803301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1236803301L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams__506725215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-506725215L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lootingMultiplier(Lnet/minecraft/core/HolderLookup$Provider;Lnet/minecraft/world/level/storage/loot/providers/number/NumberProvider;)Lnet/minecraft/world/level/storage/loot/functions/EnchantedCountIncreaseFunction$Builder;", cancellable = true)
    private static void lootingMultiplier__659880809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-659880809L))
            info.setReturnValue(null);
    }


}
