package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.SetRandomPotionFunction.class)
public class SetRandomPotionFunction_111974014Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run_1344055336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1344055336L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromTagKey(Lnet/minecraft/core/HolderSet;)Lnet/minecraft/world/level/storage/loot/functions/LootItemConditionalFunction$Builder;", cancellable = true)
    private static void fromTagKey__893952690(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-893952690L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1178419267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1178419267L))
            info.setReturnValue(null);
    }


}
