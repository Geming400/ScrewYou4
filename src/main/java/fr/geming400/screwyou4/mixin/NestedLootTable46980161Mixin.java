package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.entries.NestedLootTable.class)
public class NestedLootTable46980161Mixin {
        @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate__971738610(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-971738610L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1113425415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1113425415L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createItemStack(Ljava/util/function/Consumer;Lnet/minecraft/world/level/storage/loot/LootContext;)V", cancellable = true)
    private void createItemStack_1717762390(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1717762390L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "inlineLootTable(Lnet/minecraft/world/level/storage/loot/LootTable;)Lnet/minecraft/world/level/storage/loot/entries/LootPoolSingletonContainer$Builder;", cancellable = true)
    private static void inlineLootTable_1750498729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1750498729L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lootTableReference(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/level/storage/loot/entries/LootPoolSingletonContainer$Builder;", cancellable = true)
    private static void lootTableReference__620883073(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-620883073L))
            info.setReturnValue(null);
    }


}
