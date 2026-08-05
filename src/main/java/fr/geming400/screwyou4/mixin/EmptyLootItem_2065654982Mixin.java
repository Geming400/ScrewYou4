package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.entries.EmptyLootItem.class)
public class EmptyLootItem_2065654982Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__493458591(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-493458591L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createItemStack(Ljava/util/function/Consumer;Lnet/minecraft/world/level/storage/loot/LootContext;)V", cancellable = true)
    private void createItemStack_1985662209(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1985662209L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "emptyItem()Lnet/minecraft/world/level/storage/loot/entries/LootPoolSingletonContainer$Builder;", cancellable = true)
    private static void emptyItem_870186522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(870186522L))
            info.setReturnValue(null);
    }


}
