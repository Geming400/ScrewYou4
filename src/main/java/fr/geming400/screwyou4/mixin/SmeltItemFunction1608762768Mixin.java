package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.SmeltItemFunction.class)
public class SmeltItemFunction1608762768Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run__1454123205(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1454123205L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "smelted(Z)Lnet/minecraft/world/level/storage/loot/functions/LootItemConditionalFunction$Builder;", cancellable = true)
    private static void smelted__1937306261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1937306261L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "smelted()Lnet/minecraft/world/level/storage/loot/functions/LootItemConditionalFunction$Builder;", cancellable = true)
    private static void smelted__1781387303(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1781387303L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1619759274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1619759274L))
            info.setReturnValue(null);
    }


}
