package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.entries.LootItem.class)
public class LootItem924932063Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1991377317(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1991377317L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createItemStack(Ljava/util/function/Consumer;Lnet/minecraft/world/level/storage/loot/LootContext;)V", cancellable = true)
    private void createItemStack__1699253004(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1699253004L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "lootTableItem(Lnet/minecraft/world/level/ItemLike;)Lnet/minecraft/world/level/storage/loot/entries/LootPoolSingletonContainer$Builder;", cancellable = true)
    private static void lootTableItem__1491654076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1491654076L))
            info.setReturnValue(null);
    }


}
