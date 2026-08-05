package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.SetComponentsFunction.class)
public class SetComponentsFunction1857836386Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run_1696488578(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1696488578L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__701277186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-701277186L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setComponent(Lnet/minecraft/core/component/DataComponentType;Ljava/lang/Object;)Lnet/minecraft/world/level/storage/loot/functions/LootItemConditionalFunction$Builder;", cancellable = true)
    private static void setComponent_1408931021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1408931021L))
            info.setReturnValue(null);
    }


}
