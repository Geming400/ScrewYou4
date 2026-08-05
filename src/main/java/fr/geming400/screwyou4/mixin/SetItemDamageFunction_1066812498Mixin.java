package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.SetItemDamageFunction.class)
public class SetItemDamageFunction_1066812498Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run__1996073476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1996073476L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate_48093726(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(48093726L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_2133257751(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2133257751L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDamage(Lnet/minecraft/world/level/storage/loot/providers/number/NumberProvider;Z)Lnet/minecraft/world/level/storage/loot/functions/LootItemConditionalFunction$Builder;", cancellable = true)
    private static void setDamage__33548448(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-33548448L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDamage(Lnet/minecraft/world/level/storage/loot/providers/number/NumberProvider;)Lnet/minecraft/world/level/storage/loot/functions/LootItemConditionalFunction$Builder;", cancellable = true)
    private static void setDamage_803597542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(803597542L))
            info.setReturnValue(null);
    }


}
