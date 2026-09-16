package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.templatesystem.CappedProcessor.class)
public class CappedProcessor_1678579737Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1549942306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1549942306L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "evaluatesEntirePieceState()Z", cancellable = true)
    private void evaluatesEntirePieceState__1952433471(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1952433471L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "finalizeProcessing(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;Ljava/util/List;Ljava/util/List;Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;)Ljava/util/List;", cancellable = true)
    private void finalizeProcessing_1514454021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1514454021L))
            info.setReturnValue(null);
    }


}
