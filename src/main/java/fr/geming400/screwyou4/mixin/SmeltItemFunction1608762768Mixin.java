package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.SmeltItemFunction.class)
public class SmeltItemFunction1608762768Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run_1447414960(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1447414960L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__950350804(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-950350804L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "smelted()Lnet/minecraft/world/level/storage/loot/functions/LootItemConditionalFunction$Builder;", cancellable = true)
    private static void smelted__503532953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-503532953L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "smelted(Z)Lnet/minecraft/world/level/storage/loot/functions/LootItemConditionalFunction$Builder;", cancellable = true)
    private static void smelted__978527075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-978527075L))
            info.setReturnValue(null);
    }


}
