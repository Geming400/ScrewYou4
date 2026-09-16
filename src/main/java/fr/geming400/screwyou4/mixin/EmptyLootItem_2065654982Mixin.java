package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.entries.EmptyLootItem.class)
public class EmptyLootItem_2065654982Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1162867061(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1162867061L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createItemStack(Ljava/util/function/Consumer;Lnet/minecraft/world/level/storage/loot/LootContext;)V", cancellable = true)
    private void createItemStack__558530086(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-558530086L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "emptyItem()Lnet/minecraft/world/level/storage/loot/entries/LootPoolSingletonContainer$Builder;", cancellable = true)
    private static void emptyItem_672086042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(672086042L))
            info.setReturnValue(null);
    }


}
