package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.pools.JigsawPlacement.class)
public class JigsawPlacement1847681686Mixin {
        @Inject(at = @At("HEAD"), method = "generateJigsaw(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/Holder;Lnet/minecraft/resources/Identifier;ILnet/minecraft/core/BlockPos;Z)Z", cancellable = true)
    private static void generateJigsaw_101230488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(101230488L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "addPieces(Lnet/minecraft/world/level/levelgen/structure/Structure$GenerationContext;Lnet/minecraft/core/Holder;Ljava/util/Optional;ILnet/minecraft/core/BlockPos;ZLjava/util/Optional;Lnet/minecraft/world/level/levelgen/structure/structures/JigsawStructure$MaxDistance;Lnet/minecraft/world/level/levelgen/structure/pools/alias/PoolAliasLookup;Lnet/minecraft/world/level/levelgen/structure/pools/DimensionPadding;Lnet/minecraft/world/level/levelgen/structure/templatesystem/LiquidSettings;)Ljava/util/Optional;", cancellable = true)
    private static void addPieces_2061869391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2061869391L))
            info.setReturnValue(null);
    }


}
