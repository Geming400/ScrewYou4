package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.pieces.StructurePieceSerializationContext.class)
public class StructurePieceSerializationContext1709999972Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_801373704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(801373704L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1814543799(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1814543799L))
            info.setReturnValue("lmV/\u9393LW:K#\u6277,;O\u5907RAf:Ao;G5gRk");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2027615233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2027615233L))
            info.setReturnValue(-1499938609);
    }

    @Inject(at = @At("HEAD"), method = "registryAccess()Lnet/minecraft/core/RegistryAccess;", cancellable = true)
    private void registryAccess_655106762(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(655106762L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resourceManager()Lnet/minecraft/server/packs/resources/ResourceManager;", cancellable = true)
    private void resourceManager_457356841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(457356841L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromLevel(Lnet/minecraft/server/level/ServerLevel;)Lnet/minecraft/world/level/levelgen/structure/pieces/StructurePieceSerializationContext;", cancellable = true)
    private static void fromLevel__1200012846(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1200012846L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "structureTemplateManager()Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;", cancellable = true)
    private void structureTemplateManager__1169782801(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1169782801L))
            info.setReturnValue(null);
    }


}
