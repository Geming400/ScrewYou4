package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.FillPlayerHead.class)
public class FillPlayerHead1412779122Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run_1251431314(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1251431314L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fillPlayerHead(Lnet/minecraft/world/level/storage/loot/LootContext$EntityTarget;)Lnet/minecraft/world/level/storage/loot/functions/LootItemConditionalFunction$Builder;", cancellable = true)
    private static void fillPlayerHead_1255936890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1255936890L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1146334450(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1146334450L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams__416256364(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-416256364L))
            info.setReturnValue(null);
    }


}
