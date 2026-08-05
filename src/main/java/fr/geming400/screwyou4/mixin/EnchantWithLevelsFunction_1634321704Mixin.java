package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.EnchantWithLevelsFunction.class)
public class EnchantWithLevelsFunction_1634321704Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run__1428564270(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1428564270L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate_615602932(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(615602932L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1594200339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1594200339L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enchantWithLevels(Lnet/minecraft/core/HolderLookup$Provider;Lnet/minecraft/world/level/storage/loot/providers/number/NumberProvider;)Lnet/minecraft/world/level/storage/loot/functions/EnchantWithLevelsFunction$Builder;", cancellable = true)
    private static void enchantWithLevels_508415930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(508415930L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams__1881142365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1881142365L))
            info.setReturnValue(null);
    }


}
