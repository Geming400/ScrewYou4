package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.pools.JigsawJunction.class)
public class JigsawJunction_1039252961Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1870202573(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1870202573L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__96207511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-96207511L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1077515206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1077515206L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSourceX()I", cancellable = true)
    private void getSourceX_1077515206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1077515206L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSourceZ()I", cancellable = true)
    private void getSourceZ_1077515206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1077515206L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSourceGroundY()I", cancellable = true)
    private void getSourceGroundY_1077515206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1077515206L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deserialize(Lcom/mojang/serialization/Dynamic;)Lnet/minecraft/world/level/levelgen/structure/pools/JigsawJunction;", cancellable = true)
    private static void deserialize__906466006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-906466006L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDestProjection()Lnet/minecraft/world/level/levelgen/structure/pools/StructureTemplatePool$Projection;", cancellable = true)
    private void getDestProjection_371317887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(371317887L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serialize(Lcom/mojang/serialization/DynamicOps;)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private void serialize__596073049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-596073049L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDeltaY()I", cancellable = true)
    private void getDeltaY_1077515206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1077515206L))
            info.setReturnValue(null);
    }


}
