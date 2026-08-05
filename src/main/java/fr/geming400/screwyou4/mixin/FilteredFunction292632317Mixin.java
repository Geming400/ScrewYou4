package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.FilteredFunction.class)
public class FilteredFunction292632317Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run_1524713640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1524713640L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate__726086454(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-726086454L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "filtered(Lnet/minecraft/advancements/predicates/ItemPredicate;)Lnet/minecraft/world/level/storage/loot/functions/FilteredFunction$Builder;", cancellable = true)
    private static void filtered__1971758371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1971758371L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1359077571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1359077571L))
            info.setReturnValue(null);
    }


}
