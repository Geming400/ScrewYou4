package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.SetEnchantmentsFunction.class)
public class SetEnchantmentsFunction469671912Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run_1701753235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1701753235L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate__549046859(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-549046859L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1536117166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1536117166L))
            info.setReturnValue(null);
    }


}
