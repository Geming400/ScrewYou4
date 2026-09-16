package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.SetContainerLootTable.class)
public class SetContainerLootTable164278553Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run_1396359876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1396359876L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate__854440218(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-854440218L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1230723807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1230723807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withLootTable(Lnet/minecraft/world/level/block/entity/BlockEntityType;Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/level/storage/loot/functions/LootItemConditionalFunction$Builder;", cancellable = true)
    private static void withLootTable_1165209855(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1165209855L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withLootTable(Lnet/minecraft/world/level/block/entity/BlockEntityType;Lnet/minecraft/resources/ResourceKey;J)Lnet/minecraft/world/level/storage/loot/functions/LootItemConditionalFunction$Builder;", cancellable = true)
    private static void withLootTable_1761109255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1761109255L))
            info.setReturnValue(null);
    }


}
