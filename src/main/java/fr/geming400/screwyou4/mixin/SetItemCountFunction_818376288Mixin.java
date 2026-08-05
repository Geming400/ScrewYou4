package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.SetItemCountFunction.class)
public class SetItemCountFunction_818376288Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run_657028479(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(657028479L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate__1899960318(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1899960318L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1740737285(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1740737285L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setCount(Lnet/minecraft/world/level/storage/loot/providers/number/NumberProvider;Z)Lnet/minecraft/world/level/storage/loot/functions/LootItemConditionalFunction$Builder;", cancellable = true)
    private static void setCount__168988289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-168988289L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setCount(Lnet/minecraft/world/level/storage/loot/providers/number/NumberProvider;)Lnet/minecraft/world/level/storage/loot/functions/LootItemConditionalFunction$Builder;", cancellable = true)
    private static void setCount__688119613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-688119613L))
            info.setReturnValue(null);
    }


}
