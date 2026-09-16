package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.CopyNameFunction.class)
public class CopyNameFunction_1608998586Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run__1453887388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1453887388L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1619523457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1619523457L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copyName(Lnet/minecraft/world/level/storage/loot/LootContextArg;)Lnet/minecraft/world/level/storage/loot/functions/LootItemConditionalFunction$Builder;", cancellable = true)
    private static void copyName_568527935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(568527935L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams__1906465483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1906465483L))
            info.setReturnValue(null);
    }


}
