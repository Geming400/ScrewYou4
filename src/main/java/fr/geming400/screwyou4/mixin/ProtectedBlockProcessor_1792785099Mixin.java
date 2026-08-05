package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.templatesystem.ProtectedBlockProcessor.class)
public class ProtectedBlockProcessor_1792785099Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1116669939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1116669939L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_657325123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(657325123L))
            info.setReturnValue(":HNE\u1B21V\u21D0\uBDE86_]J\uB6A9@!b\u00D5KQP(*B4e$\u02D4cxu}v*\uA3E7 YcLUE7I:hMn[\u4A66ls\u3C02O\u9419*u$<_D\u87DA*S>N_D'");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1831047840(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1831047840L))
            info.setReturnValue(890415192);
    }

    @Inject(at = @At("HEAD"), method = "processBlock(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplate$StructureBlockInfo;Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;)Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplate$StructureBlockInfo;", cancellable = true)
    private void processBlock_1903768780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1903768780L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__766328474(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-766328474L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cannotReplace()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void cannotReplace__882229154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-882229154L))
            info.setReturnValue(null);
    }


}
