package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.FilteredFunction.class)
public class FilteredFunction292632317Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run_131284509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(131284509L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate_1869263008(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1869263008L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_2028486041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2028486041L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "filtered(Lnet/minecraft/advancements/predicates/ItemPredicate;)Lnet/minecraft/world/level/storage/loot/functions/FilteredFunction$Builder;", cancellable = true)
    private static void filtered__1116810170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1116810170L))
            info.setReturnValue(null);
    }


}
