package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.Structure.GenerationStub.class)
public class GenerationStub_320017013Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__588609256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-588609256L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1090440537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1090440537L))
            info.setReturnValue("-F'[ %P:3nN\uD144tB\u4C87qQoOu` \uB074\u43F6\uC5BEaA%.c7S");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_877369103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(877369103L))
            info.setReturnValue(933233889);
    }

    @Inject(at = @At("HEAD"), method = "position()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void position__1775028244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1775028244L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generator()Lcom/mojang/datafixers/util/Either;", cancellable = true)
    private void generator_1516171096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1516171096L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPiecesBuilder()Lnet/minecraft/world/level/levelgen/structure/pieces/StructurePiecesBuilder;", cancellable = true)
    private void getPiecesBuilder_524996792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(524996792L))
            info.setReturnValue(new net.minecraft.world.level.levelgen.structure.pieces.StructurePiecesBuilder());
    }


}
