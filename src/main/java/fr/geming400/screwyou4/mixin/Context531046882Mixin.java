package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.pieces.PieceGenerator.Context.class)
public class Context531046882Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__377579386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-377579386L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1301470407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1301470407L))
            info.setReturnValue("qeA\u58504>}7B8afw`fw0\u3586EgZ.\u555Ak\u291E.>$twxMLZsM\u67C1Cmn\u63C68W\u3CB0co.\"I[:I2ZJXG[i3bK_\u6228U]\"oL$Voc!cB\u0E28hkIswK?%p\u6745iqm9G");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1088398973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1088398973L))
            info.setReturnValue(-1598904664);
    }

    @Inject(at = @At("HEAD"), method = "seed()J", cancellable = true)
    private void seed_1107135416(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1107135416L))
            info.setReturnValue(-736521652903933138L);
    }

    @Inject(at = @At("HEAD"), method = "config()Lnet/minecraft/world/level/levelgen/feature/configurations/FeatureConfiguration;", cancellable = true)
    private void config__1171028160(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1171028160L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "random()Lnet/minecraft/world/level/levelgen/WorldgenRandom;", cancellable = true)
    private void random_453914139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(453914139L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chunkPos()Lnet/minecraft/world/level/ChunkPos;", cancellable = true)
    private void chunkPos__1334574796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1334574796L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "heightAccessor()Lnet/minecraft/world/level/LevelHeightAccessor;", cancellable = true)
    private void heightAccessor_1259788994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1259788994L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chunkGenerator()Lnet/minecraft/world/level/chunk/ChunkGenerator;", cancellable = true)
    private void chunkGenerator__1168265166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1168265166L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "structureTemplateManager()Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;", cancellable = true)
    private void structureTemplateManager_1946231405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1946231405L))
            info.setReturnValue(null);
    }


}
