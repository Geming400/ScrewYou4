package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.ExplorationMapFunction.class)
public class ExplorationMapFunction10108959Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run_1242190282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1242190282L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1076554213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1076554213L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "makeExplorationMap()Lnet/minecraft/world/level/storage/loot/functions/ExplorationMapFunction$Builder;", cancellable = true)
    private static void makeExplorationMap__170022143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-170022143L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.functions.ExplorationMapFunction.Builder());
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams_789612187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(789612187L))
            info.setReturnValue(null);
    }


}
