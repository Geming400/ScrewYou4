package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.entries.DynamicLoot.class)
public class DynamicLoot1910000249Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1318521793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1318521793L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createItemStack(Ljava/util/function/Consumer;Lnet/minecraft/world/level/storage/loot/LootContext;)V", cancellable = true)
    private void createItemStack__714184818(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-714184818L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dynamicEntry(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/world/level/storage/loot/entries/LootPoolSingletonContainer$Builder;", cancellable = true)
    private static void dynamicEntry_2072525571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2072525571L))
            info.setReturnValue(null);
    }


}
