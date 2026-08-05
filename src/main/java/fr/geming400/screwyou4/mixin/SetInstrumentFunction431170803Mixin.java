package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.SetInstrumentFunction.class)
public class SetInstrumentFunction431170803Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run_1663252126(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1663252126L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1497616057(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1497616057L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setInstrumentOptions(Lnet/minecraft/core/HolderSet;)Lnet/minecraft/world/level/storage/loot/functions/LootItemConditionalFunction$Builder;", cancellable = true)
    private static void setInstrumentOptions__1754465910(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1754465910L))
            info.setReturnValue(null);
    }


}
