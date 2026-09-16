package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.SetItemCountFunction.class)
public class SetItemCountFunction_818376288Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run_2050457610(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2050457610L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate__200342484(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-200342484L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setCount(Lnet/minecraft/world/level/storage/loot/providers/number/NumberProvider;Z)Lnet/minecraft/world/level/storage/loot/functions/LootItemConditionalFunction$Builder;", cancellable = true)
    private static void setCount_546616466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(546616466L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setCount(Lnet/minecraft/world/level/storage/loot/providers/number/NumberProvider;)Lnet/minecraft/world/level/storage/loot/functions/LootItemConditionalFunction$Builder;", cancellable = true)
    private static void setCount_27701072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(27701072L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1884821541(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1884821541L))
            info.setReturnValue(null);
    }


}
