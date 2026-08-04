package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.pieces.PiecesContainer.class)
public class PiecesContainer_1469131682Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1440323356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1440323356L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_333671706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(333671706L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1507394423(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1507394423L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "load(Lnet/minecraft/nbt/ListTag;Lnet/minecraft/world/level/levelgen/structure/pieces/StructurePieceSerializationContext;)Lnet/minecraft/world/level/levelgen/structure/pieces/PiecesContainer;", cancellable = true)
    private static void load__519978476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-519978476L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1507410264(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1507410264L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "save(Lnet/minecraft/world/level/levelgen/structure/pieces/StructurePieceSerializationContext;)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void save__427039236(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-427039236L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pieces()Ljava/util/List;", cancellable = true)
    private void pieces__1199498799(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1199498799L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isInsidePiece(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void isInsidePiece_1637902124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1637902124L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "calculateBoundingBox()Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private void calculateBoundingBox_1639279467(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1639279467L))
            info.setReturnValue(null);
    }


}
