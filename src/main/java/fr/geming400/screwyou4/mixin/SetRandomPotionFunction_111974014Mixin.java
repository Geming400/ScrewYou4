package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.SetRandomPotionFunction.class)
public class SetRandomPotionFunction_111974014Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run__49373795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-49373795L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1847827737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1847827737L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromTagKey(Lnet/minecraft/core/HolderSet;)Lnet/minecraft/world/level/storage/loot/functions/LootItemConditionalFunction$Builder;", cancellable = true)
    private static void fromTagKey__168687201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-168687201L))
            info.setReturnValue(null);
    }


}
