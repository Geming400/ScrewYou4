package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.SetContainerLootTable.class)
public class SetContainerLootTable164278553Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run_2930745(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2930745L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate_1740909244(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1740909244L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1900132277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1900132277L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withLootTable(Lnet/minecraft/world/level/block/entity/BlockEntityType;Lnet/minecraft/resources/ResourceKey;J)Lnet/minecraft/world/level/storage/loot/functions/LootItemConditionalFunction$Builder;", cancellable = true)
    private static void withLootTable_404302119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(404302119L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withLootTable(Lnet/minecraft/world/level/block/entity/BlockEntityType;Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/level/storage/loot/functions/LootItemConditionalFunction$Builder;", cancellable = true)
    private static void withLootTable_1259989215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1259989215L))
            info.setReturnValue(null);
    }


}
