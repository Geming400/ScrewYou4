package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.SetEnchantmentsFunction.class)
public class SetEnchantmentsFunction469671912Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run_308324104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(308324104L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate_2046302603(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2046302603L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__2089441660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2089441660L))
            info.setReturnValue(null);
    }


}
