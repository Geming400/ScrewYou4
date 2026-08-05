package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.SetAttributesFunction.class)
public class SetAttributesFunction1726963299Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run_1565615491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1565615491L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate__991373306(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-991373306L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "modifier(Lnet/minecraft/resources/Identifier;Lnet/minecraft/core/Holder;Lnet/minecraft/world/entity/ai/attributes/AttributeModifier$Operation;Lnet/minecraft/world/level/storage/loot/providers/number/NumberProvider;)Lnet/minecraft/world/level/storage/loot/functions/SetAttributesFunction$ModifierBuilder;", cancellable = true)
    private static void modifier__439417212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-439417212L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setAttributes()Lnet/minecraft/world/level/storage/loot/functions/SetAttributesFunction$Builder;", cancellable = true)
    private static void setAttributes_1963468492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1963468492L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.functions.SetAttributesFunction.Builder());
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__832150273(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-832150273L))
            info.setReturnValue(null);
    }


}
