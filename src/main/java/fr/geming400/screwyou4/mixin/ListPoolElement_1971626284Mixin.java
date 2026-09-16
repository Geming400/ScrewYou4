package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.pools.ListPoolElement.class)
public class ListPoolElement_1971626284Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1552917984(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1552917984L))
            info.setReturnValue("\u2AFCd\u21E8ZfRP1Dhn\u3C824P'@&PfWnI#Oh^\uC7A9\uA826fC{]),x;");
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/level/levelgen/structure/pools/StructurePoolElementType;", cancellable = true)
    private void getType_1763821949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1763821949L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSize(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void getSize_2086139427(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2086139427L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBoundingBox(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private void getBoundingBox__407583543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-407583543L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setProjection(Lnet/minecraft/world/level/levelgen/structure/pools/StructureTemplatePool$Projection;)Lnet/minecraft/world/level/levelgen/structure/pools/StructurePoolElement;", cancellable = true)
    private void setProjection__626181942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-626181942L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getShuffledJigsawBlocks(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Rotation;Lnet/minecraft/util/RandomSource;)Ljava/util/List;", cancellable = true)
    private void getShuffledJigsawBlocks_413804734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(413804734L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getElements()Ljava/util/List;", cancellable = true)
    private void getElements_1099240776(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1099240776L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/chunk/ChunkGenerator;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Rotation;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/templatesystem/LiquidSettings;Z)Z", cancellable = true)
    private void place_661764201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(661764201L))
            info.setReturnValue(true);
    }


}
