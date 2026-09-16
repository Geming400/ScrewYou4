package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.LimitCount.class)
public class LimitCount_1777126590Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run__1285759384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1285759384L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate_758407818(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(758407818L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1451395453(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1451395453L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "limitCount(Lnet/minecraft/world/level/storage/loot/IntRange;)Lnet/minecraft/world/level/storage/loot/functions/LootItemConditionalFunction$Builder;", cancellable = true)
    private static void limitCount__664303506(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-664303506L))
            info.setReturnValue(null);
    }


}
