package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.LimitCount.class)
public class LimitCount_1777126590Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run_1615778781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1615778781L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate__941210016(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-941210016L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__781986983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-781986983L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "limitCount(Lnet/minecraft/world/level/storage/loot/IntRange;)Lnet/minecraft/world/level/storage/loot/functions/LootItemConditionalFunction$Builder;", cancellable = true)
    private static void limitCount__240201982(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-240201982L))
            info.setReturnValue(null);
    }


}
