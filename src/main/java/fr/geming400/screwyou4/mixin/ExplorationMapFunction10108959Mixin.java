package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.ExplorationMapFunction.class)
public class ExplorationMapFunction10108959Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run__151238849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-151238849L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "makeExplorationMap()Lnet/minecraft/world/level/storage/loot/functions/ExplorationMapFunction$Builder;", cancellable = true)
    private static void makeExplorationMap__565968280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-565968280L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1745962683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1745962683L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams__1818926527(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1818926527L))
            info.setReturnValue(null);
    }


}
