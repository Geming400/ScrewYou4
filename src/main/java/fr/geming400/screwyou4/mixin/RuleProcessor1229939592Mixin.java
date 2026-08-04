package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.templatesystem.RuleProcessor.class)
public class RuleProcessor1229939592Mixin {
        @Inject(at = @At("HEAD"), method = "processBlock(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplate$StructureBlockInfo;Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;)Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplate$StructureBlockInfo;", cancellable = true)
    private void processBlock_1340923274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1340923274L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1329173980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1329173980L))
            info.setReturnValue(null);
    }


}
