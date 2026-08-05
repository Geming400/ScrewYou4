package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.FillPlayerHead.class)
public class FillPlayerHead1412779122Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run__1650106851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1650106851L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1815742920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1815742920L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fillPlayerHead(Lnet/minecraft/world/level/storage/loot/LootContext$EntityTarget;)Lnet/minecraft/world/level/storage/loot/functions/LootItemConditionalFunction$Builder;", cancellable = true)
    private static void fillPlayerHead_1575484086(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1575484086L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams__2102684946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2102684946L))
            info.setReturnValue(null);
    }


}
