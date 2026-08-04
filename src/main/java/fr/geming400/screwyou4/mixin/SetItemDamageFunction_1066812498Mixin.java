package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.SetItemDamageFunction.class)
public class SetItemDamageFunction_1066812498Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run_905464689(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(905464689L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate__1651524108(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1651524108L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1492301075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1492301075L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDamage(Lnet/minecraft/world/level/storage/loot/providers/number/NumberProvider;Z)Lnet/minecraft/world/level/storage/loot/functions/LootItemConditionalFunction$Builder;", cancellable = true)
    private static void setDamage_79447921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(79447921L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDamage(Lnet/minecraft/world/level/storage/loot/providers/number/NumberProvider;)Lnet/minecraft/world/level/storage/loot/functions/LootItemConditionalFunction$Builder;", cancellable = true)
    private static void setDamage__439683403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-439683403L))
            info.setReturnValue(null);
    }


}
