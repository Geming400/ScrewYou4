package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.SetPotionFunction.class)
public class SetPotionFunction444603807Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run_1676685130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1676685130L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1511049061(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1511049061L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setPotion(Lnet/minecraft/core/Holder;)Lnet/minecraft/world/level/storage/loot/functions/LootItemConditionalFunction$Builder;", cancellable = true)
    private static void setPotion_1639265426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1639265426L))
            info.setReturnValue(null);
    }


}
