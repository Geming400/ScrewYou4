package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.entries.DynamicLoot.class)
public class DynamicLoot1910000249Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__649113323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-649113323L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createItemStack(Ljava/util/function/Consumer;Lnet/minecraft/world/level/storage/loot/LootContext;)V", cancellable = true)
    private void createItemStack_1830007477(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1830007477L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dynamicEntry(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/world/level/storage/loot/entries/LootPoolSingletonContainer$Builder;", cancellable = true)
    private static void dynamicEntry__1061671338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1061671338L))
            info.setReturnValue(null);
    }


}
