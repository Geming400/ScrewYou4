package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.pieces.StructurePieceSerializationContext.class)
public class StructurePieceSerializationContext1709999972Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1199455065(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1199455065L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_574539997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(574539997L))
            info.setReturnValue("b1쓦ggH1E2STb揬p0B詊*㈼;g/");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1748262714(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1748262714L))
            info.setReturnValue(1359062755);
    }

    @Inject(at = @At("HEAD"), method = "registryAccess()Lnet/minecraft/core/RegistryAccess;", cancellable = true)
    private void registryAccess_1719476715(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1719476715L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resourceManager()Lnet/minecraft/server/packs/resources/ResourceManager;", cancellable = true)
    private void resourceManager__1740121302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1740121302L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "structureTemplateManager()Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;", cancellable = true)
    private void structureTemplateManager__461157361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-461157361L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromLevel(Lnet/minecraft/server/level/ServerLevel;)Lnet/minecraft/world/level/levelgen/structure/pieces/StructurePieceSerializationContext;", cancellable = true)
    private static void fromLevel__2018402088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2018402088L))
            info.setReturnValue(null);
    }


}
