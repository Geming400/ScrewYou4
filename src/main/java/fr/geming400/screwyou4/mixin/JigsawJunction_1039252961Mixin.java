package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.pools.JigsawJunction.class)
public class JigsawJunction_1039252961Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_130626196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(130626196L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1809675989(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1809675989L))
            info.setReturnValue("33FU|1rHtj:,%SC}p2p)`ez[i{ fyb6CX Y\uFD35`K-F7\u84BB(WK\u096CgGtTDYU");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1596604555(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1596604555L))
            info.setReturnValue(538841091);
    }

    @Inject(at = @At("HEAD"), method = "serialize(Lcom/mojang/serialization/DynamicOps;)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private void serialize__94162233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-94162233L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSourceX()I", cancellable = true)
    private void getSourceX__230603585(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-230603585L))
            info.setReturnValue(-1277607870);
    }

    @Inject(at = @At("HEAD"), method = "getSourceZ()I", cancellable = true)
    private void getSourceZ__173345283(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-173345283L))
            info.setReturnValue(-862433379);
    }

    @Inject(at = @At("HEAD"), method = "getSourceGroundY()I", cancellable = true)
    private void getSourceGroundY_744950021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(744950021L))
            info.setReturnValue(-85399808);
    }

    @Inject(at = @At("HEAD"), method = "getDeltaY()I", cancellable = true)
    private void getDeltaY__429769841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-429769841L))
            info.setReturnValue(716504313);
    }

    @Inject(at = @At("HEAD"), method = "getDestProjection()Lnet/minecraft/world/level/levelgen/structure/pools/StructureTemplatePool$Projection;", cancellable = true)
    private void getDestProjection__1252312360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1252312360L))
            info.setReturnValue(net.minecraft.world.level.levelgen.structure.pools.StructureTemplatePool.Projection.TERRAIN_MATCHING);
    }

    @Inject(at = @At("HEAD"), method = "deserialize(Lcom/mojang/serialization/Dynamic;)Lnet/minecraft/world/level/levelgen/structure/pools/JigsawJunction;", cancellable = true)
    private static void deserialize_1418970251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1418970251L))
            info.setReturnValue(null);
    }


}
