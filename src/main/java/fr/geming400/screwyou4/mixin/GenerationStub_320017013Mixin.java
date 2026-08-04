package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.Structure.GenerationStub.class)
public class GenerationStub_320017013Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1705529271(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1705529271L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__815442963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-815442963L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_358279754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(358279754L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "position()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void position__1573369867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1573369867L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generator()Lcom/mojang/datafixers/util/Either;", cancellable = true)
    private void generator_1143292299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1143292299L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPiecesBuilder()Lnet/minecraft/world/level/levelgen/structure/pieces/StructurePiecesBuilder;", cancellable = true)
    private void getPiecesBuilder_2019256280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2019256280L))
            info.setReturnValue(null);
    }


}
