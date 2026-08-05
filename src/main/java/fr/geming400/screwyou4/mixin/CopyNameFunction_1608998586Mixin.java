package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.CopyNameFunction.class)
public class CopyNameFunction_1608998586Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run_1447650777(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1447650777L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__950114987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-950114987L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams__220036901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-220036901L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copyName(Lnet/minecraft/world/level/storage/loot/LootContextArg;)Lnet/minecraft/world/level/storage/loot/functions/LootItemConditionalFunction$Builder;", cancellable = true)
    private static void copyName_125776863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(125776863L))
            info.setReturnValue(null);
    }


}
