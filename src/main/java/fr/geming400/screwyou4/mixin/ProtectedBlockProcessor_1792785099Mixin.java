package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.templatesystem.ProtectedBlockProcessor.class)
public class ProtectedBlockProcessor_1792785099Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_884158830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(884158830L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1731758673(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1731758673L))
            info.setReturnValue("\u36A0\u464A.;{,Dr$\u0B26P><`ip' uJx,%\u5910k_PG\uC8F7j8");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1944830107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1944830107L))
            info.setReturnValue(-1681064371);
    }

    @Inject(at = @At("HEAD"), method = "processBlock(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplate$StructureBlockInfo;Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;)Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplate$StructureBlockInfo;", cancellable = true)
    private void processBlock_720920234(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(720920234L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1435736944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1435736944L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cannotReplace()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void cannotReplace__674673585(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-674673585L))
            info.setReturnValue(null);
    }


}
