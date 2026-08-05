package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.entries.NestedLootTable.class)
public class NestedLootTable46980161Mixin {
        @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate_1623610852(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1623610852L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "inlineLootTable(Lnet/minecraft/world/level/storage/loot/LootTable;)Lnet/minecraft/world/level/storage/loot/entries/LootPoolSingletonContainer$Builder;", cancellable = true)
    private static void inlineLootTable__786732426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-786732426L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lootTableReference(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/level/storage/loot/entries/LootPoolSingletonContainer$Builder;", cancellable = true)
    private static void lootTableReference_913461530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(913461530L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1782833885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1782833885L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createItemStack(Ljava/util/function/Consumer;Lnet/minecraft/world/level/storage/loot/LootContext;)V", cancellable = true)
    private void createItemStack__33012611(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-33012611L))
            info.cancel();
    }


}
