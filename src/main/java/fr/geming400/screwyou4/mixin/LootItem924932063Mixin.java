package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.entries.LootItem.class)
public class LootItem924932063Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1634181509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1634181509L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createItemStack(Ljava/util/function/Consumer;Lnet/minecraft/world/level/storage/loot/LootContext;)V", cancellable = true)
    private void createItemStack_844939291(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(844939291L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "lootTableItem(Lnet/minecraft/world/level/ItemLike;)Lnet/minecraft/world/level/storage/loot/entries/LootPoolSingletonContainer$Builder;", cancellable = true)
    private static void lootTableItem__2059221987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2059221987L))
            info.setReturnValue(null);
    }


}
